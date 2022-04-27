package pack1;

class Foo {
    public String a() {
        return user_input;
    }

    public String b() {
        return a();
    }

    public int c() {
        //DEEP:
        return sink(b());
    }
}
