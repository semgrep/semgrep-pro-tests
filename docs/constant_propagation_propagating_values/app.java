package com.example;
import com.main.Constants.EMPLOYEE_TABLE_NAME;

public class App {

    public void example(String user_input) {

        // ok:
        dangerous("Select * FROM " + user_input);

        // rule-id: dangerous-call-to-employees
        dangerous("Select * FROM " + EMPLOYEE_TABLE_NAME);
        
        String table_name = "Employees";
        // rule-id: dangerous-call-to-employees   
        dangerous("Select * FROM " + table_name);

        // rule-id: dangerous-call-to-employees
        dangerous("Select * FROM Employees");
    }

}
