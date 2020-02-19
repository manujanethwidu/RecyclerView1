package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager

import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    var employeesList = ArrayList<Employee>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        fillData()

        val adapter = EmployeesAdapter(employeesList)
        val rv : RecyclerView = findViewById(R.id.rv)
        rv.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false) as RecyclerView.LayoutManager
        rv.adapter = adapter
    }

    private fun fillData(){
        adRecords(("A"),"B",45F)
        adRecords(("c"),"d",45F)
        adRecords(("E"),"F",45F)
        adRecords(("G"),"H",45F)

    }

    private fun adRecords(firstName: String, lastName: String, salary: Float) {
        val empl = Employee()

        empl.firstName = firstName
        empl.lastName = lastName
        empl.salary = salary

        employeesList.add(empl)
    }
}
