package com.login;


public class LoginService {

	public boolean isUserValid(String user, String password) {
		if (user.equals("shahab") && password.equals("sohrabi"))
			return true;

		return false;
	}

}