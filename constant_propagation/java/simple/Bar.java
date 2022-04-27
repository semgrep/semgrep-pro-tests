package pack1;

import pack1.Foo;

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

    int bar_interfile() {
	//DEEP:
	return Foo.CST;
    }
}
