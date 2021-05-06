package br.com.cbgomes.backend.domain.converters;

import br.com.cbgomes.backend.domain.Sale;
import br.com.cbgomes.backend.domain.dto.SaleDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ConverterSaleDTO {

    @Autowired
    private ModelMapper modelMapper;

    public SaleDTO convertToDto(Sale sale){
        return modelMapper.map(sale, SaleDTO.class);
    }
    public Page<SaleDTO> convertToListDtos(Page<Sale> sales){
        return sales.map(s -> convertToDto(s));
    }
}
