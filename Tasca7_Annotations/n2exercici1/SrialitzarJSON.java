package n2exercici1;

import java.lang.reflect.Method;

import n2exercici1.MyAnotations.NivelSeguridad;
import n2exercici1.MyAnotations.NivelSeguridad.Nivel;
import n2exercici1.MyAnotations.SerializacioJson;

@SerializacioJson(directori = "/Home/user")
public class SrialitzarJSON {

	// block of code
		
	
	@NivelSeguridad(Nivel.BAJO)
	public void miContrasenya(){
		
	}
	

	
}
