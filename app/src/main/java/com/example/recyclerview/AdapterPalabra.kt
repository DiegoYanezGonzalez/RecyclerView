package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterPalabra(private val listaElementos:MutableList<String>) :
    RecyclerView.Adapter<AdapterPalabra.PalabraViewHolder>() {

class PalabraViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

    var textView : TextView =itemView.findViewById(R.id.word_text)
//var textView : TextView = itemView.word_text
}
       //CREA EL VIEW HOLDER Y LE INFLA EL OBJETO VIEW PARA QUE SE MUESTRE
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PalabraViewHolder {
      val view = LayoutInflater.from(parent.context)
          .inflate(R.layout.item_list_view_holder,parent,false)
           return PalabraViewHolder(view)
    }
     //CANTIDAD DE ELEMENTOS
    override fun getItemCount(): Int {
   return listaElementos.size
    }


     //UNIMOS LOS DATOS CON EL ELEMENTO POR POSICION DONDE TIENE QUE IR A MOSTRARSE
    override fun onBindViewHolder(holder: PalabraViewHolder, position: Int) {

         holder.textView.text = listaElementos[position]

    }

}