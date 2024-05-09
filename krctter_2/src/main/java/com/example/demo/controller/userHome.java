package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class userHome {

	@RequestMapping(path = "/userHome", method = RequestMethod.GET)
	public String Home(Model model) {

		return "Home";

	}

	//画面からの値を処理するPOSTメソッド
	@RequestMapping(path = "/userHome", method = RequestMethod.POST)
	public String Home(Model model, String tweet, String tweetresult) {

		System.out.println("");

		System.out.println("ツイート内容: " + tweet);

		model.addAttribute("tweetresult", tweet);

		return "Home";

	}
}