package com.skills.learning.vaadin.view;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.spring.navigator.SpringNavigator;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.Notification;
import com.vaadin.ui.VerticalLayout;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

@SpringView(name = AccountView.VIEW_NAME)
public class AccountView extends VerticalLayout implements View {
    public static final String VIEW_NAME = "account";

    @Autowired
    private SpringNavigator navigator;

    @PostConstruct
    void init() {
        addComponent(new Label("This is a user view"));
        Button mainPage = new Button("Main page", event -> navigator.navigateTo(IndexView.VIEW_NAME));
        addComponent(mainPage);
        addComponent(new Button("Logout", event -> {
        }));
    }

    @Override
    public void enter(ViewChangeListener.ViewChangeEvent event) {
        Notification.show("user");
    }
}
