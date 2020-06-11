package com.sist.mylastproject

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter

class MainFoodAdapter(val context: Context, val memberList:ArrayList<Member>):BaseAdapter(){
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

    }

    override fun getItem(position: Int): Any {
        return memberList[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return memberList.size
    }

}