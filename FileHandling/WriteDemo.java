package p1;
import java.io.FileWriter;
public class WriteDemo {
	public static void main(String args[]) {
		String data="Hello World\n";
		try {
		FileWriter output= new FileWriter("C:\\\\Users\\\\SIVANI\\\\OneDrive\\\\Desktop\\\\workspace\\\\Data1.txt");
		output.write(data);
		System.out.println("Output is written succesfully");
		output.close();
		}
		catch(Exception e) {
			System.out.println(" Error!!!");
		}
	}
}
