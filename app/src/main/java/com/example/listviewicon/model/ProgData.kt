package com.example.listviewicon.model

import com.example.listviewicon.R
import java.util.ArrayList
object ProgData {
    private val foodName = arrayOf(

        "Ruby",
        "Rails",
        "Python",
        "JavaScript",
        "PHP"

    )
    private val detail=arrayOf(
        "Ruby is an open-source end fully object-oriented programming language",
        "Ruby on rails is a server-side web application development framework written in ruby language",
        "Python is interpreted scripting and object-oriented programming language",
        "JavaScript is an object-based scripting language",
        "PHP is an interpreted language,i,e there is no need for compilation"

    )
    private val foodPoster = intArrayOf(
        R.drawable.ruby,
        R.drawable.rails,
        R.drawable.python,
        R.drawable.javascript,
        R.drawable.php



    )
    val listfood : ArrayList<Prog>
        get() {
            val list = arrayListOf<Prog>()
            for (position in foodName.indices){
                val prog = Prog()
                prog.name = foodName[position]
                prog.detail = detail[position]
                prog.poster = foodPoster [position]
                list.add(prog)
            }
            return list
        }

}