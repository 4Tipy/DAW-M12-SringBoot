package proyecto2.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import proyecto2.model.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
}
