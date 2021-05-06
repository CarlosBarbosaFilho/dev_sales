package br.com.cbgomes.backend.domain.dto;

import br.com.cbgomes.backend.domain.Sale;
import br.com.cbgomes.backend.domain.Seller;
import lombok.Getter;
import lombok.Setter;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
public class SellerDTO {

    private Long id;
    private String name;
}
