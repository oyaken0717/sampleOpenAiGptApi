//package com.example.controller;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import com.theokanning.openai.image.CreateImageRequest;
//import com.theokanning.openai.service.OpenAiService;
//
//@Controller
//@RequestMapping("")
//public class TestImageController {
//
//	@RequestMapping("")
//	public String toStart() {
//		
//		String token = System.getenv("OPENAI_API_KEY");
//		OpenAiService service = new OpenAiService(token);
//
//        CreateImageRequest request = CreateImageRequest.builder()
//                .prompt("One of the cute cat icons with an illustration-like pop.")
//                .build();
//
//        String response = service.createImage(request).getData().get(0).getUrl();
//        System.out.println(response);
//		
//		return "start";
//	}
//
//}
