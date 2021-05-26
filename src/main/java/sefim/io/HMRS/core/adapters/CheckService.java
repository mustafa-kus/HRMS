package sefim.io.HMRS.core.adapters;

import java.rmi.RemoteException;

import sefim.io.HMRS.entities.concretes.Candidate;

public interface CheckService {
	boolean checkRealPerson(Candidate candidate) throws RemoteException;
		
	
}