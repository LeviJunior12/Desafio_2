package com.example.digitalhousefoods

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.core.content.ContextCompat
import com.example.digitalhousefoods.domain.Restaurant
import kotlinx.android.synthetic.main.fragment_restaurant.*

class RestaurantMenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_restaurant_menu)

        if(savedInstanceState == null) {

            val restaurant = intent.getSerializableExtra("restaurant") as? Restaurant
            var bundle = Bundle()
            bundle.putSerializable("restaurant", restaurant)
            var fragment = RestaurantFragment()
            fragment.arguments = bundle

            supportFragmentManager
                .beginTransaction()
                .add(R.id.container_root, fragment)
                .commit()
        }

    }
}