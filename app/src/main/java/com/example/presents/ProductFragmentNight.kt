package com.example.presents

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.fragment.app.setFragmentResultListener
import androidx.navigation.findNavController

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [ProducFragmentNight.newInstance] factory method to
 * create an instance of this fragment.
 */
class ProducFragmentNight : Fragment() {
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
        return inflater.inflate(R.layout.fragment_product_night, container, false)
    }

    override fun onStart() {
        super.onStart()

        val figure = view?.findViewById<CardView>(R.id.figure)
        val haori = view?.findViewById<CardView>(R.id.haori)
        val painting = view?.findViewById<CardView>(R.id.painting)
        val sweet = view?.findViewById<CardView>(R.id.sweet)
        val print = view?.findViewById<CardView>(R.id.print)
        val kigurumi = view?.findViewById<CardView>(R.id.kigurumi)
        val manga = view?.findViewById<CardView>(R.id.manga)
        val bag = view?.findViewById<CardView>(R.id.bag)
        val pin = view?.findViewById<CardView>(R.id.pin)
        val dakimakura = view?.findViewById<CardView>(R.id.dakimakura)
        val ears = view?.findViewById<CardView>(R.id.ears)
        val hat = view?.findViewById<CardView>(R.id.hat)
        val headphones = view?.findViewById<CardView>(R.id.headphones)
        val instrument = view?.findViewById<CardView>(R.id.instrument)
        val glass = view?.findViewById<CardView>(R.id.glass)
        val vynil_player = view?.findViewById<CardView>(R.id.vynil_player)
        val metronom = view?.findViewById<CardView>(R.id.metronom)
        val mediator = view?.findViewById<CardView>(R.id.mediator)
        val socks = view?.findViewById<CardView>(R.id.socks)
        val warm = view?.findViewById<CardView>(R.id.warm)
        val palat = view?.findViewById<CardView>(R.id.palat)
        val manok = view?.findViewById<CardView>(R.id.manok)
        val gloves = view?.findViewById<CardView>(R.id.gloves)
        val globus = view?.findViewById<CardView>(R.id.globus)
        val sand_clock = view?.findViewById<CardView>(R.id.sand_clock)
        val neocube = view?.findViewById<CardView>(R.id.neocube)
        val planetarium = view?.findViewById<CardView>(R.id.planetarium)
        val projector = view?.findViewById<CardView>(R.id.projector)
        val puzzles = view?.findViewById<CardView>(R.id.puzzles)
        val bonsai = view?.findViewById<CardView>(R.id.bonsai)
        val enciclopedia = view?.findViewById<CardView>(R.id.enciclopedia)
        val experiment = view?.findViewById<CardView>(R.id.experiment)
        val table_game = view?.findViewById<CardView>(R.id.table_game)
        val disc_game = view?.findViewById<CardView>(R.id.disc_game)
        val chair = view?.findViewById<CardView>(R.id.chair)
        val console = view?.findViewById<CardView>(R.id.console)
        val cleaner = view?.findViewById<CardView>(R.id.cleaner)
        val ventilator = view?.findViewById<CardView>(R.id.ventilator)
        val polaroid = view?.findViewById<CardView>(R.id.polaroid)
        val sketchbook = view?.findViewById<CardView>(R.id.sketchbook)
        val paint_tools = view?.findViewById<CardView>(R.id.paint_tools)
        val graph_palnshet = view?.findViewById<CardView>(R.id.graph_planshet)
        val dekupaj = view?.findViewById<CardView>(R.id.dekupaj)
        val scrapbooking = view?.findViewById<CardView>(R.id.scrapbooking)
        val glina = view?.findViewById<CardView>(R.id.glina)
        val kacheli = view?.findViewById<CardView>(R.id.kacheli)
        val shezlong = view?.findViewById<CardView>(R.id.shezlong)
        val garden_inst = view?.findViewById<CardView>(R.id.garden_inst)
        val mebel = view?.findViewById<CardView>(R.id.mebel)
        val light = view?.findViewById<CardView>(R.id.light)
        val decor = view?.findViewById<CardView>(R.id.dekor)
        val shagomer = view?.findViewById<CardView>(R.id.shagomer)
        val braslet = view?.findViewById<CardView>(R.id.braslet)
        val crossovki = view?.findViewById<CardView>(R.id.crossovki)
        val yoga = view?.findViewById<CardView>(R.id.yoga)
        val bottle = view?.findViewById<CardView>(R.id.bottle)
        val conder = view?.findViewById<CardView>(R.id.conder)
        val ionizator = view?.findViewById<CardView>(R.id.ionizator)
        val nakidka = view?.findViewById<CardView>(R.id.nakidka)
        val auto_brelok = view?.findViewById<CardView>(R.id.auto_brelock)
        val organaizer = view?.findViewById<CardView>(R.id.organizer)
        val auto_cleaner = view?.findViewById<CardView>(R.id.auto_cleaner)
        val text_product = view?.findViewById<TextView>(R.id.text_product2)
        val back_to_int = view?.findViewById<ImageButton>(R.id.back_to_int_night)

        val from = arguments?.getString("from")
        val to = arguments?.getString("to")

        back_to_int?.setOnClickListener{ view : View ->
            view.findNavController().popBackStack()
        }
        figure?.setOnClickListener{ view: View ->
            val bundle = Bundle()
            val id_product = "1"
            bundle.putString("from", from)
            bundle.putString("to", to)
            bundle.putString("id", id_product)
            view.findNavController().navigate(R.id.action_producFragmentNight_to_finalFragmentNight, bundle)

        }
        haori?.setOnClickListener{ view: View ->
            val bundle = Bundle()
            val id_product = "2"
            bundle.putString("from", from)
            bundle.putString("to", to)
            bundle.putString("id", id_product)
            view.findNavController().navigate(R.id.action_producFragmentNight_to_finalFragmentNight, bundle)
        }
        painting?.setOnClickListener{ view: View ->
            val bundle = Bundle()
            val id_product = "3"
            bundle.putString("from", from)
            bundle.putString("to", to)
            bundle.putString("id", id_product)
            view.findNavController().navigate(R.id.action_producFragmentNight_to_finalFragmentNight, bundle)
        }
        sweet?.setOnClickListener{ view: View ->
            val bundle = Bundle()
            val id_product = "4"
            bundle.putString("from", from)
            bundle.putString("to", to)
            bundle.putString("id", id_product)
            view.findNavController().navigate(R.id.action_producFragmentNight_to_finalFragmentNight, bundle)
        }
        print?.setOnClickListener{ view: View ->
            val bundle = Bundle()
            val id_product = "5"
            bundle.putString("from", from)
            bundle.putString("to", to)
            bundle.putString("id", id_product)
            view.findNavController().navigate(R.id.action_producFragmentNight_to_finalFragmentNight, bundle)
        }
        kigurumi?.setOnClickListener{ view: View ->
            val bundle = Bundle()
            val id_product = "6"
            bundle.putString("from", from)
            bundle.putString("to", to)
            bundle.putString("id", id_product)
            view.findNavController().navigate(R.id.action_producFragmentNight_to_finalFragmentNight, bundle)
        }
        manga?.setOnClickListener{ view: View ->
            val bundle = Bundle()
            val id_product = "7"
            bundle.putString("from", from)
            bundle.putString("to", to)
            bundle.putString("id", id_product)
            view.findNavController().navigate(R.id.action_producFragmentNight_to_finalFragmentNight, bundle)
        }
        bag?.setOnClickListener{ view: View ->
            val bundle = Bundle()
            val id_product = "8"
            bundle.putString("from", from)
            bundle.putString("to", to)
            bundle.putString("id", id_product)
            view.findNavController().navigate(R.id.action_producFragmentNight_to_finalFragmentNight, bundle)
        }
        pin?.setOnClickListener{ view: View ->
            val bundle = Bundle()
            val id_product = "9"
            bundle.putString("from", from)
            bundle.putString("to", to)
            bundle.putString("id", id_product)
            view.findNavController().navigate(R.id.action_producFragmentNight_to_finalFragmentNight, bundle)
        }
        dakimakura?.setOnClickListener{ view: View ->
            val bundle = Bundle()
            val id_product = "10"
            bundle.putString("from", from)
            bundle.putString("to", to)
            bundle.putString("id", id_product)
            view.findNavController().navigate(R.id.action_producFragmentNight_to_finalFragmentNight, bundle)
        }
        ears?.setOnClickListener{ view: View ->
            val bundle = Bundle()
            val id_product = "11"
            bundle.putString("from", from)
            bundle.putString("to", to)
            bundle.putString("id", id_product)
            view.findNavController().navigate(R.id.action_producFragmentNight_to_finalFragmentNight, bundle)
        }
        hat?.setOnClickListener{ view: View ->
            val bundle = Bundle()
            val id_product = "12"
            bundle.putString("from", from)
            bundle.putString("to", to)
            bundle.putString("id", id_product)
            view.findNavController().navigate(R.id.action_producFragmentNight_to_finalFragmentNight, bundle)
        }
        headphones?.setOnClickListener{ view: View ->
            val bundle = Bundle()
            val id_product = "13"
            bundle.putString("from", from)
            bundle.putString("to", to)
            bundle.putString("id", id_product)
            view.findNavController().navigate(R.id.action_producFragmentNight_to_finalFragmentNight, bundle)
        }
        instrument?.setOnClickListener{ view: View ->
            val bundle = Bundle()
            val id_product = "14"
            bundle.putString("from", from)
            bundle.putString("to", to)
            bundle.putString("id", id_product)
            view.findNavController().navigate(R.id.action_producFragmentNight_to_finalFragmentNight, bundle)

        }
        glass?.setOnClickListener{ view: View ->
            val bundle = Bundle()
            val id_product = "15"
            bundle.putString("from", from)
            bundle.putString("to", to)
            bundle.putString("id", id_product)
            view.findNavController().navigate(R.id.action_producFragmentNight_to_finalFragmentNight, bundle)

        }
        vynil_player?.setOnClickListener{ view: View ->
            val bundle = Bundle()
            val id_product = "16"
            bundle.putString("from", from)
            bundle.putString("to", to)
            bundle.putString("id", id_product)
            view.findNavController().navigate(R.id.action_producFragmentNight_to_finalFragmentNight, bundle)
        }
        metronom?.setOnClickListener{ view: View ->
            val bundle = Bundle()
            val id_product = "17"
            bundle.putString("from", from)
            bundle.putString("to", to)
            bundle.putString("id", id_product)
            view.findNavController().navigate(R.id.action_producFragmentNight_to_finalFragmentNight, bundle)
        }
        mediator?.setOnClickListener{ view: View ->
            val bundle = Bundle()
            val id_product = "18"
            bundle.putString("from", from)
            bundle.putString("to", to)
            bundle.putString("id", id_product)
            view.findNavController().navigate(R.id.action_producFragmentNight_to_finalFragmentNight, bundle)
        }
        socks?.setOnClickListener{ view: View ->
            val bundle = Bundle()
            val id_product = "19"
            bundle.putString("from", from)
            bundle.putString("to", to)
            bundle.putString("id", id_product)
            view.findNavController().navigate(R.id.action_producFragmentNight_to_finalFragmentNight, bundle)
        }
        warm?.setOnClickListener{ view: View ->
            val bundle = Bundle()
            val id_product = "20"
            bundle.putString("from", from)
            bundle.putString("to", to)
            bundle.putString("id", id_product)
            view.findNavController().navigate(R.id.action_producFragmentNight_to_finalFragmentNight, bundle)
        }
        palat?.setOnClickListener{ view: View ->
            val bundle = Bundle()
            val id_product = "21"
            bundle.putString("from", from)
            bundle.putString("to", to)
            bundle.putString("id", id_product)
            view.findNavController().navigate(R.id.action_producFragmentNight_to_finalFragmentNight, bundle)
        }
        manok?.setOnClickListener{ view: View ->
            val bundle = Bundle()
            val id_product = "22"
            bundle.putString("from", from)
            bundle.putString("to", to)
            bundle.putString("id", id_product)
            view.findNavController().navigate(R.id.action_producFragmentNight_to_finalFragmentNight, bundle)
        }
        gloves?.setOnClickListener{ view: View ->
            val bundle = Bundle()
            val id_product = "23"
            bundle.putString("from", from)
            bundle.putString("to", to)
            bundle.putString("id", id_product)
            view.findNavController().navigate(R.id.action_producFragmentNight_to_finalFragmentNight, bundle)
        }
        globus?.setOnClickListener{ view: View ->
            val bundle = Bundle()
            val id_product = "24"
            bundle.putString("from", from)
            bundle.putString("to", to)
            bundle.putString("id", id_product)
            view.findNavController().navigate(R.id.action_producFragmentNight_to_finalFragmentNight, bundle)
        }
        sand_clock?.setOnClickListener{ view: View ->
            val bundle = Bundle()
            val id_product = "25"
            bundle.putString("from", from)
            bundle.putString("to", to)
            bundle.putString("id", id_product)
            view.findNavController().navigate(R.id.action_producFragmentNight_to_finalFragmentNight, bundle)

        }
        neocube?.setOnClickListener{ view: View ->
            val bundle = Bundle()
            val id_product = "26"
            bundle.putString("from", from)
            bundle.putString("to", to)
            bundle.putString("id", id_product)
            view.findNavController().navigate(R.id.action_producFragmentNight_to_finalFragmentNight, bundle)

        }
        planetarium?.setOnClickListener{ view: View ->
            val bundle = Bundle()
            val id_product = "27"
            bundle.putString("from", from)
            bundle.putString("to", to)
            bundle.putString("id", id_product)
            view.findNavController().navigate(R.id.action_producFragmentNight_to_finalFragmentNight, bundle)

        }
        projector?.setOnClickListener{ view: View ->
            val bundle = Bundle()
            val id_product = "28"
            bundle.putString("from", from)
            bundle.putString("to", to)
            bundle.putString("id", id_product)
            view.findNavController().navigate(R.id.action_producFragmentNight_to_finalFragmentNight, bundle)
        }
        puzzles?.setOnClickListener{ view: View ->
            val bundle = Bundle()
            val id_product = "29"
            bundle.putString("from", from)
            bundle.putString("to", to)
            bundle.putString("id", id_product)
            view.findNavController().navigate(R.id.action_producFragmentNight_to_finalFragmentNight, bundle)
        }
        bonsai?.setOnClickListener{ view: View ->
            val bundle = Bundle()
            val id_product = "30"
            bundle.putString("from", from)
            bundle.putString("to", to)
            bundle.putString("id", id_product)
            view.findNavController().navigate(R.id.action_producFragmentNight_to_finalFragmentNight, bundle)
        }
        enciclopedia?.setOnClickListener{ view: View ->
            val bundle = Bundle()
            val id_product = "31"
            bundle.putString("from", from)
            bundle.putString("to", to)
            bundle.putString("id", id_product)
            view.findNavController().navigate(R.id.action_producFragmentNight_to_finalFragmentNight, bundle)
        }
        experiment?.setOnClickListener{ view: View ->
            val bundle = Bundle()
            val id_product = "32"
            bundle.putString("from", from)
            bundle.putString("to", to)
            bundle.putString("id", id_product)
            view.findNavController().navigate(R.id.action_producFragmentNight_to_finalFragmentNight, bundle)
        }
        table_game?.setOnClickListener{ view: View ->
            val bundle = Bundle()
            val id_product = "33"
            bundle.putString("from", from)
            bundle.putString("to", to)
            bundle.putString("id", id_product)
            view.findNavController().navigate(R.id.action_producFragmentNight_to_finalFragmentNight, bundle)
        }
        disc_game?.setOnClickListener{ view: View ->
            val bundle = Bundle()
            val id_product = "34"
            bundle.putString("from", from)
            bundle.putString("to", to)
            bundle.putString("id", id_product)
            view.findNavController().navigate(R.id.action_producFragmentNight_to_finalFragmentNight, bundle)
        }
        chair?.setOnClickListener{ view: View ->
            val bundle = Bundle()
            val id_product = "35"
            bundle.putString("from", from)
            bundle.putString("to", to)
            bundle.putString("id", id_product)
            view.findNavController().navigate(R.id.action_producFragmentNight_to_finalFragmentNight, bundle)
        }
        console?.setOnClickListener{ view: View ->
            val bundle = Bundle()
            val id_product = "36"
            bundle.putString("from", from)
            bundle.putString("to", to)
            bundle.putString("id", id_product)
            view.findNavController().navigate(R.id.action_producFragmentNight_to_finalFragmentNight, bundle)
        }
        cleaner?.setOnClickListener{ view: View ->
            val bundle = Bundle()
            val id_product = "37"
            bundle.putString("from", from)
            bundle.putString("to", to)
            bundle.putString("id", id_product)
            view.findNavController().navigate(R.id.action_producFragmentNight_to_finalFragmentNight, bundle)

        }
        ventilator?.setOnClickListener{ view: View ->
            val bundle = Bundle()
            val id_product = "38"
            bundle.putString("from", from)
            bundle.putString("to", to)
            bundle.putString("id", id_product)
            view.findNavController().navigate(R.id.action_producFragmentNight_to_finalFragmentNight, bundle)

        }
        polaroid?.setOnClickListener{ view: View ->
            val bundle = Bundle()
            val id_product = "39"
            bundle.putString("from", from)
            bundle.putString("to", to)
            bundle.putString("id", id_product)
            view.findNavController().navigate(R.id.action_producFragmentNight_to_finalFragmentNight, bundle)

        }
        sketchbook?.setOnClickListener{ view: View ->
            val bundle = Bundle()
            val id_product = "40"
            bundle.putString("from", from)
            bundle.putString("to", to)
            bundle.putString("id", id_product)
            view.findNavController().navigate(R.id.action_producFragmentNight_to_finalFragmentNight, bundle)
        }
        paint_tools?.setOnClickListener{ view: View ->
            val bundle = Bundle()
            val id_product = "41"
            bundle.putString("from", from)
            bundle.putString("to", to)
            bundle.putString("id", id_product)
            view.findNavController().navigate(R.id.action_producFragmentNight_to_finalFragmentNight, bundle)
        }
        graph_palnshet?.setOnClickListener{ view: View ->
            val bundle = Bundle()
            val id_product = "42"
            bundle.putString("from", from)
            bundle.putString("to", to)
            bundle.putString("id", id_product)
            view.findNavController().navigate(R.id.action_producFragmentNight_to_finalFragmentNight, bundle)
        }
        dekupaj?.setOnClickListener{ view: View ->
            val bundle = Bundle()
            val id_product = "43"
            bundle.putString("from", from)
            bundle.putString("to", to)
            bundle.putString("id", id_product)
            view.findNavController().navigate(R.id.action_producFragmentNight_to_finalFragmentNight, bundle)
        }
        scrapbooking?.setOnClickListener{ view: View ->
            val bundle = Bundle()
            val id_product = "44"
            bundle.putString("from", from)
            bundle.putString("to", to)
            bundle.putString("id", id_product)
            view.findNavController().navigate(R.id.action_producFragmentNight_to_finalFragmentNight, bundle)
        }
        glina?.setOnClickListener{ view: View ->
            val bundle = Bundle()
            val id_product = "45"
            bundle.putString("from", from)
            bundle.putString("to", to)
            bundle.putString("id", id_product)
            view.findNavController().navigate(R.id.action_producFragmentNight_to_finalFragmentNight, bundle)
        }
        kacheli?.setOnClickListener{ view: View ->
            val bundle = Bundle()
            val id_product = "46"
            bundle.putString("from", from)
            bundle.putString("to", to)
            bundle.putString("id", id_product)
            view.findNavController().navigate(R.id.action_producFragmentNight_to_finalFragmentNight, bundle)
        }
        shezlong?.setOnClickListener{ view: View ->
            val bundle = Bundle()
            val id_product = "47"
            bundle.putString("from", from)
            bundle.putString("to", to)
            bundle.putString("id", id_product)
            view.findNavController().navigate(R.id.action_producFragmentNight_to_finalFragmentNight, bundle)
        }
        garden_inst?.setOnClickListener{ view: View ->
            val bundle = Bundle()
            val id_product = "48"
            bundle.putString("from", from)
            bundle.putString("to", to)
            bundle.putString("id", id_product)
            view.findNavController().navigate(R.id.action_producFragmentNight_to_finalFragmentNight, bundle)
        }
        mebel?.setOnClickListener{ view: View ->
            val bundle = Bundle()
            val id_product = "49"
            bundle.putString("from", from)
            bundle.putString("to", to)
            bundle.putString("id", id_product)
            view.findNavController().navigate(R.id.action_producFragmentNight_to_finalFragmentNight, bundle)

        }
        light?.setOnClickListener{ view: View ->
            val bundle = Bundle()
            val id_product = "50"
            bundle.putString("from", from)
            bundle.putString("to", to)
            bundle.putString("id", id_product)
            view.findNavController().navigate(R.id.action_producFragmentNight_to_finalFragmentNight, bundle)

        }
        decor?.setOnClickListener{ view: View ->
            val bundle = Bundle()
            val id_product = "51"
            bundle.putString("from", from)
            bundle.putString("to", to)
            bundle.putString("id", id_product)
            view.findNavController().navigate(R.id.action_producFragmentNight_to_finalFragmentNight, bundle)

        }
        shagomer?.setOnClickListener{ view: View ->
            val bundle = Bundle()
            val id_product = "52"
            bundle.putString("from", from)
            bundle.putString("to", to)
            bundle.putString("id", id_product)
            view.findNavController().navigate(R.id.action_producFragmentNight_to_finalFragmentNight, bundle)
        }
        braslet?.setOnClickListener{ view: View ->
            val bundle = Bundle()
            val id_product = "53"
            bundle.putString("from", from)
            bundle.putString("to", to)
            bundle.putString("id", id_product)
            view.findNavController().navigate(R.id.action_producFragmentNight_to_finalFragmentNight, bundle)
        }
        crossovki?.setOnClickListener{ view: View ->
            val bundle = Bundle()
            val id_product = "54"
            bundle.putString("from", from)
            bundle.putString("to", to)
            bundle.putString("id", id_product)
            view.findNavController().navigate(R.id.action_producFragmentNight_to_finalFragmentNight, bundle)
        }
        yoga?.setOnClickListener{ view: View ->
            val bundle = Bundle()
            val id_product = "55"
            bundle.putString("from", from)
            bundle.putString("to", to)
            bundle.putString("id", id_product)
            view.findNavController().navigate(R.id.action_producFragmentNight_to_finalFragmentNight, bundle)
        }
        bottle?.setOnClickListener{ view: View ->
            val bundle = Bundle()
            val id_product = "56"
            bundle.putString("from", from)
            bundle.putString("to", to)
            bundle.putString("id", id_product)
            view.findNavController().navigate(R.id.action_producFragmentNight_to_finalFragmentNight, bundle)
        }
        conder?.setOnClickListener{ view: View ->
            val bundle = Bundle()
            val id_product = "57"
            bundle.putString("from", from)
            bundle.putString("to", to)
            bundle.putString("id", id_product)
            view.findNavController().navigate(R.id.action_producFragmentNight_to_finalFragmentNight, bundle)
        }
        ionizator?.setOnClickListener{ view: View ->
            val bundle = Bundle()
            val id_product = "58"
            bundle.putString("from", from)
            bundle.putString("to", to)
            bundle.putString("id", id_product)
            view.findNavController().navigate(R.id.action_producFragmentNight_to_finalFragmentNight, bundle)
        }
        nakidka?.setOnClickListener{ view: View ->
            val bundle = Bundle()
            val id_product = "59"
            bundle.putString("from", from)
            bundle.putString("to", to)
            bundle.putString("id", id_product)
            view.findNavController().navigate(R.id.action_producFragmentNight_to_finalFragmentNight, bundle)
        }
        auto_brelok?.setOnClickListener{ view: View ->
            val bundle = Bundle()
            val id_product = "60"
            bundle.putString("from", from)
            bundle.putString("to", to)
            bundle.putString("id", id_product)
            view.findNavController().navigate(R.id.action_producFragmentNight_to_finalFragmentNight, bundle)
        }
        organaizer?.setOnClickListener{ view: View ->
            val bundle = Bundle()
            val id_product = "61"
            bundle.putString("from", from)
            bundle.putString("to", to)
            bundle.putString("id", id_product)
            view.findNavController().navigate(R.id.action_producFragmentNight_to_finalFragmentNight, bundle)
        }
        auto_cleaner?.setOnClickListener{ view: View ->
            val bundle = Bundle()
            val id_product = "62"
            bundle.putString("from", from)
            bundle.putString("to", to)
            bundle.putString("id", id_product)
            view.findNavController().navigate(R.id.action_producFragmentNight_to_finalFragmentNight, bundle)
        }



        setFragmentResultListener("requestKey") { key, bundle ->
            // Здесь можно передать любой тип, поддерживаемый Bundle-ом
            val anime = bundle.getBoolean("anime")
            Log.d("anime",anime.toString())
            val music = bundle.getBoolean("music")
            val hunt = bundle.getBoolean("hunt")
            val since = bundle.getBoolean("since")
            val game = bundle.getBoolean("game")
            val hand = bundle.getBoolean("hand")
            val garden = bundle.getBoolean("garden")
            val sport = bundle.getBoolean("sport")
            val auto = bundle.getBoolean("auto")
            if(anime != true && music != true && hunt != true &&
                since != true && game != true && hand != true &&
                garden != true && sport != true && auto != true){
                text_product?.setVisibility(View.VISIBLE)
            }
            if(anime != true && music != true){
                print?.setVisibility(View.GONE)
                pin?.setVisibility(View.GONE)
            }
            if(anime != true && game != true){
                figure?.setVisibility(View.GONE)

            }
            if (anime != true){
                haori?.setVisibility(View.GONE)
                painting?.setVisibility(View.GONE)
                sweet?.setVisibility(View.GONE)
                kigurumi?.setVisibility(View.GONE)
                manga?.setVisibility(View.GONE)
                bag?.setVisibility(View.GONE)
                dakimakura?.setVisibility(View.GONE)
                ears?.setVisibility(View.GONE)
                hat?.setVisibility(View.GONE)
            }
            if (music != true){
                headphones?.setVisibility(View.GONE)
                instrument?.setVisibility(View.GONE)
                glass?.setVisibility(View.GONE)
                vynil_player?.setVisibility(View.GONE)
                metronom?.setVisibility(View.GONE)
                mediator?.setVisibility(View.GONE)
            }
            if (hunt != true){
                socks?.setVisibility(View.GONE)
                warm?.setVisibility(View.GONE)
                palat?.setVisibility(View.GONE)
                manok?.setVisibility(View.GONE)
                gloves?.setVisibility(View.GONE)
            }
            if (since != true){
                globus?.setVisibility(View.GONE)
                sand_clock?.setVisibility(View.GONE)
                neocube?.setVisibility(View.GONE)
                planetarium?.setVisibility(View.GONE)
                projector?.setVisibility(View.GONE)
                puzzles?.setVisibility(View.GONE)
                bonsai?.setVisibility(View.GONE)
                enciclopedia?.setVisibility(View.GONE)
                experiment?.setVisibility(View.GONE)
            }
            if (game != true){
                table_game?.setVisibility(View.GONE)
                disc_game?.setVisibility(View.GONE)
                chair?.setVisibility(View.GONE)
                console?.setVisibility(View.GONE)
                cleaner?.setVisibility(View.GONE)
                ventilator?.setVisibility(View.GONE)
            }
            if (hand != true){
                polaroid?.setVisibility(View.GONE)
                sketchbook?.setVisibility(View.GONE)
                paint_tools?.setVisibility(View.GONE)
                graph_palnshet?.setVisibility(View.GONE)
                dekupaj?.setVisibility(View.GONE)
                scrapbooking?.setVisibility(View.GONE)
                glina?.setVisibility(View.GONE)
            }
            if (garden != true){
                kacheli?.setVisibility(View.GONE)
                shezlong?.setVisibility(View.GONE)
                garden_inst?.setVisibility(View.GONE)
                mebel?.setVisibility(View.GONE)
                light?.setVisibility(View.GONE)
                decor?.setVisibility(View.GONE)
            }
            if (sport != true){
                shagomer?.setVisibility(View.GONE)
                braslet?.setVisibility(View.GONE)
                crossovki?.setVisibility(View.GONE)
                yoga?.setVisibility(View.GONE)
                bottle?.setVisibility(View.GONE)
            }
            if (auto != true){
                conder?.setVisibility(View.GONE)
                ionizator?.setVisibility(View.GONE)
                nakidka?.setVisibility(View.GONE)
                auto_brelok?.setVisibility(View.GONE)
                organaizer?.setVisibility(View.GONE)
                auto_cleaner?.setVisibility(View.GONE)
            }

        }

    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment ProducFragmentNight.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            ProducFragmentNight().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}