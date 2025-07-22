package com.halggeol.backend.user.service;

import com.halggeol.backend.security.account.domain.User;
import com.halggeol.backend.user.dto.UserJoinDTO;
import com.halggeol.backend.user.mapper.UserMapper;
import javax.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Log4j2
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserMapper userMapper;

    @Override
    public boolean findByEmail(String email) {
        User user = userMapper.findByEmail(email);
        return user != null;
    }

    public HttpStatus requestJoin(@Valid UserJoinDTO user) {
        // 입력값 유효성 검증은 UserJoinDTO에서 진행
        // 검증 실패 시 MethodArgumentNotValidException 예외 발생
        // 스프링 MVC에서 자동으로 400 Bad Request로 응답함

        if (findByEmail(user.getEmail())) {
            return HttpStatus.CONFLICT;
        }

        // 성공하면 요청한 이메일 넣어서 토큰 발급하고, 발급한 토큰 들어있는 링크 메일로 보내기
//        jwtManager.generateVerifyToken(user.getEmail());

        return HttpStatus.OK;
    }

    @Transactional
    @Override
    public HttpStatus join(UserJoinDTO user) {
        return HttpStatus.OK;
    }
}
