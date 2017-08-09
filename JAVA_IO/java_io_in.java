import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class java_io_in {

	public static void main(String[] args) {
		
        java_io_in in=new java_io_in();
        String filepath="d:/1.txt";
        String result=in.readFile(filepath);
        System.out.println(result);
	}
	/**
	 * ��ȡָ���ļ�������
	 * @param filepath �ļ���·��
	 */
	public String readFile(String filepath) {
		FileInputStream fis=null;
		String result="";
		try {
			//����filepath·��ʵ����һ������������

			fis=new FileInputStream(filepath);
			//2. ��������������п��Ա�����ʣ�µ�bytes�ֽڵĹ���ֵ��
			int size=fis.available();
			//3,���ݷ��ص��ֽ�����������
			byte[] arr=new byte[size];
			System.out.println("���������С:"+size);
			//4,�����ݶ���������
			fis.read(arr);
			//5,���ݻ�ȡ����byte�����½�һ���ַ�����Ȼ������
			result=new String(arr);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(fis!=null) {
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return result;
	}
	
}
