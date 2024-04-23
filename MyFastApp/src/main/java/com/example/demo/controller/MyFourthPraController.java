package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyFourthPraController {

	//画面を表示するためのGETメソッド
	@RequestMapping(path = "/fourthprapra", method = RequestMethod.GET)
	public String fourthprapra() {
		return "MyFourthPra";
	}

	//画面からの値を処理するPOSTメソッド
	@RequestMapping(path = "/fourthprapra", method = RequestMethod.POST)
	public String fourthprapra(String dekita , Model model) {

		System.out.println("");
		System.out.println("画面から" + dekita + "と入力されました");
		
		if(dekita .equals("出来た")||dekita.equals("できた")) {
			
			
		}else {
			
			dekita="出来てません";
			
		}
		
		

		model.addAttribute("userDekita", dekita);

		return "MyFourthPra";
	}
}