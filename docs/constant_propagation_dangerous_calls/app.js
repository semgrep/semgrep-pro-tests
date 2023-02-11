import { PLANCK_CONSTANT,EMPLOYEE_TABLE_NAME } from "./constants";

function example(input) {


    // rule-id: dangerous-call1
    dangerous("Select * FROM " + input);

    // deep: dangerous-call1
    dangerous("Select * FROM " + PLANCK_CONSTANT);

    // ok:        
    dangerous("Select * FROM " + EMPLOYEE_TABLE_NAME);
}



