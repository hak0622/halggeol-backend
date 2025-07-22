package com.halggeol.backend.user.dto;

import com.halggeol.backend.security.account.domain.User;
import java.time.LocalDateTime;
import javax.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserJoinDTO {
    @Email
    private String email;
    private String name;
    private String password;
    private String phone;
    private LocalDateTime birth;

    public User toVO() {
        return User.builder()
            .email(email)
            .name(name)
            .password(password)
            .phone(phone)
            .birth(birth)
            .build();
    }
}
