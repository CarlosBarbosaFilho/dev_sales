package br.com.cbgomes.backend.repository;

import br.com.cbgomes.backend.domain.Sale;
import br.com.cbgomes.backend.domain.dto.SalesBySellerDTO;
import br.com.cbgomes.backend.domain.dto.SalesEfetivedBySellerDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SaleRepository extends JpaRepository<Sale, Long> {

    @Query ( "SELECT new br.com.cbgomes.backend.domain.dto.SalesBySellerDTO(obj.seller, SUM(obj.amount)) " +
            " FROM Sale AS obj GROUP BY obj.seller" )
    List<SalesBySellerDTO> amountGroupBySeller();

    @Query ( "SELECT new br.com.cbgomes.backend.domain.dto.SalesEfetivedBySellerDTO(obj.seller, SUM(obj.visited)," +
            " SUM(obj.deals)) FROM Sale AS obj GROUP BY obj.seller" )
    List<SalesEfetivedBySellerDTO> salesEfetivedBySeller();
}
