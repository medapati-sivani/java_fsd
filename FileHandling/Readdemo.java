package p1;

import java.io.FileReader;

public class Readdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] data=new char[100];
		try {
			FileReader input=new FileReader("C:\\\\Users\\\\SIVANI\\\\OneDrive\\\\Desktop\\\\workspace\\\\Data1.txt");
			input.read(data);
			System.out.println("Data Recieved From file");
			System.out.println(data);
			input.close();
		}
		catch(Exception e) {
			System.out.println("Error While Reading data"+e);
		}
	}

}
