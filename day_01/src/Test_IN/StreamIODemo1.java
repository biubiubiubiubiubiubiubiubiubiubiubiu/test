package Test_IN;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class StreamIODemo1 {
	public static void main(String[] args) {
		try {
			//创建读取指定路径文件的对象 is，
			InputStream is = new FileInputStream("C:\\Users\\赵金鑫\\Desktop\\abc.txt");//任何一个文件都是由字节组成的,is 相当于一个可以装无数个字节的容器,里面有无数的字节
			
			//读取这个文件中的前 6 个字节（读取文件内容），并输出          
			//read()方法一次只能读取一个字节，并且当前被读取的第一个，被读取过的字节无法在同一次中再次被读取，所以不需要控制输出哪一个字节
			System.out.println(is.read());  //输出的是ASCII码  49，因为 49 代表的就是数字 1，被读取后 49 就不能在这一次中被再次读取，第一个就变成了50，下一次读取的就是 50，以此类推 
			System.out.println(is.read());  //输出的是ASCII码  50
			System.out.println(is.read());  //输出的是ASCII码  51
			System.out.println(is.read());  //输出的是ASCII码  52
			System.out.println(is.read());  //输出的是ASCII码  53
			
			//方法一：我想要读取输出的不是ASCII码值，是ASCII码的值，比如 读取到的是 1，将他转换成char类型，输出的就是 
			System.out.println((char)is.read());  //输出的是 6 
			
			//方法二：读取这个文件中的第一个字节（读取文件的内容），转换成char并输出
			char c = (char)is.read();
			System.out.println(c);  //输出的就是文件中的 1
			
			//使用后一定要关闭
			is.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
