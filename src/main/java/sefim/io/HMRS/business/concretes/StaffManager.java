package sefim.io.HMRS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sefim.io.HMRS.business.abstracts.StaffService;
import sefim.io.HMRS.core.utilities.results.DataResult;
import sefim.io.HMRS.core.utilities.results.ErrorResult;
import sefim.io.HMRS.core.utilities.results.Result;
import sefim.io.HMRS.core.utilities.results.SuccessDataResult;
import sefim.io.HMRS.core.utilities.results.SuccessResult;
import sefim.io.HMRS.dataAccess.abstracts.StaffDao;
import sefim.io.HMRS.entities.concretes.Candidate;
import sefim.io.HMRS.entities.concretes.Staff;

@Service
public class StaffManager implements StaffService {
	private StaffDao staffDao;
	
	@Autowired
	public StaffManager(StaffDao staffDao) {
		this.staffDao = staffDao;
	}
	
	@Override
	public DataResult<List<Staff>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Staff>>(staffDao.findAll(),"Personeller listelendi");
	}
	

	@Override
	public Result add(Staff staff) {
		// TODO Auto-generated method stub
		if (this.staffDao.save(staff)!=null)
			return new SuccessResult("Personel eklendi");
		else 
			return new ErrorResult("Personel eklenemedi");
	}

}
