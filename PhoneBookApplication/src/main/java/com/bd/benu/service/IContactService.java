package com.bd.benu.service;

import java.util.List;

import com.bd.benu.model.Contact;

public interface IContactService {
	
	public Contact createContact(Contact contact);
	
	public List<Contact> contacts();
	
	public Contact contact(Integer contId);
	
	public boolean deleteContact(Integer contId);
	
	public Contact ontctByContId(Integer contId);
	

}
