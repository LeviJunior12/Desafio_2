package com.example.digitalhousefoods

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.digitalhousefoods.domain.Food

class FoodAdapter(private val listFood: ArrayList<Food>): RecyclerView.Adapter<FoodAdapter.FoodViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
        var itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_food, parent, false)
        return FoodViewHolder(itemView, listFood)
    }

    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {
        var food: Food = listFood.get(position)
        holder.img.setImageResource(food.img)
        holder.name.text = food.name
    }

    override fun getItemCount() = listFood.size

    class FoodViewHolder(itemView: View, listFood: ArrayList<Food>) : RecyclerView.ViewHolder(itemView) {
        var img = itemView.findViewById<ImageView>(R.id.iv_food)
        val name = itemView.findViewById<TextView>(R.id.tv_name)

        init {
            itemView.setOnClickListener {
                var position: Int = adapterPosition
                var context = itemView.context

                var intent = Intent(context, RestaurantMenuActivity::class.java)
                intent.putExtra("food", listFood.get(position))
                context.startActivity(intent)

//                Toast.makeText(context, "Position item ${position + 1}", Toast.LENGTH_SHORT).show()
            }
        }
    }
}