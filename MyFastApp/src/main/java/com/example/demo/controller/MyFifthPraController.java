package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyFifthPraController {

	@RequestMapping(path = "/fifthpra", method = RequestMethod.GET)
	public String thirdFinal(Model model) {
		String modelpra = "さんもんめ";
		model.addAttribute("modelpra", modelpra);
		return "myfifthpra";
	}

	//画面からの値を処理するPOSTメソッド
	@RequestMapping(path = "/fifthpra", method = RequestMethod.POST)
	public String thirdFinal(Model model, String like) {

		System.out.println("");
		System.out.println("画面から" + like + "と入力されました");

		if (like.equals("お寿司")) {

			like = "私もお寿司が好きです";

		} else {

		}

		System.out.println(like);
		model.addAttribute("likefood", like);

		return "myfifthpra";
	}

}