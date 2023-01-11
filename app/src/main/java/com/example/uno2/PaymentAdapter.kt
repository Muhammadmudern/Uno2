package com.example.uno2

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PaymentAdapter(var context: Context, var payment_list: List<PaymentModel>?) :
RecyclerView.Adapter<PaymentAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.fragment_shop_item_add, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: PaymentAdapter.ViewHolder, position: Int) {
        if (payment_list != null && payment_list!!.isNotEmpty()) {
            val model: PaymentModel = payment_list!![position]
            holder.nazvanya.text = model.nazvanye
            holder.payment.text = model.payment
            holder.count.text = model.count
        } else return
    }

    override fun getItemCount(): Int {
        return payment_list!!.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var nazvanya: TextView
        var payment: TextView
        var count: TextView

        init {
            nazvanya = itemView.findViewById(R.id.nazvnye)
            payment = itemView.findViewById(R.id.payment)
            count = itemView.findViewById(R.id.count)
        }
    }
}