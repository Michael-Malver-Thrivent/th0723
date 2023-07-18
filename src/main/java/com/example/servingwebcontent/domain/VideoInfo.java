package com.example.servingwebcontent.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class VideoInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ACTM_ORDR_STG_SK")
Integer id;
String videoName;
int points;
public VideoInfo(String v, Integer p) {
	videoName = v;
	points=p;
}
}
