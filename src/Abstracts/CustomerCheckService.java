package Abstracts;

import java.rmi.RemoteException;

import Entities.Customer;

public interface CustomerCheckService {
	boolean checkIfRealPerson(Customer customer) throws RemoteException;
}
