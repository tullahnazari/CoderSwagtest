package com.example.coderswag.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.coderswag.Model.Category
import com.example.coderswag.R
import com.example.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var  adapter : ArrayAdapter<Category>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //getting data into UI element (list view). You need an adapter for that (needs to know context, the layout, and where the hell the data is) :)
        adapter = ArrayAdapter(this,
            android.R.layout.simple_list_item_1, DataService.categories)
        categoryListView.adapter = adapter
    }

}
