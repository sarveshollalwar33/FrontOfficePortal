package com.office.services;

import com.office.formbinders.LoginForm;
import com.office.formbinders.SignUpForm;
import com.office.formbinders.UnlockForm;

public interface UserService {

	public String login(LoginForm form);
	
	public String signup(SignUpForm signUp);
	
	public String unlockAccount(UnlockForm un);
	
	public String forgetPwd(String email);
}
