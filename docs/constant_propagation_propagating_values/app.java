package com.example;
import com.main.Constants.EMPLOYEE_TABLE_NAME;

public class App {

    public void example(String user_input) {

        // ok:
        dangerous(user_input);

        // deep: dangerous-call-to-employees
        dangerous(EMPLOYEE_TABLE_NAME);
        
        String table_name = "Employees";
        // rule-id: dangerous-call-to-employees   
        dangerous(table_name);

        // rule-id: dangerous-call-to-employees
        dangerous("Employees");
    }

}
