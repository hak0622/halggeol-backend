package com.halggeol.backend.user.dto;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDTO {
    private String email;
    private String name;
    private String password;
    private String phone;
    private LocalDateTime birth;
    private int risk;
    private int userKlg;
    private float algoCode;
    private LocalDateTime regDate;
    private LocalDateTime klgRenewDate;
    private LocalDateTime riskRenewDate;
    private LocalDateTime docuRenewDate;
}
