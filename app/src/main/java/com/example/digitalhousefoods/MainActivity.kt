package com.example.digitalhousefoods

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.digitalhousefoods.domain.Food
import com.example.digitalhousefoods.domain.Restaurant
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_restaurant.view.*

class MainActivity : AppCompatActivity() {

    var listaRestaurant = getAllRestaurant()
    var adapter = RestaurantAdapter(listaRestaurant)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(findViewById(R.id.toolbar))

        val actionBar = supportActionBar
        actionBar!!.title = "Digital House Foods"

        window.setStatusBarColor(ContextCompat.getColor(this, R.color.purple_700))

        rvRestaurant.adapter = adapter
        rvRestaurant.layoutManager = LinearLayoutManager(this)
        rvRestaurant.setHasFixedSize(false)
    }

    private fun getAllRestaurant(): ArrayList<Restaurant> {
        return arrayListOf(
            Restaurant(
                R.drawable.image1,
                "Tony Roma's",
                "Av. Lavandisca 717 - Indianópolis, São Paulo",
                "Fecha às 22:00",
                arrayListOf(
                    Food(R.drawable.image4, "describe1"),
                    Food(R.drawable.image4, "describe2"),
                    Food(R.drawable.image4, "describe3"),
                    Food(R.drawable.image4, "describe4"),
                    Food(R.drawable.image4, "describe5"),
                    Food(R.drawable.image4, "describe6"),
                )
            ),
            Restaurant(
                R.drawable.image4,
                "Aoyama - Moema",
                "Alameda dos Arapanés, 532 - Moema",
                "Fecha às 00:00",
                arrayListOf(
                    Food(R.drawable.image4, "describe7"),
                    Food(R.drawable.image4, "describe8"),
                    Food(R.drawable.image4, "describe9"),
                    Food(R.drawable.image4, "describe10"),
                    Food(R.drawable.image4, "describe11"),
                    Food(R.drawable.image4, "describe12"),
                )
            ),
            Restaurant(
                R.drawable.image5,
                "Outback - Moema",
                "Av. Moaci, 187, 187 - Moema, São Paulo",
                "Fecha às 00:00",
                arrayListOf(
                    Food(R.drawable.image4, "describe13"),
                    Food(R.drawable.image4, "describe14"),
                    Food(R.drawable.image4, "describe15"),
                    Food(R.drawable.image4, "describe16"),
                    Food(R.drawable.image4, "describe17"),
                    Food(R.drawable.image4, "describe18"),
                )
            ),
            Restaurant(
                R.drawable.image3,
                "Sí Señor",
                "Alameda Jauaperi, 626 - Moema",
                "Fecha às 01:00",
                arrayListOf(
                    Food(R.drawable.image4, "describe19"),
                    Food(R.drawable.image4, "describe20"),
                    Food(R.drawable.image4, "describe21"),
                    Food(R.drawable.image4, "describe22"),
                    Food(R.drawable.image4, "describe23"),
                    Food(R.drawable.image4, "describe24"),
                )
            ),
        )
    }
}