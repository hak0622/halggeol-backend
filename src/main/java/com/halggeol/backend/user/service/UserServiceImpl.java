package com.halggeol.backend.user.service;

import com.halggeol.backend.security.account.domain.User;
import com.halggeol.backend.user.dto.UserJoinDTO;
import com.halggeol.backend.user.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
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

    @Transactional
    @Override
    public void Signup(UserJoinDTO user) {
//        User
    }
}
