package sefim.io.HMRS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sefim.io.HMRS.business.abstracts.UserService;
import sefim.io.HMRS.dataAccess.abstracts.UserDao;
import sefim.io.HMRS.entities.concretes.User;

@Service
public class UserManager implements UserService {
	private UserDao userDao;
	@Autowired
	public UserManager(UserDao userDao) {
		
		this.userDao = userDao;
	}
	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return this.userDao.findAll();
	}

}
