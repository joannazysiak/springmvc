package pl.joannazysiak.springmvc.controller;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

	
	@RequestMapping(value="/hello.htm", method = GET)
	public String helloView(@RequestParam String who, ModelMap map) {
		
		map.put("who", who);
		
		return "hello";
	}
}
