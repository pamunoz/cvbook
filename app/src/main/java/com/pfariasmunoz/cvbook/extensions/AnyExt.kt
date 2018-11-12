package com.pfariasmunoz.cvbook.extensions

val Any.TAG: String
    get() = this::class.java.simpleName
