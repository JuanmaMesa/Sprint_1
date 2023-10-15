package n1exercici3;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Locale;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

import n1exercici1.MyComparator;

public class DirectoryTree_version2 {
	
	private File directory;
	
	public  DirectoryTree_version2(String directoryPath) {
		
		directory = new File(directoryPath);
		
	}
	
	public void setDirectory(String directoryPath) {
		
		directory = new File(directoryPath);
	}
	
	public File getDirectory() {
		
		return directory;
	}
	
	
	public void verificationDirectory(File file, FileWriterReader fileWriter) {
		
		if(file.isDirectory()) {
			File[] files = file.listFiles();
			
			if(files != null) {
				Arrays.sort(files, new MyComparator());
				
				StringBuilder content = new StringBuilder();// acumula contenido si append es false
				
				for(File f: files) {
					//System.out.println(f.getName());
					printInfoFiles(f,content);
					
					if(f.isDirectory()) {
						
						verificationDirectory(f, fileWriter);// llamada recursiva	
					}
				}
			}else {
				System.out.println("The directory path is empty.");
			}
			
		}else {
			System.out.println("Error, your path is not a directory path.");
		}
	
	}
	
	public void printInfoFiles(File file, StringBuilder content) {
	
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMMM YYY - HH:mm",new Locale("ca","Cat"));
		
		try {
			String dateFormated = dateFormat.format(file.lastModified());
			String fileType = file.isFile() ? "F":"D";
			
			String info = "\nType: "+fileType +" Name: "+ file.getName() + "Last modificated: "+ dateFormated+"\n";
			
			content.append(info);
		} catch (Exception e) {
			System.out.println("Error, file not read");
		}
		
		
	}
	
	
	
	
	








	
	

}
