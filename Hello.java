package com.hpe;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGEncodeParam;
import com.sun.image.codec.jpeg.JPEGImageEncoder;
import com.weblogic.Security;


public class Hello {
 public static void main(String a[]) {
	 System.getenv();
	 System.getProperties();
	 try
	 {
	     String line;
	     File file = new File("C:\\TEST\test.csv");
	     BufferedReader inFile = new BufferedReader(new FileReader(file));
	     while((line = inFile.readLine()) != null)
	     {
	             System.out.println(line);
	     }
	     inFile.close();
	 }
	 catch (IOException e)
	 {
	     System.out.println("problem with file");
	 }
 }
}
