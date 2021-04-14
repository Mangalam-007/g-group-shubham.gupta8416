package com.shubham.gupta8416.digilocker

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.navArgs
import com.shubham.gupta8416.digilocker.databinding.FragmentPotentialBinding

class PotentialFragment : Fragment() {
    //private val args by navArgs<PotentialFragmentArgs>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val args by navArgs<PotentialFragmentArgs>()
        // Inflate the layout for this fragment
        val binding=DataBindingUtil.inflate<FragmentPotentialBinding>(inflater,R.layout.fragment_potential,container,false)
        binding.document.text=args.driving
        return binding.root
    }
}