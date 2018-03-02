package com.skills.learning.vaadin.view;


import com.vaadin.navigator.View;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window;

import javax.annotation.PostConstruct;

@SpringView(name = WindowView.VIEW_NAME)
public class WindowView extends VerticalLayout implements View {
    public final static String VIEW_NAME = "window";

    @PostConstruct
    private void init(){
//        Window window = new Window("Window");
//        window.setClosable(false);
//        addComponent(window);
    }
}
