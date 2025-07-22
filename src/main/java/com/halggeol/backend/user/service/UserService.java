package com.halggeol.backend.user.service;

import com.halggeol.backend.user.dto.UserJoinDTO;

public interface UserService {
    boolean requestSignup(String email);

    void Signup(UserJoinDTO user);
}
