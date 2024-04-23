package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyFifthCorrectController {

	//画面を表示するためのGETメソッド
	@RequestMapping(path = "/fifthcor", method = RequestMethod.GET)
	public String fourthget(Model model) {
		
		model.addAttribute("model", model);
		return "myfifthcorrect";
	}
	
	//画面からの値を処理するPOSTメソッド
	@RequestMapping(path = "/fifthcor", method = RequestMethod.POST)
	public String fourthpost(String engineerName,Model model) {
		
		System.out.println("");
		System.out.println("画面から" + engineerName + "と入力されました");

		if (engineerName.equals("つよエンジニア")) {

			engineerName = "問題無し";
			
		}else if(engineerName.equals("ひよこエンジニア")) {
				
			engineerName = "もう一度確認";	

		} else {

		}
		
		System.out.println(engineerName);
		model.addAttribute("uhouho",engineerName);
		
		return "myfifthcorrect";
	}
}