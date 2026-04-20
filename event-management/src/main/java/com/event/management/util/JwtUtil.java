package com.event.management.util;

import org.springframework.stereotype.Component;
import java.util.Base64;

@Component
public class JwtUtil {

    // Simple token generation for demo
    public String generateToken(String email, String role) {
        return Base64.getEncoder().encodeToString((email + ":" + role + ":" + System.currentTimeMillis()).getBytes());
    }
}
