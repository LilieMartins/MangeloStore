package br.com.mangelo.store.domains

import java.io.Serializable

data class Order(
        var idOrder: Int,
        val orderNumber: Int,
        val product: Product
): Serializable {
    companion object{
        private const  val serialVersionUID = -13705L
    }
}