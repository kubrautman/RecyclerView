package com.android.kubrautman.cooking.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.android.kubrautman.cooking.R
import com.android.kubrautman.cooking.RecipeFragment
import com.android.kubrautman.cooking.dto.CookDTO
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.adapter_item_cooks.view.*

class CookViewHolder(val parent: ViewGroup):RecyclerView.ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.adapter_item_cooks,parent,false)) {



   private val imgBackground by lazy { itemView.findViewById<ImageView>(R.id.imgBackground) }



    fun bindTo(cookDTO: CookDTO, onClickItem:(view: View, cookDTO: CookDTO)-> Unit){

    Glide.with(itemView.context).load(cookDTO.cookTitle).into(imgBackground)

        itemView.setOnClickListener {
            onClickItem(it,cookDTO)

        }


    }


}