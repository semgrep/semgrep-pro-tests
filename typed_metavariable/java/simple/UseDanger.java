package pack1;
import pack1.Danger;
import pack1.DangerFactory;    
import pack1.DangerField;    

class UseDanger {
    int test() {
	Danger d;
	NotDanger n;

	//MATCH:
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
