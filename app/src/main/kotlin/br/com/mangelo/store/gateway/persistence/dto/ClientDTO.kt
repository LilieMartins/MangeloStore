package br.com.mangelo.store.gateway.persistence.dto

import java.io.Serializable
import java.util.*

data class ClientDTO(
        var id: Int,
        val name: String,
        val lastName: String,
        val cpf: String,
        val birthdayDate: Date
) : Serializable {
    companion object {
        // SERIALIZACAO  - COMAND + OPTION + G
        private const val serialVersionUID = -89L
    }
}