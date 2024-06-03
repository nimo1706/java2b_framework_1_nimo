package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jakarta.servlet.http.HttpSession;

@Controller
public class SeatReservation {
	List<String> seki = new ArrayList<>();

	@RequestMapping(path = "/zasekiyoyaku", method = RequestMethod.GET)
	public String zasekiyoyakuget(Model model) {

		return "seatreservation";

	}

	@RequestMapping(path = "/zasekiyoyaku", method = RequestMethod.POST)
	public String zasekiyoyakupost(
			Model model, //モデル
			HttpSession session, //セッション
			String operation, //ホーム画面
			String yoyakunumber, //個別予約
			String matomeyoyaku1, //まとめ予約1
			String matomeyoyaku2, //まとめ予約2
			String torikesi, //取り消し
			String hyouji //表示(テスト)
	) {

		String yoyaku = null;

		//ホーム画面
		if (operation != null && !("並び変えて表示".equals(operation)) && !("参照".equals(operation))) {
			model.addAttribute("op", operation);
			System.out.println("operation : " + operation);

			//予約
		} else if (yoyakunumber != null) {

			if ("1番".equals(yoyakunumber) || "１番".equals(yoyakunumber) || "1".equals(yoyakunumber)
					|| "１".equals(yoyakunumber)) {
				yoyaku = "1番";
				session.setAttribute("session", yoyaku);

			} else if ("2番".equals(yoyakunumber) || "２番".equals(yoyakunumber) || "2".equals(yoyakunumber)
					|| "２".equals(yoyakunumber)) {
				yoyaku = "2番";
				session.setAttribute("session", yoyaku);

			} else if ("3番".equals(yoyakunumber) || "３番".equals(yoyakunumber) || "3".equals(yoyakunumber)
					|| "３".equals(yoyakunumber)) {
				yoyaku = "4番";
				session.setAttribute("session", yoyaku);

			} else if ("4番".equals(yoyakunumber) || "４番".equals(yoyakunumber) || "4".equals(yoyakunumber)
					|| "４".equals(yoyakunumber)) {
				yoyaku = "5番";
				session.setAttribute("session", yoyaku);

			} else if ("5番".equals(yoyakunumber) || "５番".equals(yoyakunumber) || "5".equals(yoyakunumber)
					|| "５".equals(yoyakunumber)) {
				yoyaku = "5番";
				session.setAttribute("session", yoyaku);

			} else if ("6番".equals(yoyakunumber) || "６番".equals(yoyakunumber) || "6".equals(yoyakunumber)
					|| "６".equals(yoyakunumber)) {
				yoyaku = "6番";
				session.setAttribute("session", yoyaku);

			} else if ("7番".equals(yoyakunumber) || "７番".equals(yoyakunumber) || "7".equals(yoyakunumber)
					|| "７".equals(yoyakunumber)) {
				yoyaku = "7番";
				session.setAttribute("session", yoyaku);

			} else if ("8番".equals(yoyakunumber) || "８番".equals(yoyakunumber) || "8".equals(yoyakunumber)
					|| "８".equals(yoyakunumber)) {
				yoyaku = "8番";
				session.setAttribute("session", yoyaku);

			} else if ("9番".equals(yoyakunumber) || "９番".equals(yoyakunumber) || "9".equals(yoyakunumber)
					|| "９".equals(yoyakunumber)) {
				yoyaku = "9番";
				session.setAttribute("session", yoyaku);

			} else if ("10番".equals(yoyakunumber) || "１０番".equals(yoyakunumber) || "10".equals(yoyakunumber)
					|| "１０".equals(yoyakunumber)) {
				yoyaku = "10番";
				session.setAttribute("session", yoyaku);

			}

			if (seki.contains(yoyaku)) {
				System.out.println("重複");
			} else {
				System.out.println("yoyakunumber : " + yoyaku);
				seki.add(yoyaku);
			}

			//まとめて予約
		} else if (matomeyoyaku1 != null) {

			//1
			if ("1番".equals(matomeyoyaku1) || "１番".equals(matomeyoyaku1) || "1".equals(matomeyoyaku1)
					|| "１".equals(matomeyoyaku1)) {
				yoyaku = "1番";

			} else if ("2番".equals(matomeyoyaku1) || "２番".equals(matomeyoyaku1) || "2".equals(matomeyoyaku1)
					|| "２".equals(matomeyoyaku1)) {
				yoyaku = "2番";

			} else if ("3番".equals(matomeyoyaku1) || "３番".equals(matomeyoyaku1) || "3".equals(matomeyoyaku1)
					|| "３".equals(matomeyoyaku1)) {
				yoyaku = "3番";

			} else if ("4番".equals(matomeyoyaku1) || "４番".equals(matomeyoyaku1) || "4".equals(matomeyoyaku1)
					|| "４".equals(matomeyoyaku1)) {
				yoyaku = "4番";

			} else if ("5番".equals(matomeyoyaku1) || "５番".equals(matomeyoyaku1) || "5".equals(matomeyoyaku1)
					|| "５".equals(matomeyoyaku1)) {
				yoyaku = "5番";

			} else if ("6番".equals(matomeyoyaku1) || "６番".equals(matomeyoyaku1) || "6".equals(matomeyoyaku1)
					|| "６".equals(matomeyoyaku1)) {
				yoyaku = "6番";

			} else if ("7番".equals(matomeyoyaku1) || "７番".equals(matomeyoyaku1) || "7".equals(matomeyoyaku1)
					|| "７".equals(matomeyoyaku1)) {
				yoyaku = "7番";

			} else if ("8番".equals(matomeyoyaku1) || "８番".equals(matomeyoyaku1) || "8".equals(matomeyoyaku1)
					|| "８".equals(matomeyoyaku1)) {
				yoyaku = "8番";

			} else if ("9番".equals(matomeyoyaku1) || "９番".equals(matomeyoyaku1) || "9".equals(matomeyoyaku1)
					|| "９".equals(matomeyoyaku1)) {
				yoyaku = "9番";

			} else if ("10番".equals(matomeyoyaku1) || "１０番".equals(matomeyoyaku1) || "10".equals(matomeyoyaku1)
					|| "１０".equals(matomeyoyaku1)) {
				yoyaku = "10番";
			}

			if (seki.contains(yoyaku)) {
				System.out.println("重複");
			} else {
				System.out.println("yoyakunumber1 : " + yoyaku);
				seki.add(yoyaku);
			}

			//2
			if ("1番".equals(matomeyoyaku2) || "１番".equals(matomeyoyaku2) || "1".equals(matomeyoyaku2)
					|| "１".equals(matomeyoyaku2)) {
				yoyaku = "1番";

			} else if ("2番".equals(matomeyoyaku2) || "２番".equals(matomeyoyaku2) || "2".equals(matomeyoyaku2)
					|| "２".equals(matomeyoyaku2)) {
				yoyaku = "2番";

			} else if ("3番".equals(matomeyoyaku2) || "３番".equals(matomeyoyaku2) || "3".equals(matomeyoyaku2)
					|| "３".equals(matomeyoyaku2)) {
				yoyaku = "3番";

			} else if ("4番".equals(matomeyoyaku2) || "４番".equals(matomeyoyaku2) || "4".equals(matomeyoyaku2)
					|| "４".equals(matomeyoyaku2)) {
				yoyaku = "4番";

			} else if ("5番".equals(matomeyoyaku2) || "５番".equals(matomeyoyaku2) || "5".equals(matomeyoyaku2)
					|| "５".equals(matomeyoyaku2)) {
				yoyaku = "5番";

			} else if ("6番".equals(matomeyoyaku2) || "６番".equals(matomeyoyaku2) || "6".equals(matomeyoyaku2)
					|| "６".equals(matomeyoyaku2)) {
				yoyaku = "6番";

			} else if ("7番".equals(matomeyoyaku2) || "７番".equals(matomeyoyaku2) || "7".equals(matomeyoyaku2)
					|| "７".equals(matomeyoyaku2)) {
				yoyaku = "7番";

			} else if ("8番".equals(matomeyoyaku2) || "８番".equals(matomeyoyaku2) || "8".equals(matomeyoyaku2)
					|| "８".equals(matomeyoyaku2)) {
				yoyaku = "8番";

			} else if ("9番".equals(matomeyoyaku2) || "９番".equals(matomeyoyaku2) || "9".equals(matomeyoyaku2)
					|| "９".equals(matomeyoyaku2)) {
				yoyaku = "9番";

			} else if ("10番".equals(matomeyoyaku2) || "１０番".equals(matomeyoyaku2) || "10".equals(matomeyoyaku2)
					|| "１０".equals(matomeyoyaku2)) {
				yoyaku = "10番";

			}

			if (seki.contains(yoyaku)) {
				System.out.println("重複");
			} else {
				System.out.println("yoyakunumber2 : " + yoyaku);
				seki.add(yoyaku);
			}

			System.out.println();

			//参照
		} else if ("参照".equals(operation)) {

			model.addAttribute("op", operation);
			System.out.println("operation : 参照");

			model.addAttribute("resultlist", seki);
			System.out.println(seki);

			System.out.println();

			//取消
		} else if (torikesi != null) {

			if ("1番".equals(torikesi) || "１番".equals(torikesi) || "1".equals(torikesi) || "１".equals(torikesi)) {
				yoyaku = "1番";

			} else if ("2番".equals(torikesi) || "２番".equals(torikesi) || "2".equals(torikesi) || "２".equals(torikesi)) {
				yoyaku = "2番";

			} else if ("3番".equals(torikesi) || "３番".equals(torikesi) || "3".equals(torikesi) || "３".equals(torikesi)) {
				yoyaku = "3番";

			} else if ("4番".equals(torikesi) || "４番".equals(torikesi) || "4".equals(torikesi) || "４".equals(torikesi)) {
				yoyaku = "4番";

			} else if ("5番".equals(torikesi) || "５番".equals(torikesi) || "5".equals(torikesi) || "５".equals(torikesi)) {
				yoyaku = "5番";

			} else if ("6番".equals(torikesi) || "６番".equals(torikesi) || "6".equals(torikesi) || "６".equals(torikesi)) {
				yoyaku = "6番";

			} else if ("7番".equals(torikesi) || "７番".equals(torikesi) || "7".equals(torikesi) || "７".equals(torikesi)) {
				yoyaku = "7番";

			} else if ("8番".equals(torikesi) || "８番".equals(torikesi) || "8".equals(torikesi) || "８".equals(torikesi)) {
				yoyaku = "8番";

			} else if ("9番".equals(torikesi) || "９番".equals(torikesi) || "9".equals(torikesi) || "９".equals(torikesi)) {
				yoyaku = "9番";

			} else if ("10番".equals(torikesi) || "１０番".equals(torikesi) || "10".equals(torikesi)
					|| "１０".equals(torikesi)) {
				yoyaku = "10番";

			}

			seki.remove(seki.indexOf(yoyaku));

			System.out.println("torikesi : " + torikesi);
			System.out.println(seki);
			System.out.println();

		} else if ("並び変えて表示".equals(operation)) {

			model.addAttribute("op", operation);
			System.out.println("operation : " + operation);

			Collections.sort(seki);
			model.addAttribute("resultlist", seki);
			System.out.println(seki);

			System.out.println();

		}
		return "seatreservation";

	}
}
