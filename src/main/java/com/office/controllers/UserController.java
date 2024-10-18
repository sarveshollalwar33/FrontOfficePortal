package com.office.controllers;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
public class UserController {

	@GetMapping("login")
	public String getLoginPage() {
		return "login" ;
	}
	
	@PostMapping("/login")
	public String getDashboard() {
		return "dashboard";
	}
	
	@GetMapping("forget")
	public String getForgetPage() {
		return "forget_password";
	}
	
	@GetMapping("signup")
	public String getSignUpPage() {
		return "signup";
	}
	
    @PostMapping("/signup")
    public String getUnlockPage() {
        
        
        return "unlock";
    }
    
    @PostMapping("unlock")
    public String getDashboard2() {
        
        
        return "dashboard";
    }
    
    
	
	
}
