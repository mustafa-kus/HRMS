package sefim.io.HMRS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import sefim.io.HMRS.entities.concretes.MemberTypes;


public interface MemberTypesDao extends JpaRepository<MemberTypes, Integer> {

}
