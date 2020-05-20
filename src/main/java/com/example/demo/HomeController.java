package com.example.demo;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class HomeController {
	
	@GetMapping("/carForm")
	public String loadForm(Model model){
		model.addAttribute("car", new Car());
		return "carForm";
	}

	@PostMapping("/carForm")
	public String processForm(@Valid Car car, BindingResult result){
		//model.addAttribute("car", car);
		if (result.hasErrors()){
			return "carForm";
		}else
			return "displayForm";


	}
}
