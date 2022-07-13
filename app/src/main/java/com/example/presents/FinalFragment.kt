package com.example.presents

import android.content.Intent
import android.database.sqlite.SQLiteDatabase
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.squareup.picasso.Picasso
import java.io.IOException
import java.sql.SQLException


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


/**
 * A simple [Fragment] subclass.
 * Use the [FinalFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class FinalFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    private var mDBHelper: DatabaseHelper? = null
    private var mDb: SQLiteDatabase? = null

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
        return inflater.inflate(R.layout.fragment_final, container, false)
    }

    override fun onStart() {
        super.onStart()

        try{
            mDBHelper = DatabaseHelper(requireContext())
        }
        catch(e:Exception) {
            Log.d("panki", e.toString())
        }


        try {
            mDBHelper!!.updateDataBase()
        } catch (mIOException: IOException) {
            throw Error("UnableToUpdateDatabase")
        }

        mDb = try {
            mDBHelper!!.writableDatabase
        } catch (mSQLException: SQLException) {
            throw mSQLException
        }

        val imageview = view?.findViewById<ImageView>(R.id.imageView26)
        val name = view?.findViewById<TextView>(R.id.name)
        val from3 = view?.findViewById<TextView>(R.id.from3)
        val to3 = view?.findViewById<TextView>(R.id.to3)
        val search = view?.findViewById<ImageButton>(R.id.imageButton)
        val from = arguments?.getString("from")
        val to = arguments?.getString("to")
        from3?.text = from
        to3?.text = to
        val product_id = arguments?.getString("id")
        val back_to_prod = view?.findViewById<ImageButton>(R.id.back_to_prod)
        try{
            text(name!!, product_id!!)
            image(imageview!!, product_id!!)
        }
        catch(e:Exception){
            Log.d("panki", e.toString())
        }

        back_to_prod?.setOnClickListener{ view: View ->
            view.findNavController().popBackStack()
        }
        search?.setOnClickListener { view: View ->
            Log.d("poisk", "нажал")
            try{
                val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://market.yandex.ru/search?text=${name?.text}&local-offers-first=0&pricefrom=${from3?.text}&priceto=${to3?.text}"))
                startActivity(i)
            }
            catch(e:Exception){
                Log.d("poisk", e.toString())
            }
        }
    }

    private fun text(textview: TextView, id:String){
        var name = ""

        val cursor = mDb!!.rawQuery("SELECT name FROM products WHERE id = '$id'", null)
        cursor.moveToFirst()
        while (!cursor.isAfterLast) {
            name += cursor.getString(0)
            cursor.moveToNext()
        }
        cursor.close()

        textview.setText(name)
    }
    private fun image(imageview: ImageView, id:String){
        var image = ""

        val cursor = mDb!!.rawQuery("SELECT url FROM products WHERE id = '$id'", null)
        cursor.moveToFirst()
        while (!cursor.isAfterLast) {
            image += cursor.getString(0)
            cursor.moveToNext()
        }
        cursor.close()

        Picasso.get().load(image).into(imageview)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment FinalFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            FinalFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}