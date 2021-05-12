package sefim.io.HMRS.business.abstracts;

import java.util.List;

import sefim.io.HMRS.entities.concretes.User;

public interface UserService {
	List<User> getAll();
}
