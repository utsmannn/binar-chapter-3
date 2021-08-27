package com.utsman.chapterthree

class Kotak(override var tinggi: Double, override var lebar: Double) : BangunDatar() {

    override fun luas(): Double {
        return tinggi * lebar
    }

    override fun keliling(): Double {
        return (tinggi + lebar) * 2
    }

}