package com.uca.capas.entities;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class User {

	@Size(message= "La longitud debe ser entre 4 y 10 caracteres", min=4 , max=10)
	@NotEmpty(message="Este campo no puede estar vacío")
	private String name;
	
	private String username;
	
	@Size(message="La longitud debe estar entre 4 y 10 caracteres", min=4, max=10)
	@NotEmpty(message="Este campo no puede estar vacío")
	private String pass;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String name, String username, String pass) {
		super();
		this.name = name;
		this.username = username;
		this.pass = pass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", username=" + username + ", pass=" + pass + "]";
	}
	
}
