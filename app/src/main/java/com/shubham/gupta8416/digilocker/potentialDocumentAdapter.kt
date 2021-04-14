package com.shubham.gupta8416.digilocker

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.potential.view.*

class potentialDocumentAdapter:RecyclerView.Adapter<potentialDocumentAdapter.CustomViewHolder>() {


        private var accountList = listOf<String>("Driving License","PAN Card", "Vechile Registration")

        class CustomViewHolder(view: View) : RecyclerView.ViewHolder(view) {}

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
            return CustomViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.potential, parent, false))
        }

        override fun getItemCount(): Int {
            return accountList.size
        }

        override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
            val currentItem = accountList[position]
            holder.itemView.name.text=currentItem
            holder.itemView.get.setOnClickListener{
                holder.itemView.findNavController().navigate(HomeScreenFragmentDirections.actionHomeScreenFragmentToPotentialFragment(currentItem))
            }
        }
    }