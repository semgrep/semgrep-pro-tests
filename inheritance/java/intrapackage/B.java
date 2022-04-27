package pack1;

//DEEP: even semgrep does not report this one
class B extends A {
    int bar() {
	return 2;
    }
}
