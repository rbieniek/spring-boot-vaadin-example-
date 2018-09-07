package de.bieniekconsulting.vaadin.demo.pages;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@HtmlImport("styles/shared-styles.html")
@Route("")
public class MainPage extends VerticalLayout {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3685496705619735121L;

	public MainPage() {
		ExampleTemplate template = new ExampleTemplate();

		final Button button = new Button("Click me", event -> template.setValue("Clicked!"));

		add(button, template);
		setClassName("main-layout");
	}
}
