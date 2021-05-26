package sefim.io.HMRS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import sefim.io.HMRS.entities.concretes.Staff;


public interface StaffDao extends JpaRepository<Staff, Integer>{

}