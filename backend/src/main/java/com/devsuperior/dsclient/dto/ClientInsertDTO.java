package com.devsuperior.dsclient.dto;

import com.devsuperior.dsclient.services.validation.ClientInsertValid;

@ClientInsertValid
public class ClientInsertDTO extends ClientDTO{
	private static final long serialVersionUID = 1L;
	
	private String password;
	
	public ClientInsertDTO () {
		super();
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
