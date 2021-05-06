package br.com.cbgomes.backend.resource;

import br.com.cbgomes.backend.domain.converters.ConverterSaleDTO;
import br.com.cbgomes.backend.domain.dto.SaleDTO;
import br.com.cbgomes.backend.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/sales")
public class SaleController {

    private final SaleService service;

    @Autowired
    private ConverterSaleDTO converterSaleDTO;

    public SaleController(final SaleService service){
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<Page<SaleDTO>> list(Pageable pageable){
        return ResponseEntity.ok(converterSaleDTO.convertToListDtos(this.service.sales(pageable)));
    }
}
