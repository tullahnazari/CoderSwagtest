package com.example.coderswag.Services

import com.example.coderswag.Model.Category
import com.example.coderswag.Model.Product

object DataService {

    val categories = listOf(
        Category("Shirts", "shirtimage"),
        Category("Hoodies", "hoodieimage"),
        Category("Hats", "hatimage"),
        Category("Digital Goods", "digitalgoodsimage"),
        Category("Shirts", "shirtimage"),
        Category("Hoodies", "hoodieimage"),
        Category("Hats", "hatimage"),
        Category("Digital Goods", "digitalgoodsimage"),
        Category("Shirts", "shirtimage"),
        Category("Hoodies", "hoodieimage"),
        Category("Hats", "hatimage"),
        Category("Digital Goods", "digitalgoodsimage")
    )

    val hats = listOf(
        Product("Devslopes Graphic Beanie", "$22", "hat1"),
        Product("Devslopes Hat Black", "$29", "hat2"),
        Product("Devslopes Hat White", "$23", "hat3"),
        Product("Devslopes Hat Snapback", "$40", "hat4")
    )

    val hoodies = listOf(
        Product("Devslopes Hoodie Gray", "$30", "hoodie1"),
        Product("Devslopes Hoodie Gray", "$20", "hoodie2"),
        Product("Devslopes Gray Hoodie", "$35", "hoodie3"),
        Product("Devslopes Black Hoodie", "$30", "hoodie4")
    )

    val shirts = listOf(
        Product("Devslopes Shirt Gray", "$18", "shirt1"),
        Product("Devslopes Shirt Gray", "$20", "shirt2"),
        Product("Devslopes Gray Shirt", "$15", "shirt3"),
        Product("Devslopes Black Shirt", "$25", "shirt4"),
        Product("Kickflip Studios", "$18", "shirt5")
    )
}