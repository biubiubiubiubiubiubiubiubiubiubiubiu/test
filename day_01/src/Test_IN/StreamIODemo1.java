package Test_IN;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class StreamIODemo1 {
	public static void main(String[] args) {
		try {
			//������ȡָ��·���ļ��Ķ��� is��
			InputStream is = new FileInputStream("C:\\Users\\�Խ���\\Desktop\\abc.txt");//�κ�һ���ļ��������ֽ���ɵ�,is �൱��һ������װ�������ֽڵ�����,�������������ֽ�
			
			//��ȡ����ļ��е�ǰ 6 ���ֽڣ���ȡ�ļ����ݣ��������          
			//read()����һ��ֻ�ܶ�ȡһ���ֽڣ����ҵ�ǰ����ȡ�ĵ�һ��������ȡ�����ֽ��޷���ͬһ�����ٴα���ȡ�����Բ���Ҫ���������һ���ֽ�
			System.out.println(is.read());  //�������ASCII��  49����Ϊ 49 ����ľ������� 1������ȡ�� 49 �Ͳ�������һ���б��ٴζ�ȡ����һ���ͱ����50����һ�ζ�ȡ�ľ��� 50���Դ����� 
			System.out.println(is.read());  //�������ASCII��  50
			System.out.println(is.read());  //�������ASCII��  51
			System.out.println(is.read());  //�������ASCII��  52
			System.out.println(is.read());  //�������ASCII��  53
			
			//����һ������Ҫ��ȡ����Ĳ���ASCII��ֵ����ASCII���ֵ������ ��ȡ������ 1������ת����char���ͣ�����ľ��� 
			System.out.println((char)is.read());  //������� 6 
			
			//����������ȡ����ļ��еĵ�һ���ֽڣ���ȡ�ļ������ݣ���ת����char�����
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
