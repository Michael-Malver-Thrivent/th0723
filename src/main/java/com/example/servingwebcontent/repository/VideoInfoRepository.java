package com.example.servingwebcontent.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.servingwebcontent.domain.VideoInfo;
@Repository
public interface VideoInfoRepository extends  JpaRepository<VideoInfo, Integer> {

}
