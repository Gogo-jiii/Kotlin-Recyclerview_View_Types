package com.example.recyclerviewviewtype

class ModelClass(var type: Int, var name: String, var image: Int) {
    override fun toString(): String {
        return "ModelClass{" +
                "name='" + name + '\'' +
                ", image=" + image +
                '}'
    }

    companion object {
        const val TYPE_NAME = 1
        const val TYPE_IMAGE = 2
    }
}