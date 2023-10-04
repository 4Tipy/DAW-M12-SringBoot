package proyecto1.repository;

import java.util.ArrayList;
import java.util.Iterator;

import proyecto1.bean.Libro;

public class BaseDatos {
	
	ArrayList<Libro> libros = new ArrayList<Libro>();
	
	public BaseDatos() {
	    libros.add(new Libro(1, "Harry Potter y la piedra filosofal", "J.K. Rowling", "Salamandra", "26/9/2006", "Fantasía"));
        libros.add(new Libro(2, "Harry Potter y la cámara secreta", "J.K. Rowling", "Salamandra", "15/7/1999", "Fantasía"));
        libros.add(new Libro(3, "Harry Potter y el prisionero de Azkaban", "J.K. Rowling", "Salamandra", "1/9/1999", "Fantasía"));
        libros.add(new Libro(4, "Harry Potter y el cáliz de fuego", "J.K. Rowling", "Salamandra", "1/7/2000", "Fantasía"));
        libros.add(new Libro(5, "Harry Potter y la Orden del Fénix", "J.K. Rowling", "Salamandra", "21/6/2003", "Fantasía"));
        libros.add(new Libro(6, "Harry Potter y el misterio del príncipe", "J.K. Rowling", "Salamandra", "16/7/2005", "Fantasía"));
        libros.add(new Libro(7, "Harry Potter y las Reliquias de la Muerte", "J.K. Rowling", "Salamandra", "21/7/2007", "Fantasía"));
        libros.add(new Libro(8, "El Hobbit", "J.R.R. Tolkien", "Minotauro", "21/9/1937", "Fantasía"));
        libros.add(new Libro(9, "Cien años de soledad", "Gabriel García Márquez", "Sudamericana", "30/5/1967", "Realismo mágico"));
        libros.add(new Libro(10, "1984", "George Orwell", "Secker & Warburg", "8/6/1949", "Ciencia ficción"));
	}
	
	//	Funcion para leer los datos de los libros
	public ArrayList<Libro> getLibros(){
		return libros;
	}
	
	public Libro getLibro(int id) {
	    for (Libro libro : libros) {
	        if (libro.getId() == id) {
	            return libro;
	        }
	    }
	    return null; // Devuelve null si no se encuentra el libro con el ID especificado
	}
	
	//Funcion para mostrar los datos	
	public void setLibros(ArrayList<Libro> libros) {
		this.libros = libros;
	}
	//Funcion para añadir un libro nuevo	
	public void inserta(Libro libro) {
		libros.add(libro);
	}
	// Funcion para borrar un libro de la lista	
	public void borrar (int id) {
		Iterator<Libro> it = libros.iterator();
		while(it.hasNext()) {
			Libro li = it.next();
			if (li.getId()==id) {
				it.remove();
				break;
			}
		}
	}
	
	public void modifica (Libro libro) {
		Iterator <Libro> it = libros.iterator();
		while(it.hasNext()) {
			Libro li = it.next();
			if(li.getId()==libro.getId()) {
				li.setTitulo(libro.getTitulo());
				li.setAutor(libro.getAutor());
				li.setEditorial(libro.getEditorial());
				li.setFecha(libro.getFecha());
				li.setTematica(libro.getTematica());
				break;
			}
		}
	}
	
	
}
