package org.david.controlador;

import org.david.modelo.Usuario;


import java.util.ArrayList;
import java.lang.*;
public class NuevosUsuarios{
	ObtenerTexto oT=new ObtenerTexto();
	
	
ArrayList<Usuario> arrus=new ArrayList<Usuario>();


	int opcion;
	String user;
	String contra;
	String rol;
	String userIngres;
	String contraIngres;
	String rolIngres;
	int codigo;
	int cont=0;
	
	
	
	
	
	public void ingresoUsuario(String user,String contra,String rol,int codigo){
		arrus.add(new Usuario(user,contra,rol,codigo));
		arrus.add(new Usuario("admin","admin","a",666));
		arrus.add(new Usuario("cesar","sofia","u",667));
	}
	
	

}