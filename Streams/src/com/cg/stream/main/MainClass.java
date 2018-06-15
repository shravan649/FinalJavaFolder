package com.cg.stream.main;
import java.io.File;
import java.io.IOException;
import com.cg.stream.beans.ByteStream;
import com.cg.stream.beans.Serializable;
public class MainClass {
	public static void main(String[] args) {
		try{
			File file=new File("d:\\Associate.txt");
			Serializable.doSerialization(file);
			Serializable.doDeSerialization(file);
		}
		catch(Exception e){
			e.printStackTrace();
		}

	}
}		
/*		try {
			File file1=new File("d:\\FLPDataFile1.txt");
			if(!file1.exists())
				file1.createNewFile();
			File file2=new File("d:\\FLPDataFile2.txt");
			if(!file2.exists())
				file2.createNewFile();
			ByteStream.byteReadWriteWork(file1, file2);
			System.out.println(file1.length());
			System.out.println(file1.canRead());
			System.out.println(file1.canWrite());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}*/