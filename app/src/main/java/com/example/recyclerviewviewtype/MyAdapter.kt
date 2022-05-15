package com.example.recyclerviewviewtype

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.row_image.view.*
import kotlinx.android.synthetic.main.row_name.view.*

class MyAdapter(var context: Context, private val arrayList: ArrayList<ModelClass>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder?>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view: View
         when (viewType) {
            ModelClass.TYPE_NAME -> {
                view = LayoutInflater.from(parent.context).inflate(R.layout.row_name, parent, false)
                return TextTypeViewHolder(view)
            }
            ModelClass.TYPE_IMAGE -> {
                view =
                    LayoutInflater.from(parent.context).inflate(R.layout.row_image, parent, false)
                return ImageTypeViewHolder(view)
            }
        }

        return TextTypeViewHolder(null)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val model = arrayList[position]
        when (model.type) {
            ModelClass.TYPE_NAME -> (holder as TextTypeViewHolder).itemView.textView.text = model.name
            ModelClass.TYPE_IMAGE -> {
                (holder as ImageTypeViewHolder).itemView.textView2.text = model.name
                holder.itemView.imageView.setImageResource(model.image)
            }
        }
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    override fun getItemViewType(position: Int): Int {
        return when (arrayList[position].type) {
            1 -> ModelClass.TYPE_NAME
            2 -> ModelClass.TYPE_IMAGE
            else -> -1
        }
    }

    class TextTypeViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView!!)

    class ImageTypeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}