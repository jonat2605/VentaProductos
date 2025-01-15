package com.example.ventaProductos.models.dto;

import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@Getter
@Setter
@ToString
@AllArgsConstructor
@Builder
public class ProductDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer idProduct;
    private String productName;
    private Double cost;
    private Integer quantity;
    private String category;

}
