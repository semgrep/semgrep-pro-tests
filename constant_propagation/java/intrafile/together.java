package pack1;

class Bar {
    static final int CST = 1;
    
    int bar_trivial() {
	//MATCH:
	return 1;
    }

    int bar_simple() {
	//MATCH:
	return CST;
    }

    int bar_intrafile() {
	//DEEP:
	return Foo.CST;
    }
}

public class Foo {
    final static int CST = 1;
}
