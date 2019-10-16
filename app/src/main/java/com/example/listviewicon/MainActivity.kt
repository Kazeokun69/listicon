package com.example.listviewicon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.listviewicon.model.Prog
import com.example.listviewicon.model.ProgData

class MainActivity : AppCompatActivity() {

    private lateinit var rvProg: RecyclerView
    private var list: ArrayList<Prog> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rvProg = findViewById(R.id.rv_program)
        rvProg.setHasFixedSize(true)
        list.addAll(ProgData.listfood)

        showFoodList()
    }
    private fun showFoodList(){
        rvProg.layoutManager = LinearLayoutManager(this)
        val listFoodAdapter = ListProgAdapter(list)
        rvProg.adapter  = listFoodAdapter

    }
}
