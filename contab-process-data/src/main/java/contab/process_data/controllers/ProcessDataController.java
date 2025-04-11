package contab.process_data.controllers;

import contab.process_data.dtos.ProductDTO;
import contab.process_data.services.IProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/process")
public class ProcessDataController {

    private final IProductService productService;

    public ProcessDataController(IProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public ResponseEntity<List<ProductDTO>> getArtists() {
        return ResponseEntity.ok(this.productService.getActiveProducts());
    }
}
