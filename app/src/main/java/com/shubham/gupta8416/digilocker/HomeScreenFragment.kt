package com.shubham.gupta8416.digilocker

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.shubham.gupta8416.digilocker.databinding.FragmentHomeScreenBinding
import kotlinx.android.synthetic.main.fragment_home_screen.*


class HomeScreenFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentHomeScreenBinding>(inflater,R.layout.fragment_home_screen,container,false)
        var name:String="Abhishek"
        super.onCreate(savedInstanceState)
        val adapter = MainAdapter()
        val recyclerView=binding.issuedDocuments
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        binding.welcome.text="Welcome, $name!"
        val adapter2 = potentialDocumentAdapter()
        val recyclerView2=binding.potentialDocuments
        recyclerView2.adapter=adapter2
        recyclerView2.layoutManager= LinearLayoutManager(requireContext())
        binding.airportHome.setOnClickListener {
            findNavController().navigate(HomeScreenFragmentDirections.actionHomeScreenFragmentToUse())
        }
        return binding.root
    }
}