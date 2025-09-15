package br.com.felipe.desafio_todo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "usuario")
public class Usuario {
    

    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    
    @Column(unique = true)
    @JsonIgnore 
    private String senha;
    
    private boolean admin = false;

    @OneToMany(mappedBy = "usuario")
    private List<Todo> tarefas; 
}
