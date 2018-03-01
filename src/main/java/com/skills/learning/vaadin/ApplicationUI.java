package com.skills.learning.vaadin;

import com.skills.learning.vaadin.view.LayoutsView;
import com.skills.learning.vaadin.view.LoginView;
import com.skills.learning.vaadin.view.AccountView;
import com.skills.learning.vaadin.view.UsersView;
import com.vaadin.annotations.Theme;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewDisplay;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.spring.annotation.SpringViewDisplay;
import com.vaadin.spring.navigator.SpringNavigator;
import com.vaadin.ui.*;
import com.vaadin.ui.themes.ValoTheme;
import org.springframework.beans.factory.annotation.Autowired;

@SpringUI
@Theme("valo")
@SpringViewDisplay
//public class ApplicationUI extends UI implements ViewDisplay {
public class ApplicationUI extends UI  {
    @Autowired
    private SpringNavigator navigator;

//    @Autowired
    private LayoutsView layoutsView;

    private Panel springViewDisplay;

    @Override
    protected void init(VaadinRequest request) {

        final VerticalLayout root = new VerticalLayout();
        setMobileHtml5DndEnabled(true);
//        root.setSizeFull();
//        setContent(root);

//        final CssLayout navigationBar = new CssLayout();
//        navigationBar.addStyleName(ValoTheme.LAYOUT_COMPONENT_GROUP);
//        navigationBar.addComponent(createNavigationButton("Login",
//                LoginView.VIEW_NAME));
//        navigationBar.addComponent(createNavigationButton("Account",
//                AccountView.VIEW_NAME));
//        navigationBar.addComponent(createNavigationButton("Users",
//                UsersView.VIEW_NAME));
//        navigationBar.addComponent(createNavigationButton("Layouts",
//                LayoutsView.VIEW_NAME));

//        root.addComponent(navigationBar);

//        springViewDisplay = new Panel();
//        springViewDisplay.setSizeFull();
//        root.addComponent(springViewDisplay);
//        root.setExpandRatio(springViewDisplay, 1.0f);
//        setContent(layoutsView);
        setSizeFull();
        navigator.navigateTo(LayoutsView.VIEW_NAME);
    }

    private Button createNavigationButton(String caption, final String viewName) {
        Button button = new Button(caption);
        button.addStyleName(ValoTheme.BUTTON_FRIENDLY);
        // If you didn't choose Java 8 when creating the project, convert this
        // to an anonymous listener class
        button.addClickListener(event -> navigator.navigateTo(viewName));
        return button;
    }

//    @Override
//    public void showView(View view) {
//        springViewDisplay.setContent((Component) view);
//    }

}
