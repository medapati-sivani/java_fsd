package p1;
import java.io.File;
public class filecreation {
	public static void main(String args[]) {
		File myFile= new File("Data1.txt");
		//File mFile= new File("C:\\Users\\SIVANI\\OneDrive\\Desktop\\workspace\\Data1.txt");
		try {
			if(myFile.createNewFile())
			{
				System.out.println("Created Succesfully..");
			}
			else
			{
				System.out.println("File Creation error");
			}
		}
		catch (Exception e){
			System.out.println("File Error");
		}
		
	}
}
