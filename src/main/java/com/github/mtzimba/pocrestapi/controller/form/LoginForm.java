package com.github.mtzimba.pocrestapi.controller.form;

import java.io.Serializable;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

public class LoginForm implements Serializable {

	private static final long serialVersionUID = 264985085538101315L;

	public String email;
	public String senha;

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the senha
	 */
	public String getSenha() {
		return senha;
	}

	/**
	 * @param senha the senha to set
	 */
	public void setSenha(String senha) {
		this.senha = senha;
	}

	public UsernamePasswordAuthenticationToken converter() {
		return new UsernamePasswordAuthenticationToken(this.email, this.senha);
	}

}
