package com.example.presents

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.ImageButton
import androidx.cardview.widget.CardView
import androidx.core.os.bundleOf
import androidx.fragment.app.setFragmentResult
import androidx.navigation.findNavController

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [InterestFragmentNight.newInstance] factory method to
 * create an instance of this fragment.
 */
class InterestFragmentNight : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_interest_night, container, false)
    }

    override fun onStart() {
        super.onStart()
        val anime = view?.findViewById<CheckBox>(R.id.anime)
        val music = view?.findViewById<CheckBox>(R.id.music)
        val hunt = view?.findViewById<CheckBox>(R.id.hunt)
        val since = view?.findViewById<CheckBox>(R.id.since)
        val game = view?.findViewById<CheckBox>(R.id.game)
        val hand = view?.findViewById<CheckBox>(R.id.hand)
        val garden = view?.findViewById<CheckBox>(R.id.garden)
        val sport = view?.findViewById<CheckBox>(R.id.sport)
        val auto = view?.findViewById<CheckBox>(R.id.auto)

        val anime_box = view?.findViewById<CardView>(R.id.anime_box)
        anime_box?.setOnClickListener{ view : View ->
            if(anime?.isChecked == true) {
                anime.isChecked = false
            }
            else{
                anime?.isChecked = true
            }
        }
        val music_box = view?.findViewById<CardView>(R.id.music_box)
        music_box?.setOnClickListener{ view : View ->
            if(music?.isChecked == true) {
                music.isChecked = false
            }
            else{
                music?.isChecked = true
            }
        }
        val hunt_box = view?.findViewById<CardView>(R.id.hunt_box)
        hunt_box?.setOnClickListener{ view : View ->
            if(hunt?.isChecked == true) {
                hunt.isChecked = false
            }
            else{
                hunt?.isChecked = true
            }
        }
        val since_box = view?.findViewById<CardView>(R.id.since_box)
        since_box?.setOnClickListener{ view : View ->
            if(since?.isChecked == true) {
                since.isChecked = false
            }
            else{
                since?.isChecked = true
            }
        }
        val game_box = view?.findViewById<CardView>(R.id.game_box)
        game_box?.setOnClickListener{ view : View ->
            if(game?.isChecked == true) {
                game.isChecked = false
            }
            else{
                game?.isChecked = true
            }
        }
        val hand_box = view?.findViewById<CardView>(R.id.hand_box)
        hand_box?.setOnClickListener{ view : View ->
            if(hand?.isChecked == true) {
                hand.isChecked = false
            }
            else{
                hand?.isChecked = true
            }
        }
        val garden_box = view?.findViewById<CardView>(R.id.garden_box)
        garden_box?.setOnClickListener{ view : View ->
            if(garden?.isChecked == true) {
                garden.isChecked = false
            }
            else{
                garden?.isChecked = true
            }
        }
        val sport_box = view?.findViewById<CardView>(R.id.sport_box)
        sport_box?.setOnClickListener{ view : View ->
            if(sport?.isChecked == true) {
                sport.isChecked = false
            }
            else{
                sport?.isChecked = true
            }
        }
        val auto_box = view?.findViewById<CardView>(R.id.auto_box)
        auto_box?.setOnClickListener{ view : View ->
            if(auto?.isChecked == true) {
                auto.isChecked = false
            }
            else{
                auto?.isChecked = true
            }
        }

        val from = arguments?.getString("from")
        val to = arguments?.getString("to")

        var anime_check: Boolean = false
        var music_check: Boolean = false
        var hunt_check: Boolean = false
        var since_check: Boolean = false
        var game_check: Boolean = false
        var hand_check: Boolean = false
        var garden_check: Boolean = false
        var sport_check: Boolean = false
        var auto_check: Boolean = false

        val back_to_price = view?.findViewById<ImageButton>(R.id.back_to_price_night)
        val next_to_product = view?.findViewById<ImageButton>(R.id.next_to_product_night)

        back_to_price?.setOnClickListener{ view : View ->
            view.findNavController().popBackStack()
        }
        next_to_product?.setOnClickListener{ view : View ->
            if (anime?.isChecked == true){
                anime_check = true
            }
            if (music?.isChecked == true){
                music_check = true
            }
            if (hunt?.isChecked == true){
                hunt_check = true
            }
            if (since?.isChecked == true){
                since_check = true
            }
            if (game?.isChecked == true){
                game_check = true
            }
            if (hand?.isChecked == true){
                hand_check = true
            }
            if (garden?.isChecked == true){
                garden_check = true
            }
            if (sport?.isChecked == true){
                sport_check = true
            }
            if (auto?.isChecked == true){
                auto_check = true
            }
            setFragmentResult("requestKey", bundleOf("anime" to anime_check, "music" to music_check, "hunt" to hunt_check,
                "since" to since_check, "game" to game_check, "hand" to hand_check,
                "garden" to garden_check, "sport" to sport_check, "auto" to auto_check)
            )
            val bundle = Bundle()
            bundle.putString("from", from)
            bundle.putString("to", to)
            view.findNavController().navigate(R.id.action_interestFragmentNight_to_producFragmentNight, bundle)

        }
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment InterestFragmentNight.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            InterestFragmentNight().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}