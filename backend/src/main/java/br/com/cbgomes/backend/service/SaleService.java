package br.com.cbgomes.backend.service;

import br.com.cbgomes.backend.domain.Sale;
import br.com.cbgomes.backend.repository.SaleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleService {

    private final SaleRepository repository;

    public SaleService(final SaleRepository repository){
        this.repository = repository;
    }

    public List<Sale> sales(){
        return this.repository.findAll();
    }
}
