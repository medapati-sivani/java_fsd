package main;

import java.io.File;

import java.util.Arrays;

import java.util.Scanner;

public class App {
public static void main(String args[]) {
	 System.out.println("\n**************************************\n");
     System.out.println("\tWelcome to TheDesk \n");
     System.out.println("**************************************");
     File folder=new File("C:\\Users\\SIVANI\\OneDrive\\Desktop\\myrepo");
     Scanner sc = new Scanner(System.in);
     String con,abc;
     
     
     
     do {
    	 System.out.println("\n 1: Retrive file names\n 2: Operations\n 3: Close Application");
			System.out.println("Enter your choice");
			int key = sc.nextInt();
			if(key==3) {
				System.out.println("Thanku!!");
				break;
			}
			  switch (key) {
			  case 1: 
				  File arr[] = folder.listFiles();
                  Arrays.sort(arr);
                  for(File file:arr) {
                	  if (file.isDirectory()) {
                          System.out.println("DIR \t" + file.getName());
                       } else {
                          System.out.println("FILE\t" + file.getName());
                       }
                  }
                  break;
                  /*for(int i=0;i<arr.length;i++)
                      System.out.println(arr[i]);
				  	break;*/
			  case 2:
				  	do {
				  		System.out.println("\n 1: Add a File\n 2: Delete a File\n 3: Search a File\n 4: Move to main menu");
				  		System.out.println("Enter your choice");
				  		int ch=sc.nextInt();
				  		if(ch==4) {
				  			System.out.println("Return to main menu");
				  			break;
				  		}
				  		switch(ch) {
				  		case 1:System.out.println("Enter a file name");
                        String name = sc.next();
                        if(new File(folder,name).exists()){
                            System.out.println("file already exist");
                        }else {
                            File folder1 = new File(folder, name);
                            folder1.mkdir();
                            if (new File(folder, name).exists()) {
                                System.out.println("file added successfully");
                            }
                        }
				  			break;
				  		case 2:System.out.println("Enter a file name");
                        String name1 = sc.next();
                        boolean folder2 = new File(folder, name1).exists();
                        
                        if (folder2 == true) {
                            File folder3 = new File(folder, name1);
                            folder3.delete();
                            System.out.println("File successfully deleted");
                        } else {
                            System.out.println("file does not exist");
                        }
				  			break;
				  		case 3:
				  			String StrName="";
				  			try {
				  				String[] flist=folder.list();
				  				int flag=0;
				  				System.out.println("Enter File Name");
				  				StrName =sc.next();
				  				if(flist==null) {
				  					System.out.println("Empty Directory");
				  				}
				  				else {
				  					for(int i=0;i<flist.length;i++) {
				  						String filename = flist[i];
				  						if(filename.equalsIgnoreCase(StrName)) {
				  							System.out.println(flist[i]+" Found");
				  							flag=1;
				  							break;
				  						}
				  					}
				  				}
				  				if(flag==0)
				  				{
				  					System.out.println("File Not Found");
				  				}
				  			}
				  			catch(Exception e) {
				  				System.out.println("Error Occured");
				  			}
				  			break;
				  		
				  		default: System.out.println("Enter from above choice");
				  				break;
				  		}
				  		System.out.println("Do you want to continue\nPress Y to Continue");
				  	    abc=sc.next();
				  	}while(abc.equalsIgnoreCase("y"));
				  break;
				  		default :System.out.println("Choose correct option");
				  		break;
			  }
    	 
    System.out.println("Do you want to continue\nPress Y to Continue");
    con=sc.next();
     }while(con.equalsIgnoreCase("y"));
     
}
}
