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

@SpringView(name = IndexView.VIEW_NAME)
public class IndexView extends VerticalLayout implements View {
    public static final String VIEW_NAME = "";

    @Autowired
    private SpringNavigator navigator;

    @PostConstruct
    void init() {
        addComponent(new Label("This is the index view"));
    }

    @Override
    public void enter(ViewChangeListener.ViewChangeEvent event) {
        Notification.show("index");
    }
}
