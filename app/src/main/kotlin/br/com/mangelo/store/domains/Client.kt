package br.com.mangelo.store.domains

import java.io.Serializable
import java.util.*

data class Client(
        var id: Int,
        val name: String,
        val lastName: String,
        val cpf: String,
        val birthdayDate: Date,
        val order: Order
) : Serializable {
    companion object {
        private const val serialVersionUID = -37L
    }
}