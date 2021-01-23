package br.com.mangelo.store.domains

import java.io.Serializable

class Product(
        val id: Int,
        val name: String,
        val type: String,
        val productDescription: String,
        val price: Double
) : Serializable{

}