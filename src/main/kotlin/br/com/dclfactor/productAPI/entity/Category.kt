package br.com.dclfactor.productAPI.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class Category (
    @Id
    var idCategory: Int,

    @Column(length = 50)
    var description: String
)