package n1exercici4;

public class App {

	public static void main(String[] args) {
		
		String filePath = "/home/juanma/eclipse-workspace/Sprint1";
        String file = "/home/juanma/eclipse-workspace/Sprint1/Prueba.txt";
    
        DirectoryTree directoryTree = new DirectoryTree(filePath);
        FileWriterReader fileWriterReader = new FileWriterReader(file, true);
        
        directoryTree.verificationDirectory(directoryTree.getDirectory(), fileWriterReader);

        String readFile = fileWriterReader.readFromFile();
        
        if(readFile != null) {
        	System.out.println("---Content of file---\n"+readFile);
        }
        
	}

}
