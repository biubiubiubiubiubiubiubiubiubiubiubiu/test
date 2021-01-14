package Test_IN;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class StreamIODemo4 {
	public static void main(String[] args) {
		try {
			//创建读取指定路径文件的对象 is，
			InputStream is = new FileInputStream("C:\\Users\\赵金鑫\\Desktop\\abc.txt");//任何一个文件都是由字节组成的,is 相当于一个可以装无数个字节的容器,里面有无数的字节
			
			byte[] b = new byte[10];
			int length = 0;  //存储每次对完后,到底读了几个...如果是-1,表示读完了
			while((length=is.read(b)) != -1) {
				for (byte bContent : b) {
					System.out.println((char)bContent);  //最后读出来的内容多了7个，多出来的个数n等于：n = 数组的长度 * 2  -  文件中实际的字节长度
				}
			}//虽然多出来了内容，但是读出来的内容没有被数组的长度所限制，可以完整的读出文件里的所有内容。
			
			//使用后一定要关闭
			is.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
