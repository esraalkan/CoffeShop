package Adapter;
import java.rmi.RemoteException;
import java.util.Date;
import Abstracts.CustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) throws RemoteException {
		// TODO Auto-generated method stub
		KPSPublicSoapProxy client=new KPSPublicSoapProxy ();
			
		@SuppressWarnings("deprecation")
		int year=customer.getDateOfBirth().getYear();
		return client.TCKimlikNoDogrula(customer.getNationalityId(),
				customer.getFirstName().toUpperCase(),customer.getFirstName().toUpperCase(),
				year);
		
	}

}
