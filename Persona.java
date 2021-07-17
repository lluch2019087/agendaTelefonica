package org.david.modelo;



public class Persona{
	String nombre;
	String apellido;
	String direccion;
	int telefono;
	int codigo;
	
	
	
	public Persona(String nombre,String apellido,String direccion,int telefono,int codigo){
		this.nombre=nombre;
		this.apellido=apellido;
		this.direccion=direccion;
		this.telefono=telefono;
		this.codigo=codigo;
	}

	public void setNombre(String nombre){
			this.nombre=nombre;
	}
	public String getNombre(){
			return nombre;
	}
	
	public void setApellido(String apellido){
			this.apellido=apellido;
	}
	public String getApellido(){
			return apellido;
	}		
	public void setDireccion(String direccion){
			this.direccion=direccion;
	}
	public String getDireccion(){
			return direccion;
	}
	public void setTelefono(int telefono){
			this.telefono=telefono;
	}
	public int getTelefono(){
			return telefono;
	}
	public void setCodigo(int codigo){
		
		this.codigo=codigo;
		
	
	}
	public int getCodigo(){
		return codigo;
	}
}
	
