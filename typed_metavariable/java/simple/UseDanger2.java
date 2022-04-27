package pack1;
import pack1.Danger;

class UseDanger2 {
    int test() {
	//MATCH: semgrep finds this one
	int nope = (new Danger()).get();
    }
}
