package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.theokanning.openai.completion.CompletionRequest;
import com.theokanning.openai.service.OpenAiService;

@Controller
@RequestMapping("")
public class TestCompletionController {

	@RequestMapping("")
	public String toStart() {
		
		String token = System.getenv("OPENAI_API_KEY");
		OpenAiService service = new OpenAiService(token);

        CompletionRequest completionRequest = CompletionRequest.builder()
                .model("text-davinci-003")
                .prompt("こんにちは")
                .build();
        
        String response = service.createCompletion(completionRequest).getChoices().get(0).getText();
        System.out.println(response);

        return "start";
	}

}
