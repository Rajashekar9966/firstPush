package com.learning.jpa;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class controller {

	@GetMapping("/test")
	public String hlo()
	{
		return "hello shekar_eddandi.............";
	}
}
