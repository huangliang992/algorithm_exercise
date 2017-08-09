package IONIO.序列化;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class 序列化测试 {

	public static void main(String args[]) throws IOException{
		Person p = new Person("zhangsan",19);
		File f = new File("D:"+File.separator+"person.txt");
		try {
			FileOutputStream fos = new FileOutputStream(f);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			System.out.println("序列化到stream");
			oos.writeObject(p);
			oos.close();
			System.out.println("序列化结束");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(fis);
		try {
			System.out.println("反序列化");
			Person pp = (Person) ois.readObject();
			System.out.println(pp.getName());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
