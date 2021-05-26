package sefim.io.HMRS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import sefim.io.HMRS.entities.concretes.Position;


public interface PositionDao extends JpaRepository<Position, Integer>{

}