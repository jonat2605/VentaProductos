package com.example.ventaProductos.services;

import com.example.ventaProductos.models.dto.ProductDTO;
import com.example.ventaProductos.models.dto.ProductReadParamsDTO;
import com.example.ventaProductos.models.dto.ServiceResponse;

import java.util.List;

public interface ProductService {

    public List<ProductDTO> findAllProducts();

    public ProductDTO findProductByIdAndCategory(ProductReadParamsDTO productReadParamsDTO);

    public ServiceResponse saveProduct(ProductDTO product);

    public ServiceResponse deleteProduct(ProductReadParamsDTO productReadParamsDTO);

}
