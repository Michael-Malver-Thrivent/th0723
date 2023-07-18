package com.example.servingwebcontent.exception;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


@ResponseStatus(value=HttpStatus.NOT_FOUND, reason="The video you are looking for is unavailable.")  // 404

public class VideoNotFoundException  extends RuntimeException {

}
