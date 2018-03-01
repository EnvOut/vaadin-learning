package com.skills.learning.vaadin.view;

import com.vaadin.navigator.View;
import com.vaadin.shared.Registration;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.*;
import lombok.experimental.var;
import lombok.val;

import javax.annotation.PostConstruct;

@SpringView(name = LayoutsView.VIEW_NAME)
public class LayoutsView extends VerticalLayout implements View {
    public static final String VIEW_NAME = "layouts";

    private VerticalLayout upperSection = new VerticalLayout();

    private VerticalLayout menuLayout = new VerticalLayout();
    private VerticalLayout contentLayout = new VerticalLayout();


    private VerticalSplitPanel verticalSplitPanel = new VerticalSplitPanel();

    private HorizontalSplitPanel horizontalSplitPanel = new HorizontalSplitPanel(menuLayout,contentLayout);

    private HorizontalLayout lowerLayout = new HorizontalLayout(horizontalSplitPanel);





    @PostConstruct
    private void init() {
        setSizeFull();

//        showBorders();

        upperSection.addComponents(new Button("Header"));
        addComponent(upperSection);
        upperSection.setSizeUndefined();
        upperSection.setHeight(5, Unit.PICAS);

        Button button = new Button("MENU");
        button.setEnabled(true);
        button.addClickListener(event -> System.out.println(""));
        menuLayout.addComponents(button);
        menuLayout.setSizeUndefined();

        contentLayout.addComponents(new Button("Content"));
        contentLayout.addComponents(new Button("Content2"));
        contentLayout.setMargin(true);
        menuLayout.setWidth("10%");
        contentLayout.setSizeFull();

        lowerLayout.setSizeUndefined();
//        lowerLayout.setExpandRatio(contentLayout, 2);

        addComponent(lowerLayout);
//        setExpandRatio(lowerLayout, 2);
    }

    private void showBorders() {
        String style = "v-ddwrapper-over";

        setStyleName(style);
        upperSection.setStyleName(style);
        lowerLayout.setStyleName(style);
        menuLayout.setStyleName(style);
        contentLayout.setStyleName(style);
    }
}
