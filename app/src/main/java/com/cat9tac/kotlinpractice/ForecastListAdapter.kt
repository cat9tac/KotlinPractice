package com.cat9tac.kotlinpractice

import android.support.v7.widget.AppCompatAutoCompleteTextView
import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import android.widget.TextView

/**
 *  createtime: 2019/5/24
 *  author:  jessica
 *  fuction:
 */
class ForecastListAdapter(private val items:List<String>):
    RecyclerView.Adapter<ForecastListAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(TextView(parent.context))
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textView.text = items[position]
    }

    class ViewHolder(val textView: TextView): RecyclerView.ViewHolder(textView)
}