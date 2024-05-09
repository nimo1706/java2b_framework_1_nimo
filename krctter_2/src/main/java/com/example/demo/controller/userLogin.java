package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class userLogin {

	@RequestMapping(path = "/userLogin", method = RequestMethod.GET)
	public String Login() {
		return "Login";
	}

	//画面からの値を処理するPOSTメソッド
	@RequestMapping(path = "/userLogin", method = RequestMethod.POST)
	public String Login(Model model, String id, String pass, String loginresult) {
		
		model.addAttribute("username", id);

		System.out.println("");

		if (pass.length() < 8) {

			loginresult = "パスワードが短すぎます";

			System.out.println("画面から" + pass + "と入力されました");
			System.out.println("文字数: " + pass.length());
			model.addAttribute("loginresult", loginresult);

			return "Login";

		} else {

			System.out.println("画面から" + id + "と入力されました");
			System.out.println("画面から" + pass + "と入力されました");

			if (id.equals("userlogin") && pass.equals("userpass")) {

				loginresult = "ログイン成功";

				System.out.println(loginresult);

				return "Home";

			} else if (!(id).equals("userlogin") && pass.equals("userpass")) {

				loginresult = "IDが違います";

				System.out.println(loginresult);
				model.addAttribute("loginresult", loginresult);

				return "Login_IDerr";

			} else {

				loginresult = "ログインに失敗しました";

				System.out.println(loginresult);
				model.addAttribute("loginresult", loginresult);

				return "Login";

			}

		}

	}

}