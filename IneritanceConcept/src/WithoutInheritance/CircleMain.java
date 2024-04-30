package WithoutInheritance;

public class CircleMain {
	public static void main(String[] args) {
		Circe c1=new Circe();
		c1.rotate();
		
		Reatangle r1 =new Reatangle();
		r1.rotate();
		
		Triangle t1=new Triangle();
		t1.rotate();
	}
}
class Circe{
	public void rotate() {
		System.out.println("rotate in clock wise");
	}
}
class Reatangle{
	public void rotate() {
		System.out.println("rotate in clock wise");
	}
}
class Triangle{
	public void rotate() {
		System.out.println("rotate in clock wise");
	}
}

