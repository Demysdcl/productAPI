package br.com.dclfactor.productAPI.entity

import java.util.*
import javax.persistence.*

@Entity
data class Product (
    @Id
    @GeneratedValue
    var idProd: Int,

    @Column(length = 100)
    var description: String,

    @Lob
    var image: String,

    var priceBr: Double,

    @ManyToOne
    var category: Category,

    @Enumerated(EnumType.STRING)
    var originEnum: OriginEnum

) {
    fun getPriceUS() : Double = priceBr * 3.599
}

