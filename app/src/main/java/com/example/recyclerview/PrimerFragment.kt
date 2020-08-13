package com.example.recyclerview

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView



class PrimerFragment : Fragment() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapterPalabra: AdapterPalabra
    private lateinit var layoutManager: RecyclerView.LayoutManager

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       //INFLA EL LAYOUT EN LA VARIABLE view
        val view = inflater.inflate(R.layout.fragment_primer, container, false)
        recyclerView = view.findViewById(R.id.recycler_view)
        adapterPalabra =AdapterPalabra(listaElementos.toMutableList())
        layoutManager = LinearLayoutManager(context)
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        }
    }


    val listaElementos: Array<String> = arrayOf(
        "palabra 1",
        "palabra 2",
        "palabra 3",
        "palabra 4",
        "palabra 5",
        "palabra 6",
        "palabra 7",
        "palabra 8"
    )



