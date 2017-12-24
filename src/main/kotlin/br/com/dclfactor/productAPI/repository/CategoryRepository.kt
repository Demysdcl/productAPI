package br.com.dclfactor.productAPI.repository

import br.com.dclfactor.productAPI.entity.Category
import org.springframework.data.jpa.repository.JpaRepository

interface CategoryRepository: JpaRepository<Category, Int>