package example;

public class App {
    public void check(String s) {
        if (is_bad(s)) {
            // rule-id: throw-exception-example
            throw new ExampleException(s);
        }
    }

    public void check2(String s) {
        if (is_bad(s)) {
            // deep: throw-exception-example
            throw new BadRequest(s);
        }
    }
}

