package com.example.digitalhousefoods

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.digitalhousefoods.domain.Food
import kotlinx.android.synthetic.main.fragment_detail_food.view.*
import kotlinx.android.synthetic.main.fragment_detail_food.view.tv_name


class DetailFoodFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view = inflater.inflate(R.layout.fragment_detail_food, container, false)

        var food = arguments?.getSerializable("food") as? Food
        view.iv_food.setImageResource(food!!.img)
        view.tv_name.text = food.name
        view.tv_describe.text = food.describe

        view.toolbar_icon.setNavigationOnClickListener {
            requireActivity().onBackPressed()
        }

        return view
    }

    companion object {
        fun newInstance() = DetailFoodFragment()

    }
}