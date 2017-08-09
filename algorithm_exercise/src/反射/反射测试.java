package ����;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ������� {
	
	public static void main(String args[]) throws IllegalArgumentException, InvocationTargetException,
			NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException {
		Class<Person> pt = Person.class;
		String name = pt.getName();
		//����
		Method[] methods = pt.getDeclaredMethods();
		//����
		Field[] fields = pt.getDeclaredFields();
		//���캯��
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
		//ͨ�������ȡ����ķ���
		Method get = pt.getDeclaredMethod("getName");
		Method set = pt.getDeclaredMethod("setName", new Class[] { String.class });
		Person p = pt.newInstance();
		//ͨ�����������ֵ
		set.invoke(p, new Object[] { "zhangsan" });
		//ͨ�������ȡ�����ֵ
		String result = (String) get.invoke(p);
		System.out.println(result);

	}

}
