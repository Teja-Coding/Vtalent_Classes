package org.com.Interface;

public interface Parent1 {
	void demo();
}
interface Parent2{
	void demo1();
}
interface Child extends Parent1,Parent2{
	void demo3();
}


