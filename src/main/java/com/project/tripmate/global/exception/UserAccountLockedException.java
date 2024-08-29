package com.project.tripmate.global.exception;

import org.springframework.security.core.AuthenticationException;

public class UserAccountLockedException extends AuthenticationException {
    public UserAccountLockedException(String message) {
        super(message);
    }
}