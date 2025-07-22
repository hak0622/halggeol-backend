package com.halggeol.backend.user.controller;

import com.halggeol.backend.user.dto.UserDTO;
import com.halggeol.backend.user.dto.UserJoinDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/signup")
public class UserController {
//    @GetMapping("/request")
//    public ResponseEntity<UserDTO> request(String email) {}

//    @GetMapping("")
//    public ResponseEntity<Void> join(UserJoinDTO user) {
//    }
}
