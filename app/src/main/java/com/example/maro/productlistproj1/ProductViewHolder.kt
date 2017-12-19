package com.example.maro.productlistproj1

import android.graphics.Color
import android.support.v7.widget.RecyclerView
import android.view.View
import kotlinx.android.synthetic.main.viewholder_product.view.*

class ProductViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bind(product: Product) {
            itemView.name.text = product.description
            itemView.amount.text = product.amount.toString()
            itemView.price.text = product.price.toString()
            if (!product.completed) {
                itemView.setBackgroundColor(Color.GRAY)
            }
    }
}