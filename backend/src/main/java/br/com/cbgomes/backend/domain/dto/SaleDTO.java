package br.com.cbgomes.backend.domain.dto;

import br.com.cbgomes.backend.domain.Sale;
import lombok.Getter;
import lombok.Setter;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.Column;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
public class SaleDTO {
    private Long id;
    private Integer visited;
    private Integer deals;
    private Integer amount;
    private LocalDate date;
}
