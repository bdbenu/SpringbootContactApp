package com.bd.benu.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException.NotFound;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.web.util.UriComponents;

import com.bd.benu.model.Contact;
import com.bd.benu.model.ContactList;
import com.bd.benu.service.IContactService;

@RestController
public class UserRestController {

	private static final UriComponents Location = null;
	@Autowired
	private IContactService contactService;

	@GetMapping("/test")
	public String testApi() {
		return "TEST API";
	}

	@PatchMapping(path = "/contact")
	public ResponseEntity<Contact> createContact(@RequestBody Contact contact) {
		Contact createContact = contactService.createContact(contact);
		URI Location = ServletUriComponentsBuilder.fromCurrentRequest().path("/cid")
				.buildAndExpand(createContact.getContId()).toUri();

		return ResponseEntity.created(Location).build();
	}

	/*public List<Contact> contacts() {		
		List<Contact> contacts = contactService.contacts();
		if(contacts!=null) {
			return  (List<Contact>) ResponseEntity.ok().body(contacts);
		}else {
			return ;
		}
		return ;
	}*/

}
