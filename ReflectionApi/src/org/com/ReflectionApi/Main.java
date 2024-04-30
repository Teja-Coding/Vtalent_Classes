package org.com.ReflectionApi;

import java.lang.reflect.Method;
import java.text.DateFormat.Field;

public class Main {
	public static void main(String[] args) throws Exception {
        MyClass obj = new MyClass(42);

        // Accessing and modifying private field using Reflection
        java.lang.reflect.Field field = obj.getClass().getDeclaredField("myField");
        field.setAccessible(true);
        int value = (int) field.get(obj);
        System.out.println("Value of myField before modification: " + value);
        field.set(obj, 123);
        value = (int) field.get(obj);
        System.out.println("Value of myField after modification: " + value);

        // Accessing private method using Reflection
        Method method = obj.getClass().getDeclaredMethod("myPrivateMethod");
        method.setAccessible(true);
        method.invoke(obj);
	}
}
