package br.com.felipe.desafio_todo.repository;
import br.com.felipe.desafio_todo.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {
    
}