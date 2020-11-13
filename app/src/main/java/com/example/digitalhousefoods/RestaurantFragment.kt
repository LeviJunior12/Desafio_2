package com.example.digitalhousefoods

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.digitalhousefoods.domain.Restaurant
import kotlinx.android.synthetic.main.fragment_restaurant.view.*
import kotlinx.android.synthetic.main.fragment_restaurant.view.tv_name

class RestaurantFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
            var view = inflater.inflate(R.layout.fragment_restaurant, container, false)

            var restaurant = arguments?.getSerializable("restaurant") as? Restaurant
            view.iv_restaurant.setImageResource(restaurant!!.img)
            view.tv_name.text = restaurant.name

            var adapter = FoodAdapter(restaurant.food)

            view.rvFood.adapter = adapter
            view.rvFood.layoutManager = LinearLayoutManager(this.activity)
            view.rvFood.setHasFixedSize(false)

            view.toolbar_icon.setNavigationOnClickListener {
                var intent = Intent(this.context, MainActivity::class.java)
                startActivity(intent)
            }

            return view
    }

    companion object {
        fun newInstance() = RestaurantFragment()
    }
}