package com.example.servingwebcontent.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.servingwebcontent.domain.VideoInfo;
import com.example.servingwebcontent.exception.VideoNotFoundException;
import com.example.servingwebcontent.repository.VideoInfoRepository;

@Controller
public class WatchedController {
	@Autowired
	private VideoInfoRepository repository;

	@GetMapping("/watched/{videoName}")
	public String prepMessage(@PathVariable String videoName, Model model) {
		VideoInfo item = repository.findFirstByVideoName(videoName);
		if (item == null) {
			throw new VideoNotFoundException();

		}

		model.addAttribute("videoName", item.getVideoName());
		model.addAttribute("points", item.getPoints());
		return "summary";
	}
}
