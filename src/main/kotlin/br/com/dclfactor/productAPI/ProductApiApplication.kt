package br.com.dclfactor.productAPI

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class ProductApiApplication

fun main(args: Array<String>) {
    SpringApplication.run(ProductApiApplication::class.java, *args)
}
