package sefim.io.HMRS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sefim.io.HMRS.business.abstracts.MemberTypeService;
import sefim.io.HMRS.dataAccess.abstracts.MemberTypesDao;
import sefim.io.HMRS.entities.concretes.MemberTypes;

@Service
public class MemberTypeManager implements MemberTypeService {
	private MemberTypesDao memberTypeDao;
	
	@Autowired
	public MemberTypeManager(MemberTypesDao memberTypeDao) {
		
		this.memberTypeDao = memberTypeDao;
	}
	@Override
	public List<MemberTypes> getAll() {
		// TODO Auto-generated method stub
		return this.memberTypeDao.findAll();
	}

}
