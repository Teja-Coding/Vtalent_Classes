package Com.org.Interface;
//wrp for the below requrements
// create 3 interface and perform Hirearchical level interface
//create 2 implemention class
public interface ParentClass {
	void building1();
}
interface Son1 extends ParentClass{
	void building2();
}
interface Son2 extends ParentClass{
	void building3();
}