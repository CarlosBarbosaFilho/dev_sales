package br.com.cbgomes.backend.domain.dto;

import br.com.cbgomes.backend.domain.Seller;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
public class SalesEfetivedBySellerDTO implements Serializable {

    private String seller;
    private Long visited;
    private Long deals;

    public SalesEfetivedBySellerDTO(){}

    public SalesEfetivedBySellerDTO(Seller seller, Long visited, Long deals) {
        this.seller = seller.getName();
        this.visited = visited;
        this.deals = deals;
    }

    public Double percentSalesBySeller(){
        return Double.valueOf(visited / deals);
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public Long getVisited() {
        return visited;
    }

    public void setVisited(Long visited) {
        this.visited = visited;
    }

    public Long getDeals() {
        return deals;
    }

    public void setDeals(Long deals) {
        this.deals = deals;
    }
}
