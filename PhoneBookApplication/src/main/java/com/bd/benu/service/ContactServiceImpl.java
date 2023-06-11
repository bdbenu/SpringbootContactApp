package com.bd.benu.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bd.benu.model.Contact;
import com.bd.benu.repositary.IContactRepositary;

@Service
public class ContactServiceImpl implements IContactService {

	@Autowired
	private IContactRepositary contactRepositary;

	@Override
	public Contact createContact(Contact contact) {
		
		return contactRepositary.save(contact);
	}

	@Override
	public List<Contact> contacts() {
		
		return contactRepositary.findAll();
	}

	@Override
	public Contact contact(Integer contId) {
		Optional<Contact> findById = contactRepositary.findById(contId);
		if(findById.isPresent()) {
			Contact contact = findById.get();	
			return contact;
		}
		return null;
	}

	@Override
	public boolean deleteContact(Integer contId) {
		contactRepositary.deleteById(contId);
		return true;
	}

	@Override
	public Contact ontctByContId(Integer contId) {
		Optional<Contact> contactcs = contactRepositary.findById(contId);
		if(contactcs==null) {
			throw new ContaactNotfoundException("contId"+contId);
		}
		
		return null;
	}

	
	
}
