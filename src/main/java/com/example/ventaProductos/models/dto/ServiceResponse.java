package com.example.ventaProductos.models.dto;

import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@Getter
@Setter
@ToString
@AllArgsConstructor
@Builder
public class ServiceResponse implements Serializable {

    private static final long serialVersionUID = 1L;

    private String message;
    private Integer code;
    private Object data;

}
