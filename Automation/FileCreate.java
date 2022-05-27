package com.files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCreate {

	public static void main(String[] args) throws IOException {
	
		//File access or file create
		File f = new File("G://File_Program.txt");
		if(f.exists())
		{
			System.out.println("File Exists");
		}
		else
		{
			try
			{
				f.createNewFile();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
		//for writing data in file we must open file first
		FileWriter fw = new FileWriter("G://File_Program.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("This data write from java program in eclipse");
        bw.close();
        
        //Read data from file
        FileReader fr = new FileReader("G://File_Program.txt");
        BufferedReader br = new BufferedReader(fr);
        String info = br.readLine();
        System.out.println(info);
	}

}
