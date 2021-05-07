package br.com.cbgomes.backend.service;

import br.com.cbgomes.backend.domain.Sale;
import br.com.cbgomes.backend.domain.dto.SalesBySellerDTO;
import br.com.cbgomes.backend.domain.dto.SalesEfetivedBySellerDTO;
import br.com.cbgomes.backend.repository.SaleRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SaleService {

    private final SaleRepository repository;

    public SaleService(final SaleRepository repository){
        this.repository = repository;
    }

    @Transactional(readOnly = true)
    public Page<Sale> sales(Pageable pageable){
        return this.repository.findAll(pageable);
    }

    @Transactional(readOnly = true)
    public List<SalesBySellerDTO> salesBySeller(){
        return this.repository.amountGroupBySeller();
    }

    @Transactional(readOnly = true)
    public List<SalesEfetivedBySellerDTO> saleEfetivedBySeller(){
        return this.repository.salesEfetivedBySeller();
    }
}
