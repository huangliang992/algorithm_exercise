package IONIO.序列化;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.InputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class 装饰模式测试  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 807800984460068324L;

	public static void main(String args[]) throws FileNotFoundException{
		File file = new File("");
		InputStream is = new FileInputStream(file);
		FilterInputStream f = new BufferedInputStream(is);
		List l = new ArrayList<String>();
	}
}
