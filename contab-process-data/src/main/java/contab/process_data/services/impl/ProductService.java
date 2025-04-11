package contab.process_data.services.impl;

import contab.process_data.dtos.ProductDTO;
import contab.process_data.persistence.entities.ProductEntity;
import contab.process_data.persistence.repositories.ProductRepository;
import contab.process_data.services.IProductService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService implements IProductService {

   private final ProductRepository productRepository;

   public ProductService(ProductRepository productRepository) {
       this.productRepository = productRepository;
   }

    @Override
    public List<ProductDTO> getActiveProducts() {
        var productEntityList = productRepository.getActivesWithJPQL();

        return productEntityList.stream().map(productEntity -> new ProductDTO(productEntity.getCategory(),
                productEntity.getDescription(),
                productEntity.getPrice())).toList();
    }
}