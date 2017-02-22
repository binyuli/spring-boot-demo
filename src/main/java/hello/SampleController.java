package hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController {

	@RequestMapping("/home")
	@ResponseBody
	String home() {
		return "hello binye.";
	}

	@RequestMapping("/index")
	@ResponseBody
	String index() {
		return "<html><head><title>Hello World!</title></head><body><h1>Hello World!</h1><p>This is my first web site</p></body></html>";
	}

}
