package com.sangyan.cricketprofile

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text

class PlayerAdapter(var list_of_players: ArrayList<Player>, var context: Context) :
    RecyclerView.Adapter<PlayerAdapter.ViewHolder>() {
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        lateinit var name: TextView
        lateinit var image: ImageView

        init {
            name = view.findViewById(R.id.player_name)
            image = view.findViewById(R.id.player_image)
        }


    }

    override fun onCreateViewHolder(
        view_group: ViewGroup,
        viewType: Int
    ): PlayerAdapter.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.layout_item, view_group, false)
        return ViewHolder(view)
    }


    override fun onBindViewHolder(holder: PlayerAdapter.ViewHolder, position: Int) {
        holder.name.text = list_of_players[position].player_name
        holder.image.setImageResource(list_of_players[position].player_image)
    }

    override fun getItemCount(): Int {
        return list_of_players.size
    }
}