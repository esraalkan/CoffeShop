package Abstracts;

import Entities.Customer;


public class BaseCustomerManager implements CustomerService{

	@Override
	public void Save(Customer customer) throws Exception {
		System.out.println("Veri taban�na kaydedildi:" + customer.getFirstName());
	}

}
