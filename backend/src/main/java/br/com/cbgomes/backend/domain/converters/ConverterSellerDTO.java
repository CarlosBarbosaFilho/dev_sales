package br.com.cbgomes.backend.domain.converters;

import br.com.cbgomes.backend.domain.Sale;
import br.com.cbgomes.backend.domain.Seller;
import br.com.cbgomes.backend.domain.dto.SaleDTO;
import br.com.cbgomes.backend.domain.dto.SellerDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ConverterSellerDTO {

    @Autowired
    private ModelMapper modelMapper;

    public SellerDTO convertToDto(Seller seller){
        return modelMapper.map(seller, SellerDTO.class);
    }

    public List<SellerDTO> convertToListDtos(List<Seller> sellers){
        return sellers.stream().map(s -> convertToDto(s)).collect(Collectors.toList());
    }
}
