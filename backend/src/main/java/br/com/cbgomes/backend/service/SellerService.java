package br.com.cbgomes.backend.service;

import br.com.cbgomes.backend.domain.Seller;
import br.com.cbgomes.backend.repository.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SellerService {

    private final SellerRepository repository;

    @Autowired
    public SellerService(final SellerRepository repository){
        this.repository = repository;
    }

    public List<Seller> sellers(){
        return this.repository.findAll();
    }
}
