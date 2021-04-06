package com.example.genrecyclerviewproj

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var myrv = findViewById<RecyclerView>(R.id.myrecyclerview)

        myrv.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)

        var myDatalist = ArrayList<UsersData>()

        myDatalist.add(UsersData("pallavi","pallavi@gamil.com","9876543210"))
        myDatalist.add(UsersData("harshit","harshu@gamil.com","9345345345"))
        myDatalist.add(UsersData("sirisha","sirisha@gamil.com","9499834543"))
        myDatalist.add(UsersData("supriya","supriya@gamil.com","89894545"))
        myDatalist.add(UsersData("shrishti","shrishti@gamil.com","7987644545"))
        myDatalist.add(UsersData("vishal","vishal@gamil.com","712345945"))
            myrv.adapter = MyAdapter(myDatalist)

    }
}
