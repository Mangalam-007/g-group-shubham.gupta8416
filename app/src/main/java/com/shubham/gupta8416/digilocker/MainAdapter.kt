package com.shubham.gupta8416.digilocker

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.issued_document.view.*
import kotlinx.android.synthetic.main.potential.view.*
import kotlinx.android.synthetic.main.potential.view.name

class MainAdapter : RecyclerView.Adapter<MainAdapter.CustomViewHolder>() {


        private var accountList = listOf<String>("Aadhar")

        class CustomViewHolder(view: View) : RecyclerView.ViewHolder(view) {}

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
            return CustomViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.issued_document, parent, false))
        }

        override fun getItemCount(): Int {
            return accountList.size
        }

        override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
            val currentItem = accountList[position]
            holder.itemView.name.text=currentItem
            holder.itemView.issued_document.setOnClickListener{
                holder.itemView.findNavController().navigate(R.id.action_homeScreenFragment_to_issuedDocumentFragment)
            }
        }
    }
