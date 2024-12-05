package com.example.praktika11_fragments.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.praktika11_fragments.databinding.ItemAltzariBinding
import com.example.praktika11_fragments.models.Altzari

class AltzariAdapter(private val altzariak: List<Altzari>) : RecyclerView.Adapter<AltzariAdapter.AltzariViewHolder>() {

    // Crear el ViewHolder
    inner class AltzariViewHolder(val binding: ItemAltzariBinding) : RecyclerView.ViewHolder(binding.root)

    // Inflar el diseño para cada item
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AltzariViewHolder {
        val binding = ItemAltzariBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return AltzariViewHolder(binding)
    }

    // Vincular los datos con el ViewHolder
    override fun onBindViewHolder(holder: AltzariViewHolder, position: Int) {
        val altzari = altzariak[position]
        holder.binding.tvIzena.text = altzari.altzariIzena
        holder.binding.tvMota.text = altzari.altzariMota
        holder.binding.tvPrezioa.text = "€${altzari.prezioa}"
    }

    // Contar el número de elementos
    override fun getItemCount(): Int {
        return altzariak.size
    }
}