package proyecto1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import proyecto1.bean.Libro;

public interface BaseDatos3 extends JpaRepository<Libro, Integer> {
	
	
}
