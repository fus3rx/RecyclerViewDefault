package com.imaginers.onirban.recyclerviewdefault.Model;

/**
 * Created by tonmo on 9/24/2017.
 */

public class Friend {
    private String name;
    private String email;

    public Friend(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
