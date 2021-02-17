package com.example.recyclerviewkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearSnapHelper
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.SnapHelper
import kotlinx.android.synthetic.main.activity_main.*
import org.intellij.lang.annotations.JdkConstants

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val dataList = ArrayList<DataItem>();
        dataList+=DataItem("What is your name ?","My name is Shashank.");
        dataList+=DataItem("What is your name ?","My name is Shashank.");
        dataList+=DataItem("What is your name ?","My name is Shashank.");
        dataList+=DataItem("What is your name ?","My name is Shashank.");
        dataList+=DataItem("What is your name ?","My name is Shashank.");
        recyclerView.adapter=RecyclerAdapter(dataList);
        recyclerView.layoutManager=LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);
        recyclerView.setHasFixedSize(true);
        val snapHelperapps: SnapHelper = LinearSnapHelper()
        snapHelperapps.attachToRecyclerView(recyclerView)

    }
}