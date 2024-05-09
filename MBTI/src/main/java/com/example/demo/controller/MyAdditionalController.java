package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyAdditionalController {

	@RequestMapping(path = "/additional", method = RequestMethod.GET)
	public String additional(Model model) {
		return "myadditional";
	}

	//画面からの値を処理するPOSTメソッド
	@RequestMapping(path = "/additional", method = RequestMethod.POST)
	public String additional(Model model, String q1, String q2, String q3, String q4, String MBTI, String MBTIresult) {

		System.out.println();
		System.out.println(q1);
		System.out.println(q2);
		System.out.println(q3);
		System.out.println(q4);

		if (q1.equals(null) || q2.equals(null) || q3.equals(null) || q4.equals(null)) {

			MBTI = "err";

		} else {

			MBTI = q1 + q2 + q3 + q4;

		}

		if (MBTI.equals("ISTJ")) {
			MBTIresult = "実用的で真面目、事実に基づいて行動する。組織と責任を重んじる。";

		} else if (MBTI.equals("ISFJ")) {
			MBTIresult = "温かく、寛大、忠実。伝統と安定性を大切にする。";

		} else if (MBTI.equals("INFJ")) {
			MBTIresult = "洞察力があり、直感的。理想主義的で、他人の成長を助けることに情熱を持つ。";

		} else if (MBTI.equals("INTJ")) {
			MBTIresult = "独立心が強く、創造的。複雑な問題解決に優れている。";

		} else if (MBTI.equals("ISTP")) {
			MBTIresult = "現実的で柔軟、効率的。危機管理能力が高い。";

		} else if (MBTI.equals("ISFP")) {
			MBTIresult = "穏やかで忍耐強い。現在を生きることを楽しむ。";

		} else if (MBTI.equals("INFP")) {
			MBTIresult = "内省的で理想主義的。創造的で情熱的。";

		} else if (MBTI.equals("INTP")) {
			MBTIresult = "非常に知的で理論的。好奇心旺盛で独創的。";

		} else if (MBTI.equals("ESTP")) {
			MBTIresult = "行動的でエネルギッシュ。現実的で解決志向。";

		} else if (MBTI.equals("ESFP")) {
			MBTIresult = "社交的で活発。楽しいことを見つけ、共有するのが得意。";

		} else if (MBTI.equals("ENFP")) {
			MBTIresult = "熱意があり、創造的。可能性を見つけて刺激する。";

		} else if (MBTI.equals("ENTP")) {
			MBTIresult = "知的で好奇心が強い。新しいことに挑戦するのが好き。";

		} else if (MBTI.equals("ESTJ")) {
			MBTIresult = "組織的で実践的。リーダーシップがあり、物事を成し遂げる。";

		} else if (MBTI.equals("ESFJ")) {
			MBTIresult = "協力的で調和を重んじる。他人のニーズに敏感。";

		} else if (MBTI.equals("ENFJ")) {
			MBTIresult = "社交的でカリスマ的。他人を奮い立たせ、導く。";

		} else if (MBTI.equals("ENTJ")) {
			MBTIresult = "決断力があり、自信がある。挑戦を楽しみ、目標を達成する。";

		} else {
			MBTIresult = "正しく診断出来ませんでした。";

		}

		System.out.println(MBTI);
		System.out.println(MBTIresult);
		model.addAttribute("MBTI", MBTI);
		model.addAttribute("MBTIresult", MBTIresult);

		return "myadditional";

	}

}