package com.bd.benu.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "CONTACT_MASTER")
@Data
public class Contact {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CONT_ID")
	private Integer contId;
	
	@Column(name = "CNAME")
	private String contName;
	
	@Column(name = "EMAIL")
	private String contEmail;
	
	@Column(name = "MOBILE")
	private String contMobile;
	
	@Column(name = "GENDER")
	private String contGender;
	
	@Column(name = "CATEGORY")
	private String ContCateagory;
	
	@Column(name = "ADDRESS")
	private String contAddress;
	

}
