package com.example.presents

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.ImageButton
import androidx.navigation.findNavController

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [PriceFragmentNight.newInstance] factory method to
 * create an instance of this fragment.
 */
class PriceFragmentNight : Fragment() {
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
        return inflater.inflate(R.layout.fragment_price_night, container, false)
    }

    override fun onStart() {
        super.onStart()
        val back_to_day = view?.findViewById<ImageButton>(R.id.back_to_day_night)
        val next_to_int = view?.findViewById<ImageButton>(R.id.next_to_int_night)
        val from2 = view?.findViewById<EditText>(R.id.from5)
        val to2 = view?.findViewById<EditText>(R.id.to5)
        back_to_day?.setOnClickListener{ view : View ->
            view.findNavController().popBackStack()
        }
        next_to_int?.setOnClickListener{ view : View ->
            val bundle = Bundle()
            bundle.putString("from", from2?.text.toString())
            bundle.putString("to", to2?.text.toString())
            view.findNavController().navigate(R.id.action_priceFragmentNight_to_interestFragmentNight, bundle)
        }

    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment PriceFragmentNight.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            PriceFragmentNight().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}