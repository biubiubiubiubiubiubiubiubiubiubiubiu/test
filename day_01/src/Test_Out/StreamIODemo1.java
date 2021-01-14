package Test_Out;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class StreamIODemo1 {

	public static void main(String[] args) {
		
		try {
			//创建写入 os 对象并在指定路径下创建文件
			OutputStream os = new FileOutputStream("C:\\Users\\赵金鑫\\Desktop\\abc2.txt");
			
			//write()里只能写数字，即ASCII码值
			//向创建的文件里 写入 数据，写入的数据同样是ASCII码值，比如你写入的是 66，ASCII码中 66 代表的就是 大写字母 B，那文件里显示的就是 B
			os.write(48);  //0
			os.write(49);  //1
			os.write(50);  //2
			os.write(51);  //3
			os.write(52);  //4
			
			os.write(60);  //B
			
			//但如果非要我用write()向文件中写入的什么，就在文件中显示什么的话，也是有办法的
			String strContent = "这是字符串通过使用 getByte()这个方法写入的内容，即写入的是什么，在文件里显示的就是什么";
			os.write(strContent.getBytes());
			
			//关闭
			os.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
