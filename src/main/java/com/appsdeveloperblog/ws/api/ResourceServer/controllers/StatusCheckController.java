package com.appsdeveloperblog.ws.api.ResourceServer.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.*;
import com.appsdeveloperblog.ws.api.ResourceServer.response.UserRest;


@RestController
@RequestMapping("/response")
public class StatusCheckController {

	@Autowired
	Environment env;

	@GetMapping("/200")
	ResponseEntity<String> response200String() {
		return ResponseEntity.ok().body("200");
	}

	@GetMapping("/500")
	ResponseEntity<String> response500String() {
		return ResponseEntity.internalServerError().build();
	}

}
