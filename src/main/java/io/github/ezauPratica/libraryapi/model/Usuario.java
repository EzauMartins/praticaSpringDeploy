package io.github.ezauPratica.libraryapi.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.Type;


import java.util.List;
import java.util.UUID;

@Entity
@Table
@Data
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column
    private String login;

    @Column
    private String senha;

    @Column(name = "roles", columnDefinition = "varchar[]")
    private List<String> roles;
}
