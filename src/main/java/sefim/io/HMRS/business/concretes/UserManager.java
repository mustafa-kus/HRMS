package sefim.io.HMRS.business.concretes;

import java.util.List;

import sefim.io.HMRS.business.abstracts.UserService;
import sefim.io.HMRS.dataAccess.abstracts.UserDao;
import sefim.io.HMRS.entities.concretes.User;

public class UserManager implements UserService {
	private UserDao userDao;
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}
	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return this.userDao.findAll();
	}

}
