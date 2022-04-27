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

    int bar_interfile() {
	//DEEP: no need to qualify Foo when in same package, no need to import
	return Foo.CST;
    }
}
