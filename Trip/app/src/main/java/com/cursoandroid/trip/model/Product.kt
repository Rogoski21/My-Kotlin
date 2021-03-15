package com.cursoandroid.trip.model

import android.media.Image
import android.provider.ContactsContract
import java.io.FileDescriptor

class Product {
    var icons: Int? = 0
    var name: String? = null
    var valor: Double? = 0.0

    constructor(icons: Int?, name: String?, valor: Double? ) {
        this.icons = icons
        this.name = name
        this.valor = valor
    }

}