package pack1;

class A {
    public String a() {
        return user_input;
    }
}

class B {
    public String b() {
        return A.a();
    }
}

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
