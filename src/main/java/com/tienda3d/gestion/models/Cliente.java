package com.tienda3d.gestion.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "clientes")
public class Cliente {
    @Getter @Setter @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Getter @Setter @Column(name = "nombre")
    private String nombre;
    @Getter @Setter @Column(name = "apellido")
    private String apellido;
    @Getter @Setter @Column(name = "email")
    private String email;
    @Getter @Setter @Column(name = "telefono")
    private Long telefono;
    @Getter @Setter @Column(name = "cuit")
    private Long cuit;

    public Cliente(){}

    public Cliente(Long id, String nombre, String apellido, String email, Long telefono, Long cuit) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        this.cuit = cuit;
    }

}
