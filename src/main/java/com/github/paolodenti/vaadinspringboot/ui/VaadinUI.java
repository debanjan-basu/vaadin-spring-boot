package com.github.paolodenti.vaadinspringboot.ui;

import org.springframework.beans.factory.annotation.Autowired;

import com.github.paolodenti.vaadinspringboot.service.MyService;
import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;

@SuppressWarnings("serial")
@Theme("valo")
@SpringUI(path = "")
public class VaadinUI extends UI {

	@Autowired
	MyService myService;

	@Override
	protected void init(VaadinRequest request) {
		setContent(new Label(myService.sayHi()));
	}
}
