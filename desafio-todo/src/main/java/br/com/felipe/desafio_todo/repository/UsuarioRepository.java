package br.com.felipe.desafio_todo.repository;
import br.com.felipe.desafio_todo.entity.Usuario;  
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
        
}
