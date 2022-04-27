package pack1;

class Danger {
    int x;
    Danger() {
	x = 42;
    }
    int get() {
	return x;
    }
}

class DangerFactory {
    public static Danger makeDanger() {
	return new Danger();
    }
}

class DangerField {
    public Danger dgr;
    public static Danger dgr_static;
    public NotDanger safe;
    
    DangerField() {
    }
    
}


class UseDanger {
    int test() {
	Danger d;
	NotDanger n;

	//DEEP: even semgrep does not report this one because unqualified Danger
	int x_direct = d.get();

	int nope = n.get();

	//DEEP:
	int x_indirect = DangerFactory.makeDanger().get();

    }

   int test2() {
	DangerField o;

   	//DEEP:
	int x_indirect = DangerField.dgr_static.get();

   	//DEEP:
	int x_indirect2 = o.dgr.get();

	int nope = o.safe.get();

   }
}
