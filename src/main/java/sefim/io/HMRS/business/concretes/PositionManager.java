package sefim.io.HMRS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sefim.io.HMRS.business.abstracts.PositionService;
import sefim.io.HMRS.core.utilities.results.DataResult;
import sefim.io.HMRS.core.utilities.results.ErrorResult;
import sefim.io.HMRS.core.utilities.results.Result;
import sefim.io.HMRS.core.utilities.results.SuccessDataResult;
import sefim.io.HMRS.core.utilities.results.SuccessResult;
import sefim.io.HMRS.dataAccess.abstracts.PositionDao;
import sefim.io.HMRS.entities.concretes.Position;

@Service
public class PositionManager implements PositionService {
	private PositionDao positionDao;
	@Autowired
	public PositionManager(PositionDao positionDao) {
		
		this.positionDao = positionDao;
	}

	@Override
	public DataResult<List<Position>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Position>>(positionDao.findAll(),"İş pozisyonları listelendi");
	}

	@Override
	public Result add(Position position) {
		if (checkAlreadyExistPosition(position)) {
			positionDao.save(position);
			
			
			return new SuccessResult("Yeni Pozisyon Ekleme başarılı");
		}
		return new ErrorResult("Yeni Pozisyon Ekleme yapılmadı lütfen daha önceden girilmemiş bir meslek kolu seçin");
		
	}
	private boolean checkAlreadyExistPosition(Position position) {
		
		List<Position> result=positionDao.findAll();
		for (Position position2 : result) {
			if (position.getPosition().equals(position2.getPosition())) {
				return false;
			}
		}
		return true;
	}
}
