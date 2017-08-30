package test;


	class Parent{
	Parent()
	{
		System.out.println("Parent");
	}
	public void relation(){
		System.out.println("teacher");
	}
	}
	class Child extends Parent{
		Child()
		{
			System.out.println("Child");
		}
		public void relation(){
			System.out.println("student");
		}
		}
	public class Test {
		public static void main(String[] args) {
			Parent chld=new Child();
			chld.relation();
}
}
