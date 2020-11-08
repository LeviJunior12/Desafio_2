package com.example.digitalhousefoods

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.digitalhousefoods.domain.Restaurant

class RestaurantAdapter(private val listRestaurant: ArrayList<Restaurant>):
    RecyclerView.Adapter<RestaurantAdapter.RestaurantViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RestaurantViewHolder {
        var itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_restaurant, parent, false)
        return RestaurantViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: RestaurantViewHolder, position: Int) {
        var restaurant: Restaurant = listRestaurant.get(position)
        holder.img.setImageResource(restaurant.img)
        holder.name.text = restaurant.name
        holder.address.text = restaurant.address
        holder.open.text = restaurant.open

    }

    override fun getItemCount() = listRestaurant.size

    class RestaurantViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var img = itemView.findViewById<ImageView>(R.id.iv_restaurant)
        val name = itemView.findViewById<TextView>(R.id.tvName)
        val address = itemView.findViewById<TextView>(R.id.tvAddress)
        val open = itemView.findViewById<TextView>(R.id.tvOpen)
    }
}