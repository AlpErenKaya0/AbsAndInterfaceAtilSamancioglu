package com.alperen.absandinterface

class Piano : HouseDecor,Instrument {
    override var roomName: String
        get() = "Kitchen"
        set(value) {}

    override fun info() {
        println() {"instument info"}
    }
}