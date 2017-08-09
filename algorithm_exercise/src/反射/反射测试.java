package 反射;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class 反射测试 {
	
	public static void main(String args[]) throws IllegalArgumentException, InvocationTargetException,
			NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException {
		Class<Person> pt = Person.class;
		String name = pt.getName();
		//方法
		Method[] methods = pt.getDeclaredMethods();
		//属性
		Field[] fields = pt.getDeclaredFields();
		//构造函数
		Constructor<?>[] con = pt.getDeclaredConstructors();		
		System.out.println(name);
		for (int i = 0; i < methods.length; i++) {
			System.out.print(methods[i].getName() + " ");
		}
		System.out.println();
		for (int i = 0; i < fields.length; i++) {
			System.out.print(fields[i].getName() + " ");
		}
		System.out.println();
		for (int i = 0; i < con.length; i++) {
			System.out.print(con[i].getName() + " ");
		}
		System.out.println();
		//通过反射获取具体的方法
		Method get = pt.getDeclaredMethod("getName");
		Method set = pt.getDeclaredMethod("setName", new Class[] { String.class });
		Person p = pt.newInstance();
		//通过反射给对象赋值
		set.invoke(p, new Object[] { "zhangsan" });
		//通过反射获取对象的值
		String result = (String) get.invoke(p);
		System.out.println(result);

	}

}
