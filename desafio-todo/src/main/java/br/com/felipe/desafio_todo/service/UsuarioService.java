package br.com.felipe.desafio_todo.service;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.com.felipe.desafio_todo.entity.Usuario;
import br.com.felipe.desafio_todo.repository.UsuarioRepository;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }                                           
    

    public String createUsuario(Usuario usuario) {
        usuarioRepository.save(usuario);
        return "Usuário criado com sucesso!";
    }

    public List<Usuario> getAllUsuarios() {
        Sort usuarioSort = Sort.by("name").ascending();
        return usuarioRepository.findAll(usuarioSort);
    }

    public Usuario getUsuarioById(Long id) {
        return usuarioRepository.findById(id).orElse(null);
    }

    public String updateUsuario(Usuario usuario) {
        usuarioRepository.save(usuario);
        return "Usuário atualizado com sucesso!";
    }

    public String deleteUsuario(Long id) {
        usuarioRepository.deleteById(id);
        return "Usuário deletado com sucesso!";
    }
}
