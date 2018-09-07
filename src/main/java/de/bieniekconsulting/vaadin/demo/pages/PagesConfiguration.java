package de.bieniekconsulting.vaadin.demo.pages;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import de.bieniekconsulting.vaadin.demo.TestConfiguration;

@Configuration
@ComponentScan(excludeFilters=@ComponentScan.Filter(type=FilterType.ANNOTATION, classes=TestConfiguration.class))
public class PagesConfiguration {

}
