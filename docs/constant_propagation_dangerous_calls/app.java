package com.example;
import com.main.Constants.EMPLOYEE_TABLE_NAME;

public class App {

    public void example(String user_input) {

        // rule-id: dangerous-call
        dangerous("Select * FROM " + user_input);

        // rule-id: dangerous-call
        dangerous("Select * FROM " + EMPLOYEE_TABLE_NAME);
        
        String table_name = "Employees";
        // ok:        
        dangerous("Select * FROM " + table_name);

        // ok:
        dangerous("Select * FROM Employees");
    }

}
