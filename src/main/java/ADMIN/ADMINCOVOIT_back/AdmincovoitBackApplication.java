package ADMIN.ADMINCOVOIT_back;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class AdmincovoitBackApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdmincovoitBackApplication.class, args);
	}

	@Bean
	public WebMvcConfigurer corsconfigurer(){
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/api/**")
                        .allowedOrigins("http://localhost:4200")
                        .allowedMethods("*");
//                        .allowedHeaders("*");
                registry.addMapping("/login")
                        .allowedOrigins("http://localhost:4200")
                        .allowedMethods("*")
                        .exposedHeaders("*");
			}
		};
	}
}
