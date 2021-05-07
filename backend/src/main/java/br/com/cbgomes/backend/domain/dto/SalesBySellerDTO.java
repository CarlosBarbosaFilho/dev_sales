package br.com.cbgomes.backend.domain.dto;

import br.com.cbgomes.backend.domain.Seller;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

public class SalesBySellerDTO implements Serializable {

    private String seller;
    private Double amount;

    public SalesBySellerDTO(){

    }

    public SalesBySellerDTO(Seller seller, Double amount){
        this.seller = seller.getName();
        this.amount = amount;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
