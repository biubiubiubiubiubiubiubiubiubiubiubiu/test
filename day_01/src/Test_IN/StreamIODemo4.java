package Test_IN;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class StreamIODemo4 {
	public static void main(String[] args) {
		try {
			//������ȡָ��·���ļ��Ķ��� is��
			InputStream is = new FileInputStream("C:\\Users\\�Խ���\\Desktop\\abc.txt");//�κ�һ���ļ��������ֽ���ɵ�,is �൱��һ������װ�������ֽڵ�����,�������������ֽ�
			
			byte[] b = new byte[10];
			int length = 0;  //�洢ÿ�ζ����,���׶��˼���...�����-1,��ʾ������
			while((length=is.read(b)) != -1) {
				for (byte bContent : b) {
					System.out.println((char)bContent);  //�������������ݶ���7����������ĸ���n���ڣ�n = ����ĳ��� * 2  -  �ļ���ʵ�ʵ��ֽڳ���
				}
			}//��Ȼ����������ݣ����Ƕ�����������û�б�����ĳ��������ƣ����������Ķ����ļ�����������ݡ�
			
			//ʹ�ú�һ��Ҫ�ر�
			is.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
