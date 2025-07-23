package com.halggeol.backend.user.mapper;

import com.halggeol.backend.security.account.domain.User;

public interface UserMapper {
    User findByEmail(String email);

    int insert(User user);
}
