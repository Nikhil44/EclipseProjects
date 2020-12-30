package constructorChaining;

public class ChildClass extends SuperClass {
	public ChildClass() {
		this(10);
		System.out.println("No Arg ChildClass Constructor");
	}

	public ChildClass(int x) {
		super(x);
		System.out.println("One Arg ChildClass Constructor");
	}

	public static void main(String[] args) {
		ChildClass ch = new ChildClass();
		ch.method1(10);
		ch.method1(10, 20);

	}

	public final void method1(int a) {
System.out.println("the value of a is :"+ a);
	}

	public final void method1(int a, int b) {
		System.out.println("the value of a is :"+ (b+a));

	}
}
