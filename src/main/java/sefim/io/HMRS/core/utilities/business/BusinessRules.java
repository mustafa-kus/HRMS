package sefim.io.HMRS.core.utilities.business;

import sefim.io.HMRS.core.adapters.MernisAdapter;
import sefim.io.HMRS.core.utilities.results.ErrorResult;
import sefim.io.HMRS.core.utilities.results.Result;
import sefim.io.HMRS.core.utilities.results.SuccessResult;
import sefim.io.HMRS.entities.concretes.Candidate;
import sefim.io.HMRS.entities.concretes.Employer;

public class BusinessRules {
	public static boolean candidateCheckService(Candidate candidate) {
		MernisAdapter adapter=new MernisAdapter();
			if(adapter.checkRealPerson(candidate)) {
				if(candidate.getPassword().length()>=6) {
					return true;
				}
			}
		return false;
	}
	
	public static Result isEmptyEmployer(Employer employer) {
		if (employer.getUrl()==null||employer.getEmail()==null||employer.getCampanyName()==null||employer.getPhone()==null||employer.getPassword()==null) {
			return new ErrorResult("Alanlar boş bırakılmaz.");
		}
		return new SuccessResult();
		
	}
}
