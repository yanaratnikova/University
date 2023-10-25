package org.example.controler;

import org.example.data.User;

public interface UserControler <T extends User> {
    T create(String firstName, String secondName, String lastName);
}


