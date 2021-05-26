package sefim.io.HMRS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import sefim.io.HMRS.entities.concretes.Candidate;


public interface  CandidateDao extends JpaRepository<Candidate, Integer>{

}
