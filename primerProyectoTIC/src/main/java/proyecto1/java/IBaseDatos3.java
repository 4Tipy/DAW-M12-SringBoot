package proyecto1.java;

import java.util.ArrayList;

import proyecto1.bean.Libro;

public interface IBaseDatos3 {
	
public void  inserta(Libro libro);
public void borrar(int id);
public void modificar(Libro libro);
public Libro getLibro(int id);
public ArrayList<Libro> getLibros();
public boolean compruebaUsuarios(String usuario, String password);
	
}
