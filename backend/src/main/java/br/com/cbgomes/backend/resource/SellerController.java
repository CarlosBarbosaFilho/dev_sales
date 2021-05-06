package br.com.cbgomes.backend.resource;


import br.com.cbgomes.backend.domain.converters.ConverterSellerDTO;
import br.com.cbgomes.backend.domain.dto.SellerDTO;
import br.com.cbgomes.backend.service.SellerService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping ("/v1/sellers")
public class SellerController {
    private final SellerService service;
    private final ConverterSellerDTO converterSellerDTO;

    @Autowired
    public SellerController(final SellerService service, final ConverterSellerDTO converterSellerDTO){
        this.service = service;
        this.converterSellerDTO = converterSellerDTO;
    }

    @GetMapping
    public ResponseEntity<List<SellerDTO>> list(){
        return ResponseEntity.ok(this.converterSellerDTO
                .convertToListDtos(this.service.sellers()));
    }
}
