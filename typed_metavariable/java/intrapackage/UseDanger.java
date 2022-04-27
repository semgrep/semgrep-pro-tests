package pack1;

class UseDanger {
    int test() {
	Danger d;
	NotDanger n;

	//DEEP: even semgrep does not report this one
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
