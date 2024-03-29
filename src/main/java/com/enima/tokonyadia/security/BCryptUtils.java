package com.enima.tokonyadia.security;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BCryptUtils {

    private final PasswordEncoder passwordEncoder;

    public String hashPassword(String password){
        return passwordEncoder.encode(password);
    }

}
