package org.david.modelo;


public class Usuario{
	
	String admin;
	String contra;
	String rol;
	int codigo;
	
	
	
	public Usuario(String admin,String contra,String rol,int codigo){
		this.admin=admin;
		this.contra=contra;
		this.rol=rol;
		this.codigo=codigo;
	}

	public void setAdmin(String admin){
	this.admin=admin;
}
	public String getAdmin(){
		return admin;
	}

	public void setContra(String contraseña){
	this.contra=contra;
	}


	public String getContra(){
		return contra;
	}
	
	public void setRol(String rol){
		this.rol=rol;
	}
	
	public String getRol(){
		return rol;
	}
	
	public void setCodigo(int codigo){
	this.codigo=codigo;
	}	
	
	public int getCodigo(){
		return codigo;
	}
}