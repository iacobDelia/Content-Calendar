package com.myProject.content_calendar;

import com.myProject.content_calendar.config.ContentCalenderProperties;
import com.myProject.content_calendar.model.Content;
import com.myProject.content_calendar.model.Status;
import com.myProject.content_calendar.model.Type;
import com.myProject.content_calendar.repository.ContentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@EnableConfigurationProperties(ContentCalenderProperties.class)
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
	}

}
