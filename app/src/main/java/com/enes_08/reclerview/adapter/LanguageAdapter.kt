package com.enes_08.reclerview.adapter

import android.app.Activity
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import com.enes_08.listview.model.Language
import com.enes_08.reclerview.R
import kotlinx.android.synthetic.main.item_list_language.view.*

class LanguageAdapter(Context: Activity,LanguageList:ArrayList<Language> )
    : RecyclerView.Adapter<LanguageAdapter.myViewHolder>() {

    var mContext:Activity
    var mLanguagelist:ArrayList<Language>

    init {
        mContext=Context
        mLanguagelist=LanguageList

    }


    override fun onBindViewHolder(holder: myViewHolder, position: Int, payloads: MutableList<Any>) {

        holder.ivLanguage.setBackgroundResource(mLanguagelist.get(position).img)
        holder.tvDate.setText(mLanguagelist.get(position).date)
        holder.tvLanguageDetail.setText(mLanguagelist.get(position).description)
        holder.tvLanguageName.setText(mLanguagelist.get(position).name)
        holder.rbRating.rating=(mLanguagelist.get(position).rating).toFloat()


    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): myViewHolder {
        var view=LayoutInflater.from(mContext).inflate(R.layout.item_list_language,null)

        return  myViewHolder(view)



    }

    override fun getItemCount(): Int {

       return mLanguagelist.size
    }

    override fun onBindViewHolder(p0: myViewHolder, p1: Int) {
    }


    class myViewHolder(row: View) : RecyclerView.ViewHolder(row) {

        var tvLanguageName: TextView
        var tvDate: TextView
        var tvLanguageDetail: TextView
        var rbRating: RatingBar
        var ivLanguage: ImageView




        init {


            tvLanguageName = row.tvLanguageName
            tvDate = row.tvDate
            tvLanguageDetail = row.tvLanguageDetail
            rbRating = row.rbRating
            ivLanguage = row.ivLanguage
        }


    }
}