package com.sangyan.cricketprofile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val item = ArrayList<Player>()
        item.add(Player(R.drawable.msdhoni,"MS Dhoni"))
        item.add(Player(R.drawable.msdhoni,"MS Dhoni"))
        item.add(Player(R.drawable.msdhoni,"MS Dhoni"))
        item.add(Player(R.drawable.msdhoni,"MS Dhoni"))
        item.add(Player(R.drawable.msdhoni,"MS Dhoni"))
        item.add(Player(R.drawable.msdhoni,"MS Dhoni"))
        item.add(Player(R.drawable.msdhoni,"MS Dhoni"))
        item.add(Player(R.drawable.msdhoni,"MS Dhoni"))

        val adapter = PlayerAdapter(item,this)
        val recycler_view = findViewById<RecyclerView>(R.id.recycler_view)
        recycler_view.layoutManager = LinearLayoutManager(applicationContext)
        recycler_view.adapter = adapter

    }
}