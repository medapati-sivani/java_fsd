package p1;

import java.io.FileWriter;

public class FileAppend {
	public static void main(String args[]) {
		String data="This is appended data";
		try {
			FileWriter output=new FileWriter("C:\\\\Users\\\\SIVANI\\\\OneDrive\\\\Desktop\\\\workspace\\\\Data1.txt", true);
			output.write(data);
			System.out.println("Append Succesfully");
			output.close();
		}
		catch(Exception e) {
			System.out.println("Error While appending data");
		}
	}
}
