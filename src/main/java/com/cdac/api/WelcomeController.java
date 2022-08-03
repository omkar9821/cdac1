package com.cdac.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class WelcomeController {
	@RequestMapping("/message")
  public String getMessage() {
	  return "hi welcome";
  }
}
