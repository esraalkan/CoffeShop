package Entities;

import java.util.Date;
import Abstracts.Entity;

public class Customer implements Entity{
	int id;
	String firstName;
	String lastName;
	Date dateOfBirth;
	Long nationalityId;
	
	
	public Customer(int id, String firstName, String lastName, Date dateOfBirth, long nationalityId) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.nationalityId = nationalityId;
	}
	
	public Customer(){
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public Long getNationalityId() {
		return nationalityId;
	}
	public void setNationalityId(Long nationalityId) {
		this.nationalityId = nationalityId;
	}
}