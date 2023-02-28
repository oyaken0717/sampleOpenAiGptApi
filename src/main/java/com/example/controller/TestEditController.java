//package com.example.controller;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import com.theokanning.openai.edit.EditRequest;
//import com.theokanning.openai.service.OpenAiService;
//
//@Controller
//@RequestMapping("")
//public class TestEditController {
//
//	@RequestMapping("")
//	public String toStart() {
//		
//		String token = System.getenv("OPENAI_API_KEY");
//		OpenAiService service = new OpenAiService(token);
//
//		EditRequest editRequest = EditRequest.builder()
//                .model("text-davinci-edit-001")
//                .input("こんにちわ")
//                .instruction("間違っている所を直して")
//                .temperature(0.0)
//                .build();
//		
//        String response = service.createEdit(editRequest).getChoices().get(0).getText();
//        System.out.println(response);
//
//        return "start";
//	}
//
//}
