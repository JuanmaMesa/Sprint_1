package n1exercici3;

import n1exercici2.DirectoryTree;

public class App_File {

	public static void main(String[] args) {
		
		String filePath = "/home/juanma/eclipse-workspace";
		String file =  "/home/juanma/eclipse-workspace/Sprint1/Prueba.txt";
		
	
		DirectoryTree_version2 directoryTree = new DirectoryTree_version2(filePath);
		FileWriterReader fileWriter = new FileWriterReader(file, false);
		
		directoryTree.verificationDirectory(directoryTree.getDirectory(), fileWriter);
		
	
		
		
	
        
        
        
	}

}
