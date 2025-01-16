package com.example.ventaProductos.models.entities;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Calendar;

@Entity
@Table(name = "Producto")
@Getter
@Setter
@NoArgsConstructor
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id_producto")
    @Setter(AccessLevel.NONE)
    private Integer idProduct;

    @Column(name = "nombre_producto")
    private String productName;

    @Column(name = "precio")
    private Double cost;

    @Column(name = "cantidad")
    private Integer quantity;

    @Column(name = "categoria")
    private String category;

    @Column(name = "fecha_creacion")
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private Calendar creationDate;

    @Column(name = "fecha_actualizacion")
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private Calendar updateDate;

}
