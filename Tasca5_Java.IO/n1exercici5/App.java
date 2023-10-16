package n1exercici5;
import n1exercici4.DirectoryTree;

public class App {

	public static void main(String[] args) {
	
		String filePath = "/home/juanma/eclipse-workspace/Sprint1";
		String file = "/home/juanma/eclipse-workspace/Sprint1/Prueba.txt";
		
		DirectoryTree directoryTree = new DirectoryTree(filePath);
		ObjectFileManager objectFileManager = new ObjectFileManager(file, true);
	
		ObjectTest myObject = new ObjectTest("Juan", 22);
		objectFileManager.serializeObject(myObject, "miObject1.ser");
		
	
	}

}
