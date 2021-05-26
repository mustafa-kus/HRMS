package sefim.io.HMRS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sefim.io.HMRS.business.abstracts.CandidateService;
import sefim.io.HMRS.core.utilities.business.BusinessRules;
import sefim.io.HMRS.core.utilities.results.DataResult;
import sefim.io.HMRS.core.utilities.results.ErrorResult;
import sefim.io.HMRS.core.utilities.results.Result;
import sefim.io.HMRS.core.utilities.results.SuccessDataResult;
import sefim.io.HMRS.core.utilities.results.SuccessResult;
import sefim.io.HMRS.dataAccess.abstracts.CandidateDao;
import sefim.io.HMRS.entities.concretes.Candidate;

@Service
public class CandidateManager implements CandidateService {
	private CandidateDao candidateDao;
	
	@Autowired
	public CandidateManager(CandidateDao candidateDao) {
		this.candidateDao = candidateDao;
	}

	@Override
	public DataResult<List<Candidate>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Candidate>>(candidateDao.findAll(),"İş arayanlar listelendi");
	}

	@Override
	public Result add(Candidate candidate) {
		// TODO Auto-generated method stub
		boolean control=checkAlreadyExist(candidate);
		if (control) {
			boolean result=BusinessRules.candidateCheckService(candidate);
			if (result) {
				candidateDao.save(candidate);
				return new SuccessResult("İş arayan kişi eklendi");
			}
		}
		return new ErrorResult("Ekleme başarısız");
		
	}
	
	
	private boolean checkAlreadyExist(Candidate candidate) {
		List<Candidate> result=candidateDao.findAll();
		for (Candidate candidate2 : result) {
			if(candidate2.getEmail().equals(candidate.getEmail())) {
				return false;
			}
			if(candidate2.getNationalId().equals(candidate.getNationalId())) {
				return false;
			}
		}
		return true;
	}

}
