package n1exercici2;

import n1exercici1.Directory;

public class App_TreeDirectorY {

	public static void main(String[] args) {
		DirectoryTree myFile = new DirectoryTree("/home/juanma/eclipse-workspace/Academy");
		
		myFile.verificationDirectory(myFile.getDirectory());
		
		

	}

}
