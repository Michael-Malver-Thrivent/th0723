package com.example.servingwebcontent.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class WatchedController {
@GetMapping("/watched/{videoName}")
public String prepMessage(@PathVariable String videoName, Model model) {
	model.addAttribute("videoName","test");
	model.addAttribute("points","3");
	return "summary";
}
}
