package br.com.mangelo.store.gateway.persistence.dto

import java.io.Serializable

class ProductDTO(
        val id: Int,
        val name: String,
        val type: String,
        val productDescription: String,
        val price: Double
) : Serializable {
}