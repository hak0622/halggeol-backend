package com.halggeol.backend.security.mail.dto;

import com.halggeol.backend.security.mail.domain.MailType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MailDTO {
    @NotBlank
    @Email
    private String email;

    @NotBlank
    private String token;

    private MailType mailType;
}
