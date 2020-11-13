package com.example.digitalhousefoods

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toolbar
import androidx.core.content.ContextCompat
import com.example.digitalhousefoods.domain.Food
import com.example.digitalhousefoods.domain.Restaurant

class RestaurantMenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_restaurant_menu)

        window.setStatusBarColor(ContextCompat.getColor(this, R.color.purple_700))

        val restaurant = intent.getSerializableExtra("restaurant") as? Restaurant
        val food = intent.getSerializableExtra("food") as? Food

        if(restaurant != null) {
            restaurant(restaurant)
        } else if (food != null) {
            food(food)
        }

    }

    private fun restaurant(restaurant: Restaurant) {
        var bundle = Bundle()
        bundle.putSerializable("restaurant", restaurant)
        var fragment = RestaurantFragment()
        fragment.arguments = bundle

        supportFragmentManager
            .beginTransaction()
            .add(R.id.container_root, fragment)
            .commit()
    }

    private fun food(food: Food) {
        var bundle = Bundle()
        bundle.putSerializable("food", food)
        var fragment = DetailFoodFragment()
        fragment.arguments = bundle

        supportFragmentManager
            .beginTransaction()
            .add(R.id.container_root, fragment)
            .commit()
    }
}