package com.office.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class EnquiryController {
	
   
    @GetMapping("/view_student") 
	public String getViewStudent() {
		return "view_student";
	}
	
//	@PostMapping("/view_student")
//	public String getViewStudent() {
//		return "view_student";
//	}
    
    @GetMapping("/add_enquiry")
    public String getEnquiryPage() {
        return "student_enquiry";
    }
    
    

}
