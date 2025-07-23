package com.halggeol.backend.security.mail.service;

import com.halggeol.backend.security.mail.dto.MailDTO;
import javax.validation.Valid;

public interface MailService {
    void sendMail(@Valid MailDTO mailDTO);
}
