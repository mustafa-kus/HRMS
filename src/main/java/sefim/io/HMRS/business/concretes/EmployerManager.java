package sefim.io.HMRS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sefim.io.HMRS.business.abstracts.EmployerService;
import sefim.io.HMRS.core.utilities.business.BusinessRules;
import sefim.io.HMRS.core.utilities.results.DataResult;
import sefim.io.HMRS.core.utilities.results.ErrorResult;
import sefim.io.HMRS.core.utilities.results.Result;
import sefim.io.HMRS.core.utilities.results.SuccessDataResult;
import sefim.io.HMRS.core.utilities.results.SuccessResult;
import sefim.io.HMRS.dataAccess.abstracts.EmployerDao;
import sefim.io.HMRS.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService{
	private EmployerDao employerDao;
	
	@Autowired
	public EmployerManager(EmployerDao employerDao) {		
		this.employerDao = employerDao;
	}

	@Override
	public DataResult<List<Employer>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Employer>>(employerDao.findAll(),"İşverenler listelendi");
	}

	@Override
	public Result add(Employer employer) {
		// TODO Auto-generated method stub
		Result result=BusinessRules.isEmptyEmployer(employer);
		if(result.isSuccess()) {
			if (checkAlreadyUser(employer)) {
				return new SuccessResult("Ekleme başarılı");
			}
		}
		return new ErrorResult("Ekleme başarısız.");
	}
	
	private boolean checkAlreadyUser(Employer employer) {
		List<Employer> employerList=employerDao.findAll();
		
		for (Employer currentlyEmployer : employerList) {
			if (employer.getEmail().equals(currentlyEmployer.getEmail())) {
				return false;
			}
		}
		return true;
	}
	
}
