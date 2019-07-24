package com.example.coderswag.Model

//override function helps with extracting the data title from the service
class Category (val title: String, val image: String) {
    override fun toString(): String {
            return title
        }
    }
