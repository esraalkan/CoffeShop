package Concrete;

import Abstracts.BaseCustomerManager;
import Abstracts.CustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{
	private CustomerCheckService _customerCheckService;
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		_customerCheckService=customerCheckService;
	}
	@Override
	public void Save(Customer customer) {
		try 
		{
			if (_customerCheckService.checkIfRealPerson(customer))
		
			System.out.println("Database'e kaydedildi: " + customer.getFirstName());
		
		}catch (Exception e) {
		 
		System.out.println("Not valid person");
	}

	}
	}
