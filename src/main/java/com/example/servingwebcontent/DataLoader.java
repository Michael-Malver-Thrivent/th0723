package com.example.servingwebcontent;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.example.servingwebcontent.domain.VideoInfo;
import com.example.servingwebcontent.repository.VideoInfoRepository;

@Component
public class DataLoader implements ApplicationRunner {
@Autowired
private VideoInfoRepository repository;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		List<VideoInfo> viList = new ArrayList<>();
		viList.add(new VideoInfo("learn_about_thrivent",30));
		viList.add(new VideoInfo("welcome",20));
		viList.add(new VideoInfo("retire_by_40",5));
		viList.add(new VideoInfo("hack_student_loans",5));
		viList.add(new VideoInfo("hello_new_member",100));

		List<VideoInfo> savedItems = repository.saveAll(viList);
		System.out.println(savedItems.size() + " items saved");
		
		
	}

}
