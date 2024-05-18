package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jakarta.servlet.http.HttpSession;

@Controller
public class MyEleventhController {

	@RequestMapping(path = "/elevenpageone", method = RequestMethod.GET)
	public String elevenget(Model model,HttpSession session) {
		
		//モデルにデータを格納
		model.addAttribute("modelData","→モデルにしまったデータです←");
		
		//sessionにデータを格納
		session.setAttribute("sessionData", "→sessionにしまったデータです←");
		
		//1答え
		session.setAttribute("sessionData2", "練習問題①クリア");
		
		return "myeleventhone";
	}
	
	//画面を表示するためのGETメソッド
	@RequestMapping(path = "/elevenpagetwo", method = RequestMethod.GET)
	public String elevenget2(Model model,HttpSession session) {
		
		//セッションからデータを取り出して適当な文字列をくっつける。
		
		String x = (String)session.getAttribute("sessionData");
		
		//2答え
		String y = (String)session.getAttribute("sessionData2");
		
		y = y + "練習問題②もできた";

		//sessionにデータを格納
		session.setAttribute("sessionData2", x);
		////
		
		
		x = x + "だよだよ";
		
		//sessionにデータを格納
		session.setAttribute("sessionData", x);
		
		
		return "myeleventhtwo";
	}
	
	@RequestMapping(path = "/elevenpagethree", method = RequestMethod.GET)
	public String eleventhreeget(Model model,HttpSession session) {
		
		
		//3答え
		session.setAttribute("sessionData3", "練習問題③クリア");
		
		return "myelevenpagethree";
	}
	
}