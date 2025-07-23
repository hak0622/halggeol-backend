package com.halggeol.backend.security.util;

import java.time.LocalDateTime;

public class Validator {
    public static boolean isValidAge(LocalDateTime birth) {
        return birth.plusYears(14).isBefore(LocalDateTime.now())
            || birth.plusYears(14).isEqual(LocalDateTime.now());
    }

    public static boolean isCorrectPassword(String password, String checkPassword) {
        return password.equals(checkPassword);
    }
}
