package com.github.mtzimba.pocrestapi.controller.dto;

import java.io.Serializable;

public class TokenDto implements Serializable {

	private static final long serialVersionUID = -4759914254083097147L;

	private String token;
	private String string;

	public TokenDto(String token, String string) {
		this.token = token;
		this.string = string;
	}

	/**
	 * @return the token
	 */
	public String getToken() {
		return token;
	}

	/**
	 * @return the string
	 */
	public String getString() {
		return string;
	}

}
