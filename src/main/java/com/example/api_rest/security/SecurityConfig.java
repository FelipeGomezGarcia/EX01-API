package com.example.api_rest.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{

	@Override
    protected void configure(HttpSecurity http) throws Exception {
		http
        .csrf().disable()
        .authorizeRequests()
        .antMatchers(HttpMethod.OPTIONS, "/**").authenticated()
        .antMatchers(HttpMethod.GET,"/**").authenticated()
        .antMatchers(HttpMethod.POST,"/**").authenticated()
        .antMatchers(HttpMethod.PUT, "/**").authenticated()
        .antMatchers(HttpMethod.DELETE,"/**").authenticated()
        .anyRequest().authenticated()
        .and().formLogin().permitAll()
        .and().httpBasic();
    }
	
	@Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        // Creamos una cuenta de usuario por default
       auth.inMemoryAuthentication()
               .withUser("admin")
               .password("{noop}password")
               .roles("ADMIN");
       
       auth.inMemoryAuthentication()
			   .withUser("felipe")
			   .password("{noop}felipe")
			   .roles("USER");
    }
}
