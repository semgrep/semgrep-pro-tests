package example;

public class App {
    public void check(String s) {
        if (is_bad(s)) {
            // MATCH:
            throw new ExampleException(s);
        }
    }

    public void check2(String s) {
        if (is_bad(s)) {
            // DEEP:
            throw new BadRequest(s);
        }
    }
}
