package com.ravi.spring.rest;


	import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

	@Configuration
	@EnableWebSecurity
	public class SecurityConfig extends WebSecurityConfigurerAdapter {
		// Authentication : User --> Roles
		protected void configure(AuthenticationManagerBuilder auth)
				throws Exception {
			auth.inMemoryAuthentication().passwordEncoder(org.springframework.security.crypto.password.NoOpPasswordEncoder.getInstance()).withUser("ravi1").password("secret1")
			.roles("USER");
		}

		// Authorization : Role -> Access
		protected void configure(HttpSecurity http) throws Exception {
//			http.httpBasic().and().authorizeRequests().antMatchers("/myService/**")
//					.hasRole("USER").antMatchers("/**").hasRole("ADMIN").and()
//					.csrf().disable().headers().frameOptions().disable();
			http.csrf().disable().authorizeRequests().anyRequest().fullyAuthenticated().and().httpBasic();
		}
}
