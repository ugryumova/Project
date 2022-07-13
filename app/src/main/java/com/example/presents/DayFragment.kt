package com.example.presents

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.ImageButton
import android.widget.RadioButton
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.example.presents.databinding.ActivityMainBinding


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [DayFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class DayFragment : Fragment() {
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
        return inflater.inflate(R.layout.fragment_day, container, false)

    }

    override fun onStart() {
        super.onStart()
        try{
            val viewpager = view?.findViewById<ViewPager>(R.id.viewpager)
            val text = view?.findViewById<TextView>(R.id.textScroller)
            val radio_bithday = view?.findViewById<RadioButton>(R.id.radio_birthday)
            val radio_mart = view?.findViewById<RadioButton>(R.id.radio_mart)
            val radio_february = view?.findViewById<RadioButton>(R.id.radio_february)
            val radio_new_year = view?.findViewById<RadioButton>(R.id.radio_new_year)
            val radio_valentin = view?.findViewById<RadioButton>(R.id.radio_valentin)
            val adapter = ImageAdapter(requireContext())
            val back_to_person = view?.findViewById<ImageButton>(R.id.back_to_person)
            val next_to_price = view?.findViewById<ImageButton>(R.id.next_to_price)
            back_to_person?.setOnClickListener{ view : View ->
                view.findNavController().popBackStack()
            }
            next_to_price?.setOnClickListener{ view : View ->
                view.findNavController().navigate(R.id.action_dayFragment_to_priceFragment)
            }
            viewpager?.adapter = adapter
            viewpager?.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {

                override fun onPageScrollStateChanged(state: Int) {
                }

                override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {
                    when(position){
                        0 -> {
                            text?.text = getString(R.string.birhtday)
                            radio_bithday?.isChecked = true
                        }
                        1 -> {
                            text?.text = getString(R.string.marth)
                            radio_mart?.isChecked = true
                        }
                        2 -> {
                            text?.text = getString(R.string.february)
                            radio_february?.isChecked = true
                        }
                        3 -> {
                            text?.text = getString(R.string.new_year)
                            radio_new_year?.isChecked = true
                        }
                        4 -> {
                            text?.text = getString(R.string.valentin)
                            radio_valentin?.isChecked = true
                        }
                    }
                }
                override fun onPageSelected(position: Int) {

                }

            })
        }
        catch(e:Exception){
            Log.d("adach", e.toString())
        }
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment DayFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            DayFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}