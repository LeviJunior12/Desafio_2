package com.example.digitalhousefoods.domain

import java.io.Serializable

data class Restaurant(val img: Int, val name: String, val address: String, val open: String, val food: ArrayList<Food>): Serializable {
}