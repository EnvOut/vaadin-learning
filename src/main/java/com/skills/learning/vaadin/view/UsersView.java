package com.skills.learning.vaadin.view;

import com.vaadin.navigator.View;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.Grid;
import com.vaadin.ui.VerticalLayout;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.annotation.PostConstruct;
import java.util.LinkedList;
import java.util.List;

@SpringView(name = UsersView.VIEW_NAME)
public class UsersView extends VerticalLayout implements View {
    public static final String VIEW_NAME = "users";

    @PostConstruct
    private void init() {
        setSizeFull();

        List<User> userList = new LinkedList<>();
        for (Integer i = 0; i < 1000; i++)
            userList.add(new User("name" + i, i));

        Grid<User> grid = new Grid<>();

        Grid.Column<User, Integer> ageColumn = grid.addColumn(User::getAge);
        ageColumn.setCaption("#");
        ageColumn.setMaximumWidth(100);
        Grid.Column<User, String> nameColumn = grid.addColumn(i->{
            System.out.println(i.toString());
            return i.getName();
        });

        grid.addColumn(User::getName);
//        nameColumn.setEditable(false);


        grid.setItems(userList);
        addComponent(grid);
    }

    @Data
    @AllArgsConstructor
    public class User {
        private String name;
        private int age;
    }
}
