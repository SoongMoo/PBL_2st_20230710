package cooperation;

public class Reference1 {
	int i;
	Reference r;
	public int getI() {
		return i;
	}
	public int setI(int i) {
		this.i = i;
		this.i = 4;
		return this.i;
	}
	public Reference getR() {
		return r;
	}
	public void setR(Reference r) {
		this.r = r; // ref
		r.setI(300);
	}
}
