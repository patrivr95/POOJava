package interfaces;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Ficheros implements Impresiones {

	@Override
	public void printer(String cad) {
		String ruta="datos.txt";
		try(FileOutputStream fos=new FileOutputStream(ruta);
				PrintStream out=new PrintStream(fos,true)){
			out.println(cad);
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}

	}

}
