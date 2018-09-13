package com.android.kubrautman.cooking.adapter

import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.android.kubrautman.cooking.R
import com.android.kubrautman.cooking.dto.CookDTO
import kotlinx.android.synthetic.main.adapter_item_cooks.view.*

class CookAdapter(private  val cookList: List<CookDTO>,
    private  val onClickItem: (view: View, cookDTO: CookDTO) -> Unit)

    : RecyclerView.Adapter<CookViewHolder>() {


    override fun getItemCount(): Int =cookList.size
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CookViewHolder= CookViewHolder(parent)

    override fun onBindViewHolder(holder: CookViewHolder, position: Int) {


     holder.bindTo(cookList[position]){ view, cookdto ->
         onClickItem(view,cookdto)

     }

    }


}