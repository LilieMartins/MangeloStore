package br.com.mangelo.store.gateway.persistence.dto

import java.io.Serializable

data class OrderDTO(
        var idOrder: Int,
        val orderNumber: Int,
        val product: ProductDTO
): Serializable{
    companion object {
        private const  val serialVersionUID = -1237881259L
    }
}
