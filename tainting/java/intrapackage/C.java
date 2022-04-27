package pack1;

// no need to qualify A and B below when in the same package

public class C {
    int c() {
        //MATCH:
        sink(user_input);

        //DEEP:
        sink(A.a());

        //DEEP: extra deep!
        sink(B.b());

        return 0;
    }
}
