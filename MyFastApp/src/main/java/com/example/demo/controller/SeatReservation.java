package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jakarta.servlet.http.HttpSession;

@Controller
public class SeatReservation {
	
	@RequestMapping(path = "/zasekiyoyaku", method = RequestMethod.GET)
	public String zasekiyoyakuget(Model model) {

		return "seatreservation";

	}

	@RequestMapping(path = "/zasekiyoyaku", method = RequestMethod.POST)
	public String zasekiyoyakupost(Model model,HttpSession session,String operation,String yoyakunumber) {
		
		session.setAttribute("op", operation);
		
		session.setAttribute("yoyakunumber", yoyakunumber);

		return "seatreservation";

	}

}
