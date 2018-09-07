package de.bieniekconsulting.vaadin.demo.pages;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;

@Route("")
public class IndexPage extends Div{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3685496705619735121L;

	public IndexPage() {
		setText("Hello World");
	}
}
