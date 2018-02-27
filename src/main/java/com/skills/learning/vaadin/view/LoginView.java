package com.skills.learning.vaadin.view;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.spring.navigator.SpringNavigator;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.Notification;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.declarative.Design;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

@SpringView(name = LoginView.VIEW_NAME)
public class LoginView extends VerticalLayout implements View {
    public static final String VIEW_NAME = "login";

    @Autowired
    private SpringNavigator navigator;

    @PostConstruct
    private void init() {
        Design.read(this);
        addComponent(new Label("This is login"));
    }

    private void logout(){
    }

    @Override
    public void enter(ViewChangeListener.ViewChangeEvent event) {
        Notification.show("login");
    }
}
