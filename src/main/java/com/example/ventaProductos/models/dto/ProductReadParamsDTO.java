package com.example.ventaProductos.models.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@NoArgsConstructor
@Getter
@Setter
public class ProductReadParamsDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private String category;

}
