package com.tienda3d.gestion.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "insumos")
public class Insumo {
    @Getter @Setter
    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Getter @Setter
    @Column(name = "nombre")
    private String nombre;
    @Getter @Setter
    @Column(name = "precio")
    private int precio;
    @Getter @Setter
    @Column(name = "stock")
    private int stock;

    @Getter @Setter
    @Column(name = "lugar")
    private String lugar;

    @Getter @Setter
    @Column(name = "fecha")
    private LocalDate fecha;

    public Insumo(){}

    public Insumo(Long id, String nombre, int precio, int stock, String lugar, LocalDate fecha) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.lugar = lugar;
        this.fecha = fecha;
    }
}
