package com.halggeol.backend.user.controller;

import com.halggeol.backend.security.util.JwtManager;
import com.halggeol.backend.user.dto.UserDTO;
import com.halggeol.backend.user.dto.UserJoinDTO;
import com.halggeol.backend.user.service.UserService;
import javax.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/signup")
public class UserController {
    private final UserService userService;
    private final JwtManager jwtManager;

    @GetMapping("/request")
    public ResponseEntity<Void> requestJoin(@Valid UserJoinDTO user) {
        // 입력값 유효성 검증은 UserJoinDTO에서 진행
        // 검증 실패 시 MethodArgumentNotValidException 예외 발생
        // 스프링 MVC에서 자동으로 400 Bad Request로 응답함

        if (userService.findByEmail(user.getEmail())) {
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }

        // 성공하면 요청한 이메일 넣어서 토큰 발급하고, 발급한 토큰 들어있는 링크 메일로 보내기

//        jwtManager.generateVerifyToken(user);

        return ResponseEntity.ok().build();
    }

//    @GetMapping("")
//    public ResponseEntity<Void> signup(UserJoinDTO user) {
//    }
}
