package com.tienda3d.gestion.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "productos")
public class Producto {
    @Getter @Setter @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Getter @Setter @Column(name = "nombre")
    private String nombre;
    @Getter @Setter @Column(name = "descripcion")
    private String descripcion;
    @Getter @Setter @Column(name = "precio")
    private int precio;
    @Getter @Setter @Column(name = "gramos")
    private int gramos;
    @Getter @Setter @Column(name = "horas")
    private double horas;
    @Getter @Setter @Column(name = "dimensiones")
    private String dimensiones;

    @Getter @Setter @Column(name = "densidad_relleno")
    private String densidad_relleno;

    @Getter @Setter @Column(name = "tipo_relleno")
    private String tipo_relleno;

    @Getter @Setter @Column(name = "altura_capa")
    private double altura_capa;

    @Getter @Setter @Column(name = "tipo_soporte")
    private String tipo_soporte;

    @Getter @Setter @Column(name = "voladizo_soporte")
    private int voladizo_soporte;

    @Getter @Setter @Column(name = "adherencia_cama")
    private boolean adherencia_cama;

    @Getter @Setter @Column(name = "perimetros")
    private int perimetros;

    @Getter @Setter @Column(name = "insumos")
    private String insumos;

    public Producto() {}

    public Producto(Long id, String nombre, String descripcion, int precio, int gramos, double horas, String dimensiones, String densidad_relleno, String tipo_relleno, double altura_capa, String tipo_soporte, int voladizo_soporte, boolean adherencia_cama, int perimetros, String insumos) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.gramos = gramos;
        this.horas = horas;
        this.dimensiones = dimensiones;
        this.densidad_relleno = densidad_relleno;
        this.tipo_relleno = tipo_relleno;
        this.altura_capa = altura_capa;
        this.tipo_soporte = tipo_soporte;
        this.voladizo_soporte = voladizo_soporte;
        this.adherencia_cama = adherencia_cama;
        this.perimetros = perimetros;
        this.insumos = insumos;
    }
}
