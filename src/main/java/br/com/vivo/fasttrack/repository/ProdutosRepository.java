package br.com.vivo.fasttrack.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.vivo.fasttrack.modelo.Produto;

@Repository
public interface ProdutosRepository extends JpaRepository<Produto, Long>{

	List<Produto> findByName(String name);
	
	@Query("SELECT p FROM Produto p WHERE (:q is null OR LOWER(p.name) LIKE CONCAT('%', LOWER(:q), '%') OR LOWER(p.description) LIKE CONCAT('%', LOWER(:q), '%')) AND (:min_price is null OR p.price >= :min_price) AND (:max_price is null OR p.price <= :max_price")
	List<Produto> search (String q, BigDecimal min_price, BigDecimal max_price);
}
