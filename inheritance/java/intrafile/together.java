package pack1;

//DEEP: even semgrep does not report this one! because it's not resolved to pack1.A
class B extends A {
    int bar() {
	return 2;
    }
}

//DEEP:
class C extends B {
    int bar() {
	return 0;
    }
}

//DEEP: extra deep!
class D extends C {
    int bar() {
	return 0;
    }
}

public class A {
    final static int cst = 1;
}
