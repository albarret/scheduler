package com.imedicina.auth;

import org.springframework.core.convert.converter.Converter;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.stereotype.Component;

import com.imedicina.scheduler.model.User;

import java.util.ArrayList;

@Component
public class JwtToUserConverter implements Converter<Jwt, UsernamePasswordAuthenticationToken> {

    @Override
    public UsernamePasswordAuthenticationToken convert(Jwt jwt) {
        User user = new User();
        user.setUsername(jwt.getSubject());
        return new UsernamePasswordAuthenticationToken(user, jwt, new ArrayList<>());
    }
}
