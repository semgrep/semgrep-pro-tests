function example(safe_input) {
    const user_input = get_user_input("example");
    const still_user_input = read_input();

    // rule-id: dangerous-call
    dangerous("Select * FROM " + user_input);

    // deep: dangerous-call
    dangerous("Select * FROM " + still_user_input);

    // ok:        
    dangerous("Select * FROM " + safe_input);
}

function read_input() {
return get_user_input("example");
}

