package n1exercici5;
//import n1exercici4.DirectoryTree;

public class App {

	public static void main(String[] args) {
	
		
		String file ="miObject1.ser";
		
		ObjectFileManager objectFileManager = new ObjectFileManager(file, true);
	
	
		ObjectTest myObject = new ObjectTest("Juan", 22);
		objectFileManager.serializeObject(myObject, file);
		
		ObjectTest myObjectReturn = (ObjectTest) objectFileManager.desSerializeObject(file);
			if(myObjectReturn != null) {
				System.out.println("Deserialized object is: "+myObjectReturn.getClass()+ "\nInfo  Objet:\n"+ myObjectReturn.toString());
			}
	
	}

}
