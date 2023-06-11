package com.bd.benu.repositary;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bd.benu.model.Contact;

public interface IContactRepositary extends JpaRepository<Contact, Serializable>{
	

}
