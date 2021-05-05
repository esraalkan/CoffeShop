import java.util.Date;
import Abstracts.BaseCustomerManager;
import Adapter.MernisServiceAdapter;
import Entities.Customer;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;

public class Main {

	public static void main(String[] args) throws Exception {
		BaseCustomerManager customerManager=new StarbucksCustomerManager(new MernisServiceAdapter());
		Customer customer1=new Customer();
		customer1.setFirstName("Esra");
		customer1.setId(1);
		customer1.setLastName("Alkan");
		customer1.setDateOfBirth(new Date(15/10/1995));
		customer1.setNationalityId(11111111112L);
		
		customerManager.Save(customer1);
	}

}
