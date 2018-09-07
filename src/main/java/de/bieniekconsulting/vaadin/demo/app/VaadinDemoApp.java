package de.bieniekconsulting.vaadin.demo.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.vaadin.flow.spring.annotation.EnableVaadin;

import de.bieniekconsulting.vaadin.demo.pages.PagesConfiguration;

@SpringBootApplication
@Import({PagesConfiguration.class})
@EnableVaadin("de.bieniekconsulting.vaadin.demo.pages")
public class VaadinDemoApp {

	public static void main(String[] args) {
		new SpringApplication(VaadinDemoApp.class).run(args);
	}

}
