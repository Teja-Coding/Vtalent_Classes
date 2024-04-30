package Com.org.Interface.Multiple;

public interface Parent1 {
	void properties();
}


interface Parent2{
	void properties2();
}

interface Child extends Parent1,Parent2{
	void properties3();
}
