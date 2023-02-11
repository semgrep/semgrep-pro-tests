import { readUser } from "./es6/es6";

const readUser2 = require("./commonjs/common")

function example(safe_input) {

    // rule-id: dangerous-call
    dangerous("Select * FROM " + readUser());

    // deep: dangerous-call
    dangerous("Select * FROM " + readUser2());

    // ok:        
    dangerous("Select * FROM " + safe_input);
}



