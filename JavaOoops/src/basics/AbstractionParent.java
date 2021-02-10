package basics;

   abstract class AbstractionParent {
	 
	 public static void main(String[] args) {
			System.out.println("Creating main method in abstract class");
			AbstractionParent.method1();
			AbstractionParent.method2();
			AbstractionParent.method3();
			
			
	
		}

		public static void method1() {

			System.out.println("This is  public static method in abstract");

		}
		  static void method2() {
			  System.out.println("this is default static method");
			
		}

		private static void method3() {

			System.out.println("This is private static method in abstract");
		}

		 abstract void method4(); 
		
		 public final  void method5() {

			System.out.println("This is  mon static method in abstract");
		}
	}

	


