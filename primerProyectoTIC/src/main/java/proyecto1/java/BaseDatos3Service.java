package proyecto1.java;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import proyecto1.bean.Libro;

@Service
public class BaseDatos3Service implements IBaseDatos3 {
	
	@Override
	public void inserta(Libro libro) {}
	
	@Override
	public void borrar (int id) {}
	
	@Override
	public void modificar (Libro libro) {}
	
	@Override
	public Libro getLibro(int id) {return null;}
	
	@Override
	public ArrayList <Libro> getLibros() {return null;}
	
	@Override
	public boolean compruebaUsuario(String usuario, String password) {return false;}
	
}

