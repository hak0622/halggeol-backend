package com.halggeol.backend.security.mail.service;

import static org.junit.jupiter.api.Assertions.*;

import com.halggeol.backend.global.config.AppConfig;
import com.halggeol.backend.security.mail.domain.MailType;
import com.halggeol.backend.security.mail.dto.MailDTO;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {AppConfig.class})
@Log4j2
class MailServiceImplTest {

    @Autowired
    private MailService mailService;

    @Test
    void sendMail() {
        String email = "lkjin0110@naver.com";
        MailType mailType = MailType.SIGNUP;

        assertDoesNotThrow(() -> {
            mailService.sendMail(MailDTO.builder()
                                        .email(email)
                                        .mailType(mailType)
                                        .build());
        });
    }

    @Test
    void sendMail_Fail_Email() {
        String email = "";
        MailType mailType = MailType.SIGNUP;

        assertThrows(Exception.class, () -> {
            mailService.sendMail(MailDTO.builder()
                .email(email)
                .mailType(mailType)
                .build());
        });
    }
}