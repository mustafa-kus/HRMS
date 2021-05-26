package sefim.io.HMRS.core.adapters;

import java.rmi.RemoteException;

import sefim.io.HMRS.entities.concretes.Candidate;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisAdapter implements CheckService {
	@Override
	public boolean checkRealPerson(Candidate candidate)  {
		KPSPublicSoapProxy kpsPublicSoap = new KPSPublicSoapProxy();		 
		
		boolean result=false;
		try {
			result = kpsPublicSoap.TCKimlikNoDogrula(Long.parseLong(candidate.getNationalId()), candidate.getFirstName().toUpperCase(), 
			candidate.getLastName().toUpperCase(),candidate.getYearOfBird());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
}
