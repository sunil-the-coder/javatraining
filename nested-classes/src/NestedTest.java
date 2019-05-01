
class Outer {

	class Inner {
		public void disp() {
			System.out.println("inner disp called..");
		}
	}

	public void disp() {
		System.out.println("outer disp called..");
	}
}

public class NestedTest {

	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.disp();
		
		//1. Creating inner class object ( non-static nested class )
		Outer.Inner inner = outer.new Inner();
		inner.disp();
		
		//2. Directly creating inner with outer object 
		//(Both objects will be created)
		Outer.Inner obj = new Outer().new Inner(); 
		obj.disp();
		
	}
}
