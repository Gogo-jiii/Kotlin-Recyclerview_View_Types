package com.example.recyclerviewviewtype

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var arrayList = ArrayList<ModelClass>()
    private var data = arrayOf("a", "b", "c", "d", "e", "f", "g", "h", "i")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myAdapter = MyAdapter(this, getData())
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.itemAnimator = DefaultItemAnimator()
        recyclerView.addItemDecoration(
            DividerItemDecoration(
                this,
                LinearLayoutManager.VERTICAL
            )
        )
        recyclerView.adapter = myAdapter
    }

    private fun getData(): ArrayList<ModelClass> {
        arrayList.add(ModelClass(ModelClass.TYPE_NAME, data[0], 0))
        arrayList.add(ModelClass(ModelClass.TYPE_NAME, data[1], 0))
        arrayList.add(ModelClass(ModelClass.TYPE_IMAGE, data[2], R.drawable.ic_android))
        arrayList.add(ModelClass(ModelClass.TYPE_NAME, data[3], 0))
        arrayList.add(ModelClass(ModelClass.TYPE_NAME, data[4], 0))
        arrayList.add(ModelClass(ModelClass.TYPE_IMAGE, data[5], R.drawable.ic_android))
        arrayList.add(ModelClass(ModelClass.TYPE_NAME, data[6], 0))
        arrayList.add(ModelClass(ModelClass.TYPE_NAME, data[7], 0))
        arrayList.add(ModelClass(ModelClass.TYPE_NAME, data[8], 0))
        return arrayList
    }
}