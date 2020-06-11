package com.sist.mylisttestproject

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.item_row.view.*

class CustomAdapter (context: Context, items: ArrayList<MainActivity.User>) : BaseAdapter() {
    private val mContext : Context = context
    private val items : ArrayList<MainActivity.User>

    init {
        this.items = items
    }

    override fun getView(position: Int, view: View?, viewGroup: ViewGroup?): View {
        val layoutInflater = LayoutInflater.from(mContext)
        val rowMain = layoutInflater.inflate(R.layout.item_row, viewGroup, false)

        //Holder
        rowMain.tvId.text = items.get(position).id
        rowMain.tvName.text = items.get(position).name
        rowMain.tvEmail.text = items.get(position).email

        return rowMain

    }

    override fun getItem(position: Int): Any {
        return items.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return items.size
    }

}