package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by naver on 16. 12. 12..
 */
@RestController
public class AwsController {

	@RequestMapping("/aws")
	public String test(){
		return "ok";
	}
}
