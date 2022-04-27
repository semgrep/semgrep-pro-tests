package com.example;
import com.main.Constants.EMPLOYEE_TABLE_NAME;

public class App {

    public void example(String user_input) {

        // OK:
        dangerous("Select * FROM " + user_input);

        // DEEP:
        dangerous("Select * FROM " + EMPLOYEE_TABLE_NAME);
        
        String table_name = "Employees";
        // MATCH:
        dangerous("Select * FROM " + table_name);

        // MATCH:
        dangerous("Select * FROM Employees");
    }

}
