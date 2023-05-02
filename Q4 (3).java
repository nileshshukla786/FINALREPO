package Java_IO_25_april_serialization;

import java.io.File;

public class Q4 {

	public static void main(String[] args) {
		 
		File f = new File("c:\\nodejs");
		///1 option  
		String t[]=f.list();
	     for(String k:t)
	     {
		   System.out.println(k);
	     }
	     
     //second option to list files or directory from specific folder 
    File j[]= f.listFiles();
    for(File k:j)
    {  
    	if(k.isDirectory())
	   System.out.println(k);
    }
   
	}

}
