package app.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.model.Message;

@Controller
public class MessageController {

	
	@RequestMapping("/helloworld")
	public String handler(Model model) {
		
		Message message = new Message();
		message.setMessage("I am from Message Controller MVC!!!");
		
	     model.addAttribute("mymessage", message);
		return "message";
	}
	
}
