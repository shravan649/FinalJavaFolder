package com.cg.stream.beans;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
public class Serializable {
	public static void doSerialization(File file) throws FileNotFoundException, IOException {
		Associate associate=new Associate(95447, 22200, "shravan", "kumar");
		try(ObjectOutputStream dest =new ObjectOutputStream(new FileOutputStream(file))){
			dest.writeObject(associate);
		}
		System.out.println("Transferred Associate"+file.getAbsolutePath());
	}
	public static void doDeSerialization(File file) throws FileNotFoundException, IOException, ClassNotFoundException{
		try(ObjectInputStream src=new ObjectInputStream(new FileInputStream(file))){
			Associate associate=(Associate)src.readObject();
			System.out.println(associate); 
		}
	}
}