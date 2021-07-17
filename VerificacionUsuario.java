package org.david.controlador;
import org.david.controlador.ObtenerTexto;
import org.david.vista.MenuPersona;
public class VerificacionUsuario{
	
	MenuPersona mP=new MenuPersona();
	ObtenerTexto oT=new ObtenerTexto();
	String admin="admin";
	String contra="admin";
	String rol="a";
	String usuarioDefault="cesar";
	String claveDefault="sofia";
	String rol1="u";
	String rolex;
	String userIngresado;
	String contraIngresado;
	
	
	public void verificacion(){
	try{
	System.out.println("---------login-----------");
	System.out.println("Ingrese su nombre Usuario");
		userIngresado=oT.texto();		
	System.out.println("Ingrese su Contraseña");
		contraIngresado=oT.texto();
		}catch(NumberFormatException ime){
				System.out.println("error de sintaxis");
			System.exit(1);
		}
		System.out.println("Ingrese el rol que posee");
		rolex=oT.texto();
	if((admin.equals(userIngresado)) && (contra.equals(contraIngresado)) && (rol.equals(rolex))){
		
		System.out.println("Ha iniciado sesion como administrador");
		mP.menuPrincipal();
	}
	if((usuarioDefault.equals(userIngresado)) && (claveDefault.equals(contraIngresado)) && (rol1.equals(rolex))){
			System.out.println("Ha iniciado sesion como usuario");
			mP.menuUsuario();
		}
	
}
}