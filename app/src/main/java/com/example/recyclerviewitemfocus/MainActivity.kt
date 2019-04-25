package com.example.recyclerviewitemfocus

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val topics = listOf("Education","Finance","Government","Entertainment","Technology","Math","Biology","Physics","Chemistry","Space","Sports","Music","Animal","Countries","Weather","Politics","Traffic","Poverty","Social Media","Internet","Housing")
        val linearLayoutManager = LinearLayoutManager(this)
        val listAdapter = ItemListAdapter(topics)

        recycler_view.setHasFixedSize(true)
        recycler_view.layoutManager = linearLayoutManager
        recycler_view.adapter = listAdapter

    }
}
