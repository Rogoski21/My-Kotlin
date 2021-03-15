package com.cursoandroid.trip.model

class ProductCarrinho {

    var product: Product

    constructor(product: Product) {
        this.product = product
    }

    override fun toString(): String {
        return "ProductCarrinho(product=$product)"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as ProductCarrinho

        if (product != other.product) return false

        return true
    }

}