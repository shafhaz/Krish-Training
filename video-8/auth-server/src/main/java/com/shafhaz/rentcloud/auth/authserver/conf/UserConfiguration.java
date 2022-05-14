package com.shafhaz.rentcloud.auth.authserver.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.GlobalAuthenticationConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class UserConfiguration extends GlobalAuthenticationConfigurerAdapter {

    PasswordEncoder passwordEncoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();

    @Override
    public void init(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("shafhaz").password(passwordEncoder.encode("shafhazpass"))
                .roles("USER","ADMIN","MANAGER").authorities("CAN_READ","CAN_WRITE","CAN_DELETE").and()
                .withUser("haneef").password(passwordEncoder.encode("haneefpass"))
                .roles("USER").authorities("CAN_READ","CAN_WRITE");

    }
}
