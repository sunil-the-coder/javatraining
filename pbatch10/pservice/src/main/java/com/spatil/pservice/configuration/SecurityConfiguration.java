package com.spatil.pservice.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
	// Authentication : User --> Roles
	protected void configure(AuthenticationManagerBuilder auth)
			throws Exception {
		auth.inMemoryAuthentication().
			passwordEncoder(org.springframework.security.crypto.password.NoOpPasswordEncoder.getInstance()).
				withUser("user1").password("secret1").roles("USER").
				and().
				withUser("admin1").password("secret1").roles("USER", "ADMIN");
	}

	// Authorization : Role -> Access
	protected void configure(HttpSecurity http) throws Exception {
		http.httpBasic().and().authorizeRequests().
				antMatchers("/products/add**").hasRole("ADMIN").
				antMatchers("/**").hasRole("USER").
				and()
				.csrf().disable().headers().frameOptions().disable();
	}

}
