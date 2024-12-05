package com.example.praktika11_fragments.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.praktika11_fragments.databinding.FragmentHomeBinding
import com.example.praktika11_fragments.adapters.AltzariAdapter
import com.example.praktika11_fragments.models.Altzari

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val altzariak = listOf(
            Altzari("LIATORP", "Estanteria", "Madera maciza", "120x30x210 cm", 169.00),
            Altzari("NORDLI", "Estanteria", "Madera maciza", "120x30x100 cm", 269.00),
            Altzari("HEMNES", "Estanteria", "Madera maciza", "160x48x96 cm", 299.00)
        )
        // Configurar RecyclerView
        binding.recyclerView.layoutManager = LinearLayoutManager(requireContext())
        binding.recyclerView.adapter = AltzariAdapter(altzariak)
    }
}
