package sefim.io.HMRS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import sefim.io.HMRS.entities.concretes.User;

public interface UserDao extends JpaRepository<User, Integer>{

}
