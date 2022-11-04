package NandiniSpringCore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("NandiniSpringCore")  //base_pkg_name
public class AppConfig {

	@Bean
	public Student getStudent() {
		return new Student();
	}
	@Bean
	public Course getCourse() {
		return new Course();
	}
}
