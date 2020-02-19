package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.lo_employee.view.*

class EmployeesAdapter(val employees: ArrayList<Employee>) :
    RecyclerView.Adapter<EmployeesAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val txtFirstName = itemView.txtFirstName
        val txtLastName = itemView.txtLastName
        val txtSalary = itemView.txtSalary
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.lo_employee, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return employees.size
    }

    override fun onBindViewHolder(holder: ViewHolder, p1: Int) {
        val employee: Employee = employees[p1]
        holder.txtFirstName.text = employee.firstName
        holder.txtLastName.text = employee.lastName
        holder.txtSalary.text = employee.lastName.toString()
    }


}

