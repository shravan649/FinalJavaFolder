package com.cg.stream.beans;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStream {
	public static void byteReadWriteWork(File fromFile,File toFile) throws IOException{
		try(BufferedInputStream src=new BufferedInputStream(new FileInputStream(fromFile))){
			try(BufferedOutputStream dest=new BufferedOutputStream(new FileOutputStream(toFile))){
				int a=0;
				while((a=src.read())!=-1){
					System.out.println((char)a);
				}	
				byte [] dataBuffer=new byte[(int) fromFile.length()];
				src.read(dataBuffer);
				System.out.println(new String(dataBuffer));
			}			
		}
	}		
}		




















/*		FileInputStream src=new FileInputStream(fromFile);
		FileOutputStream dest =new FileOutputStream(toFile);
		//1stway for src
		int a=0;
		while((a=src.read())!=-1){
			System.out.println((char)a);
		}
		//2ndway for src
		byte [] dataBuffer=new byte[(int) fromFile.length()];
		src.read(dataBuffer);
		System.out.println(new String(dataBuffer));

		//1st way for dest
		int b=0;
		while((a=src.read())!=-1){
			dest.write(b);
		}	
		//2ndway for dest
		byte [] dataBuffer1=new byte[(int) fromFile.length()];
		src.read(dataBuffer1);
		dest.write(dataBuffer1);
	}
}*/

