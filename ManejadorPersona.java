package org.david.controlador;
import org.david.controlador.ObtenerTexto;
import org.david.modelo.EntornoAyudas;
import org.david.modelo.Persona;
import java.util.*;
import java.lang.*;
import java.io.*;

public class ManejadorPersona{
	
	ArrayList<Persona> arreglo=new ArrayList<Persona>();
	
	EntornoAyudas eO=new EntornoAyudas();
	ObtenerTexto oT=new ObtenerTexto();
	
	
	int res;
	int cont=0;
	int opcion;
	String nombre;
	String apellido;
	String direccion;
	int telefono;
	String desicion;
	int posicion;
	
	
	
	
	
	public void ingresoPersona(String nombre,String apellido,String direccion, int telefono, int codigo){
		arreglo.add(new Persona(nombre,apellido,direccion,telefono,codigo));
	}
	public void reportePersona(){
		try{
		for(Persona p: arreglo){
		System.out.println(p.getNombre()+"  "+ p.getApellido()+"  "+ p.getDireccion()+"  "+ p.getTelefono()+" "+p.getCodigo() );
		String ruta = "C:/pro/ReportePersona.txt";//Escribir la ruta en donde desea generar el txt//
        File archivo = new File(ruta);//
        BufferedWriter bw;
		bw = new BufferedWriter(new FileWriter(archivo));
		bw.write("Lista de Contactos Telefonicos: ");
		for(Persona r: arreglo){			
			bw.write(r.getNombre()+"  "+ r.getApellido()+"  "+ r.getDireccion()+"  "+ r.getTelefono()+" "+ r.getCodigo());
			bw.newLine();
			
		}
		bw.close();
		
		}
		
		System.out.println("                                        ");
		System.out.println("lista de contactos exportada exitosamente");
		System.out.println("                                        ");
		
		}catch(IOException e){
		}
		
	}
	
	public void reportPersona(){
		try{
		res=oT.textoEntero();
	
		for(Persona p: arreglo){
			if(p.getCodigo()==(res)){
			cont=1;
			System.out.println(p.getNombre()+"  "+ p.getApellido()+"  "+ p.getDireccion()+"  "+ p.getTelefono()+" "+p.getCodigo() );
		
		}
		}
		for(Persona r: arreglo){		
			if(r.getCodigo()==(res)){
			cont=1;		
			String ruta = "C:/pro/ReportePersonaEspecifica.txt";//Escribir la ruta en donde desea generar el txt//
			File archivo = new File(ruta);//
			BufferedWriter bw;
			bw = new BufferedWriter(new FileWriter(archivo));
			bw.write("Contacto Telefonico Especifico: ");
			bw.write(r.getNombre()+"  "+ r.getApellido()+"  "+ r.getDireccion()+"  "+ r.getTelefono()+" "+ r.getCodigo());
			bw.newLine();
			bw.close();
		}
		System.out.println("                                        ");
		System.out.println("lista de contactos exportada exitosamente");
		System.out.println("                                        ");
	} 
  
    if(cont==0){
    System.out.println("contacto no encontrado");
	}
	}catch(IOException e){
	}
		
	}

public void modificarPersona(){
		System.out.println("ingrese el codigo de la persona que desea modificar");
		res=oT.textoEntero();
		
		
	
	for(Persona p: arreglo){
		if(p.getCodigo()==(res)){
        cont=1;
		System.out.println("persona encontrada");
		System.out.println("los datos son lo siguientes:");
		System.out.println(p.getNombre()+"  "+ p.getApellido()+"  "+ p.getDireccion()+"  "+ p.getTelefono()+" "+p.getCodigo() );
		System.out.println("                     ");
		do{
		System.out.println("                                        ");
		System.out.println("ingrese que opcion desea realizar");
		System.out.println("1) modificar nombre");
		System.out.println("2) modificar apellido");
		System.out.println("3) modificar direccion");
		System.out.println("4) modificar numero telefonico");
		
		opcion=oT.textoEntero();
		switch(opcion){
			
			case 1:
			System.out.println("ingrese el nuevo nombre de la persona");
			nombre=oT.texto();
			p.setNombre(nombre);
			System.out.println("el nuevo nombre es "+p.getNombre());
			System.out.println("desea seguir modificando?");
			System.out.println("si o no?");
			desicion=oT.texto();
			break;
			
			case 2:
			System.out.println("ingrese el nuevo apellido de la persona");
			apellido=oT.texto();
			p.setApellido(apellido);
			System.out.println("el nuevo apellido es "+p.getApellido());
			System.out.println("desea seguir modificando?");
			System.out.println("si o no?");
			desicion=oT.texto();
			break;
			
			case 3:
			System.out.println("ingrese la nueva direccion de la persona");
			direccion=oT.texto();
			p.setDireccion(direccion);
			System.out.println("la nueva direccion es "+p.getDireccion());
			System.out.println("desea seguir modificando?");
			System.out.println("si o no?");
			desicion=oT.texto();
			break;
			
			case 4:
			System.out.println("ingrese el nuevo numero de la persona");
			telefono=oT.textoEntero();
			p.setTelefono(telefono);
			System.out.println("la nueva direccion es "+p.getTelefono());
			System.out.println("desea seguir modificando?");
			System.out.println("si o no?");
			desicion=oT.texto();
			break;
			
			
			default:
			System.out.println("opcion no valida");
			
		}
		}while(desicion.toLowerCase().equals("si"));
        }
	
    }
	if(cont==0){
        System.out.println("contacto no encontrado");
	}
	
	}
	
	
	public void eliminarPersona(){
		System.out.println("ingrese el codigo del contacto a eliminar");
		res=oT.textoEntero();
		
		Iterator<Persona> it = arreglo.iterator();
		while(it.hasNext()){
		if(it.next().getCodigo()==res){
		cont=1;
		System.out.println("estas seguro que deseas eliminar el contacto?");
		desicion=oT.texto();
		if(desicion.toLowerCase().equals("si")){
		it.remove();
		System.out.println("contacto borrado exitosamente");
		System.out.println("                             ");
		}
		}
		}
		if(cont==0){
        System.out.println("contacto no encontrado");
	}
	}
}




