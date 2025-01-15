package com.example.ventaProductos.services.impl;

import com.example.ventaProductos.models.dto.ProductDTO;
import com.example.ventaProductos.models.dto.ProductReadParamsDTO;
import com.example.ventaProductos.models.dto.ServiceResponse;
import com.example.ventaProductos.services.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Override
    public List<ProductDTO> findAllProducts() {
        return List.of();
    }

    @Override
    public ProductDTO findProductByIdAndCategory(ProductReadParamsDTO productReadParamsDTO) {
        return null;
    }

    @Override
    public ServiceResponse saveProduct(ProductDTO product) {
        return null;
    }

    @Override
    public ServiceResponse deleteProduct(ProductReadParamsDTO productReadParamsDTO) {
        return null;
    }
}
