package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.annotation.web.configurers.HeadersConfigurer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.header.writers.XXssProtectionHeaderWriter;
import org.springframework.security.web.servlet.util.matcher.MvcRequestMatcher;
import org.springframework.web.servlet.handler.HandlerMappingIntrospector;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http, HandlerMappingIntrospector introspector) throws Exception {
    // @formatter:off
    http
            .csrf(AbstractHttpConfigurer::disable)
            .headers(headers -> headers
                            .httpStrictTransportSecurity(hsts -> hsts
                                    .includeSubDomains(true)
                                    .preload(true)
                                    .maxAgeInSeconds(31536000)
                            )
                            .contentTypeOptions(HeadersConfigurer.ContentTypeOptionsConfig::disable)
                            .frameOptions(HeadersConfigurer.FrameOptionsConfig::sameOrigin
                            )
                            .xssProtection(xss -> xss
                                    .headerValue(XXssProtectionHeaderWriter.HeaderValue.ENABLED_MODE_BLOCK)
                            )
                    //.contentSecurityPolicy(csp -> csp
                    //        .policyDirectives("default-src 'self';")
                    //)
            )
            .authorizeHttpRequests((authorize) -> authorize
                //control access
                .requestMatchers("/figuras").authenticated()    
                .requestMatchers("/personalizados").authenticated()
                .requestMatchers("/peluches").authenticated()
                .requestMatchers("/ropa").authenticated()
                .requestMatchers("/accesorios").authenticated()
                    .requestMatchers("api/createFiguras").authenticated()
                    .requestMatchers("api/createAccesorios").authenticated()
                    .requestMatchers("api/createpeluches").authenticated()
                    .requestMatchers("api/createRopa").authenticated()
                    .requestMatchers("api/createPersonalizados").authenticated()
                    .requestMatchers("api/create").authenticated()
                .anyRequest().authenticated()
            )
            .formLogin(withDefaults());
    return http.build();
    }
    // @formatter:off
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
    @Bean
    public InMemoryUserDetailsManager userDetailsService() {
        PasswordEncoder passwordEncoder = passwordEncoder();
        UserDetails user = User.builder()
                .username("user")
                .password(passwordEncoder.encode("-*ChAnGuaMiPeRrO*-"))
                .roles("USER")
                .build();
        return new InMemoryUserDetailsManager(user);
      }
}
