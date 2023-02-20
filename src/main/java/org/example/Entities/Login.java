package org.example.Entities;

import java.util.HashMap;

public class Login {
    HashMap<String, String> data;

    public Login() {
        data = new HashMap<String, String>();
        data.put("Carlos", "1234");
    }

    public boolean isValidLogin(String username, String password) {
        String u = data.get(username);
        if (u == null) return false;

        return u.equals(password);
    }
}
