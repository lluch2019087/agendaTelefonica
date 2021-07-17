package org.david.vista;
import org.david.controlador.ObtenerTexto;
import org.david.modelo.EntornoAyudas;
import org.david.controlador.ManejadorPersona;
import org.david.controlador.NuevosUsuarios;


import java.lang.*;
import java.io.*;
public class MenuPersona{
	
	int opcion;
	ManejadorPersona mP=new ManejadorPersona();
	ObtenerTexto oT=new ObtenerTexto();
	EntornoAyudas eO=new EntornoAyudas();
	NuevosUsuarios nU=new NuevosUsuarios();
	
	
	String nombre;
	String apellido;
	String direccion;
	int telefono;
	int codigo=2019;
	int a=0;
	int b=0;
	int c=0;
	String desicion;
	String respuesta;
	int buscar;
	String usuario;
	String contra;
	String rol;
	int codigoUser=668;
	
	
	public void menuPrincipal(){
		
		System.out.println("                               ");
	System.out.println("Este es el registro de agenda telefonica ");
	
	do{
	System.out.println("                               ");
	System.out.println("----------Menu Principal del Administrador----------");	
	System.out.println("1) Ingreso de un nuevo Usuario ");
	System.out.println("2) Modificacion de un Usuario ");
	System.out.println("3) Eliminacion de un Usuario ");
	System.out.println("4) Reporte ");
	System.out.println("5) agregar usuario ");
	
	opcion=oT.textoEntero();
	
	switch(opcion){
		case 1:
		
		do{
			System.out.println("ingrese nombre");
			nombre=oT.texto();
			System.out.println("ingrese apellido");
			apellido=oT.texto();
			System.out.println("ingrese direccion");
			direccion=oT.texto();
			System.out.println("ingrese numero de telefono");
			try{
				telefono=oT.textoEntero();
			}catch(NumberFormatException ime){
			System.out.println("solo puedes digitar numeros enteros");
			System.exit(1);
		}
			codigo=codigo+1;
			System.out.println("su codigo es: "+codigo);
		mP.ingresoPersona(nombre,apellido,direccion,telefono,codigo);
			System.out.println("desea agregar otro contacto?");
			respuesta=oT.texto();
		
		}while(respuesta.toLowerCase().equals("si"));
		break;
		
		
		case 2:
		
	
		mP.modificarPersona();
		
		break;
		
		case 3:
		mP.eliminarPersona();
		break;
		
		case 4:
		System.out.println("desea reporte individual o reporte completo?");
		System.out.println("1) reporte individual");
		System.out.println("2) reporte completo");
		System.out.println("3) menu principal");
		opcion=oT.textoEntero();
			switch(opcion){
				case 1:
					System.out.println("                                        ");
					System.out.println("ingrese el codigo de la persona para mostrar datos");
				mP.reportPersona();
				
				break;
				
				case 2:
				System.out.println("                                        ");
				mP.reportePersona();
				
			
				break;
				
				case 3:
				System.out.println("                                        ");
				System.out.println("volviendo al menu principal...");
				break;
				
				default:
				System.out.println("opcion no valida");
			}
		
		break;
		
		case 5:
		do{
			
		System.out.println("ingrese nombre del usuario");
			usuario=oT.texto();
			System.out.println("ingrese contraseña");
			contra=oT.texto();
			System.out.println("ingrese rol");
			System.out.println("a=administrador, u=usuario");
			rol=oT.texto();
			codigoUser=codigoUser++;
			nU.ingresoUsuario(usuario,contra,rol,codigoUser);
			System.out.println("su codigo es "+codigoUser);
			System.out.println("usuario agregado exitosamente");
			System.out.println("desea agregar mas usuarios?");
			respuesta=oT.texto();
		}while(respuesta.toLowerCase().equals("si"));
			
		break;
		
		
		
		default:
		System.out.println("opcion no valida");
			}
	

		
	
	}while(respuesta.toLowerCase().equals("no"));
	
	}
	

	
public void menuUsuario(){
	System.out.println("                               ");
	System.out.println("Este es el registro de agenda telefonica ");
	
	do{
	System.out.println("                               ");
	System.out.println("----------Menu Del Usuario------------");
	System.out.println("1)Ingreso de un nuevo Usuario ");
	System.out.println("2)Reporte ");
	System.out.println("  ");
	opcion=oT.textoEntero();
	
	switch(opcion){
		case 1:
		do{
			System.out.println("ingrese nombre");
			nombre=oT.texto();
			System.out.println("ingrese apellido");
			apellido=oT.texto();
			System.out.println("ingrese direccion");
			direccion=oT.texto();
			System.out.println("ingrese numero de telefono");
			try{
				telefono=oT.textoEntero();
			}catch(NumberFormatException ime){
			System.out.println("solo puedes digitar numeros enteros");
			System.exit(1);
		}
			codigo=codigo+1;
		mP.ingresoPersona(nombre,apellido,direccion,telefono,codigo);
			System.out.println("su codigo es:"+codigo);
			System.out.println("desea agregar otro contacto?");
			respuesta=oT.texto();
		
		}while(respuesta.toLowerCase().equals("si"));
		break;
		
		
		case 2:
		System.out.println("desea reporte individual o reporte completo?");
		System.out.println("1) reporte individual");
		System.out.println("2) reporte completo");
		System.out.println("3) Volver al menu");
		opcion=oT.textoEntero();
			switch(opcion){
				case 1:
					System.out.println("                                        ");
					System.out.println("ingrese el codigo de la persona para mostrar datos");
				mP.reportPersona();
				
				break;
				
				case 2:
				System.out.println("                                        ");
				mP.reportePersona();
				
			
				break;
				
				case 3:

				System.out.println("                                        ");
				System.out.println("volviendo al menu principal...");
			
				break;
				
				default:
				System.out.println("opcion no valida");
			}
			
		break;
		
		default:
		System.out.println("opcion no valida");
			}
	
	}while(respuesta.toLowerCase().equals("no"));
	
	
}




}