package com.project.product;

import com.project.product.dto.ProductRequest;
import com.project.product.dto.ProductResponse;
import com.project.product.entity.Product;
import com.project.product.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public ProductResponse createProduct(ProductRequest productRequest){

        Product  product =new Product();

        product.setName(productRequest.getName());
        product.setDescription(productRequest.getDescription());
        product.setPrice(productRequest.getPrice());
        product.setStock(productRequest.getStock());

        Product save = productRepository.save(product);

        ProductResponse productResponse=new ProductResponse();

        productResponse.setId(save.getId());
        productResponse.setName(save.getName());
        productResponse.setDescription(save.getDescription());
        productResponse.setPrice(save.getPrice());
        productResponse.setStock(save.getStock());

        return productResponse;

    }
}
