package com.enes_08.reclerview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.enes_08.listview.model.Language
import com.enes_08.reclerview.adapter.LanguageAdapter

class MainActivity : AppCompatActivity() {
    private lateinit  var mLanguages: ArrayList<Language>

    lateinit var madaptor:LanguageAdapter
    private var recyclerView: RecyclerView? = null
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R .layout.activity_main)
        recyclerView=findViewById(R.id.recylerView)
        mLanguages=ArrayList()


        madaptor= LanguageAdapter(this,mLanguages)


        recyclerView?.layoutManager = LinearLayoutManager(applicationContext, LinearLayoutManager.VERTICAL, false)

        recyclerView?.adapter=madaptor


        initData()

    }


    private fun initData() {

        val language = arrayOf<String>("Java", "Kotlin", "Node-JS", "Php", "C++")
        val description = arrayOf<String>(
            "Java is a programming language and a platform.",
            "Kotlin is a open-source programming language, used to develop Android apps and much more.",
            "Node-JS is an object-based scripting language.",
            "PHP is an interpreted language, i.e., there is no need for compilation.",
            "C++ is an object-oriented programming language."
        )

        val imageId2 = arrayOf<Int>(
            R.drawable.ic_img, R.drawable.ic_img, R.drawable.ic_img,
            R.drawable.ic_img, R.drawable.ic_img
        )

        val imageId = arrayOf<Int>(
            R.drawable.img1, R.drawable.img2, R.drawable.img3,
            R.drawable.img4, R.drawable.img5
        )

        val rating = arrayOf<Int>(
            4, 5, 3, 2, 1
        )

        val date = arrayOf<String>(
            "27.12,2018"
            ,"27.12,2018"
            , "27.12,2018"
            , "27.12,2018"
            , "27.12,2018"

        )

        mLanguages.clear()

        for (i in 0..language.size-1) {
            var l = Language("$i",language.get(i),description.get(i),date.get(i),imageId.get(i),rating.get(i))
            mLanguages?.add(l)

        }


        madaptor.notifyDataSetChanged()





    }
}
