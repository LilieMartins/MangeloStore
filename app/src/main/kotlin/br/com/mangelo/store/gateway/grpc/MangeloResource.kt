package br.com.mangelo.store.gateway.grpc

import br.com.mangelo.store.usecases.ClientUseCase
import br.com.mangelo.store.usecases.OrderUseCase
import br.com.mangelo.store.usecases.ProductUseCase
import javax.inject.Singleton

@Singleton
class MangeloResource(
        private val clienteUseCase: ClientUseCase,
        private val orderUseCase: OrderUseCase,
        private val productUseCase: ProductUseCase
){



}