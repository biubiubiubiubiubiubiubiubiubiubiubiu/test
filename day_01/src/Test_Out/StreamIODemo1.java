package Test_Out;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class StreamIODemo1 {

	public static void main(String[] args) {
		
		try {
			//����д�� os ������ָ��·���´����ļ�
			OutputStream os = new FileOutputStream("C:\\Users\\�Խ���\\Desktop\\abc2.txt");
			
			//write()��ֻ��д���֣���ASCII��ֵ
			//�򴴽����ļ��� д�� ���ݣ�д�������ͬ����ASCII��ֵ��������д����� 66��ASCII���� 66 ����ľ��� ��д��ĸ B�����ļ�����ʾ�ľ��� B
			os.write(48);  //0
			os.write(49);  //1
			os.write(50);  //2
			os.write(51);  //3
			os.write(52);  //4
			
			os.write(60);  //B
			
			//�������Ҫ����write()���ļ���д���ʲô�������ļ�����ʾʲô�Ļ���Ҳ���а취��
			String strContent = "�����ַ���ͨ��ʹ�� getByte()�������д������ݣ���д�����ʲô�����ļ�����ʾ�ľ���ʲô";
			os.write(strContent.getBytes());
			
			//�ر�
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
