import { PLANCK_CONSTANT,EMPLOYEE_TABLE_NAME } from "./constants";

function example(input) {

        // ok:
        dangerous(input);

        // deep: dangerous-call-to-employees1
        dangerous(EMPLOYEE_TABLE_NAME);
        
        var table_name = "Employees";
        // rule-id: dangerous-call-to-employees1   
        dangerous(table_name);

        // rule-id: dangerous-call-to-employees1
        dangerous("Employees");
}



