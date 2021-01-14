package Test_IN;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class StreamIODemo2 {
	public static void main(String[] args) {
		try {
			//创建读取指定路径文件的对象 is。
			InputStream is = new FileInputStream("C:\\Users\\赵金鑫\\Desktop\\abc.txt");//任何一个文件都是由字节组成的,is 相当于一个可以装无数个字节的容器,里面有无数的字节
			
			//之前的输出的方式速度太慢，当文件内容很多的时候，需要写很多行的代码，下面用数组的方式输出
			byte[] b = new byte[10];  //一个可以装 10 个字节的数组
			is.read(b);  //一次就可以在文件里读 10 个字节

			//用循环遍历数组的方式输出文件的内容
			for (byte bContent : b) {
				System.out.println(bContent);
			}
			
			//使用上面的方式可以输出文件里一个或者多个的内容，但是这样输出来的都是ASCII码，阅读性太低，可以将他们强转
			for (byte bContent : b) {
				System.out.println((char)bContent);  //输出的就是文件中的原内容，并不是ASCII码
			}
			
			//读取这个文件中的第一个字节（读取文件内容），并输出转换成char
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
