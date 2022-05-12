package com.example;

public class App {

    public void read_input() {
        return trim(get_user_input("example"));
    }

    public void example(String safe_input) {
        String user_input = get_user_input("example");
        String still_user_input = read_input();

        // rule-id: dangerous-call
        dangerous("Select * FROM " + user_input);

        // rule-id: dangerous-call
        dangerous("Select * FROM " + still_user_input);

        // ok:        
        dangerous("Select * FROM " + safe_input);
    }

}
