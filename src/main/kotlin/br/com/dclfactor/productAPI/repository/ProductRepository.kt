package br.com.dclfactor.productAPI.repository

import br.com.dclfactor.productAPI.entity.Product
import org.springframework.data.jpa.repository.JpaRepository

interface ProductRepository : JpaRepository<Product, Int>