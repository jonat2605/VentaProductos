package com.example.ventaProductos.controllers;

import com.example.ventaProductos.models.dto.ProductDTO;
import com.example.ventaProductos.models.dto.ProductReadParamsDTO;
import com.example.ventaProductos.models.dto.ServiceResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @GetMapping(value = "/obtener")
    public ResponseEntity<List<ProductDTO>> getProducts() {
        return null;
    }

    @PostMapping(value = "/obtener/id")
    public ResponseEntity<ProductDTO> getProductByIdAndCategory(@RequestBody ProductReadParamsDTO productReadParamsDTO) {
        return null;
    }

    @PostMapping(value = "/crear")
    public ResponseEntity<ServiceResponse> createProduct(@RequestBody ProductDTO productDTO) {
        return null;
    }

    @PutMapping(value = "/update")
    public ResponseEntity<ServiceResponse> updateProduct(@RequestBody ProductDTO productDTO) {
        return null;
    }

    @DeleteMapping(value = "/delete")
    public ResponseEntity<ServiceResponse> deleteProduct(@RequestBody ProductReadParamsDTO productReadParamsDTO) {
        return null;
    }

}
