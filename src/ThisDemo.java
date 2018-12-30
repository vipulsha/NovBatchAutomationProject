
public class ThisDemo {
	int someVariable;
	
	public void setVariable(int someVariable) {
		this.someVariable = someVariable;
	}
	
	public static void main(String[] args) {
		ThisDemo d = new ThisDemo();
		d.setVariable(10);
		
		ThisDemo d2 = new ThisDemo();
		d2.setVariable(10);
		
		
	}
}
