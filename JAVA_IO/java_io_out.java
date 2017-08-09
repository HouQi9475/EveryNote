import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class java_io_out {
	public static void main(String[] args) {
         String filepath="d:/1.txt";
         String content="FY-88-88888";
         java_io_out out=new java_io_out();
         out.write(filepath, content);
	}
	public void write(String filepath,String content) {
		FileOutputStream fos=null;
		try {
			//1、根据文件路径创建输出流
			fos=new FileOutputStream(filepath);
			//2,把string转换为byte数组
			byte[] arr=content.getBytes();
			//将数组写入
			fos.write(arr);
			System.out.println("wrote successed!");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(fos!=null) {
				try {
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
