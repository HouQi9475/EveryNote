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
	 * 读取指定文件的内容
	 * @param filepath 文件的路径
	 */
	public String readFile(String filepath) {
		FileInputStream fis=null;
		String result="";
		try {
			//根据filepath路径实例化一个输入流对象

			fis=new FileInputStream(filepath);
			//2. 返回这个输入流中可以被读的剩下的bytes字节的估计值；
			int size=fis.available();
			//3,根据返回的字节数创建数组
			byte[] arr=new byte[size];
			System.out.println("可用数组大小:"+size);
			//4,把数据读到数组中
			fis.read(arr);
			//5,根据获取到的byte数据新建一个字符串，然后输入
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
