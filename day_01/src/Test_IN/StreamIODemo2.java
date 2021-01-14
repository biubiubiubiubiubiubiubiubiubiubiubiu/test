package Test_IN;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class StreamIODemo2 {
	public static void main(String[] args) {
		try {
			//������ȡָ��·���ļ��Ķ��� is��
			InputStream is = new FileInputStream("C:\\Users\\�Խ���\\Desktop\\abc.txt");//�κ�һ���ļ��������ֽ���ɵ�,is �൱��һ������װ�������ֽڵ�����,�������������ֽ�
			
			//֮ǰ������ķ�ʽ�ٶ�̫�������ļ����ݺܶ��ʱ����Ҫд�ܶ��еĴ��룬����������ķ�ʽ���
			byte[] b = new byte[10];  //һ������װ 10 ���ֽڵ�����
			is.read(b);  //һ�ξͿ������ļ���� 10 ���ֽ�

			//��ѭ����������ķ�ʽ����ļ�������
			for (byte bContent : b) {
				System.out.println(bContent);
			}
			
			//ʹ������ķ�ʽ��������ļ���һ�����߶�������ݣ���������������Ķ���ASCII�룬�Ķ���̫�ͣ����Խ�����ǿת
			for (byte bContent : b) {
				System.out.println((char)bContent);  //����ľ����ļ��е�ԭ���ݣ�������ASCII��
			}
			
			//��ȡ����ļ��еĵ�һ���ֽڣ���ȡ�ļ����ݣ��������ת����char
			char c = (char)is.read();
			System.out.println(c);  //����ľ����ļ��е� 1
			
			
			//ʹ�ú�һ��Ҫ�ر�
			is.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
