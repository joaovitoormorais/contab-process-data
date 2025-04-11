package contab.process_data.services;

import contab.process_data.dtos.ProductDTO;

import java.util.List;

public interface IProductService {
    List<ProductDTO> getActiveProducts();
}
