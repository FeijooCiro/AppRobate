package com.mardelapps.apprueba.todoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mardelapps.apprueba.R

class TodoActivity : AppCompatActivity() {

    private val categories = listOf(
        TaskCategory.Personal,
        TaskCategory.Business,
        TaskCategory.Other
    )

    private val tasks = mutableListOf(
        Task("PruebaBusiness", TaskCategory.Business),
        Task("PruebaBusinessTwo", TaskCategory.Business),
        Task("PruebaPersonal", TaskCategory.Personal),
        Task("PruebaPersonalTwo", TaskCategory.Business)
    )

    private lateinit var rvCategories:RecyclerView
    private lateinit var rvTasks:RecyclerView
    private lateinit var categoriesAdapter: CategoriesAdapter
    private lateinit var tasksAdapter: TasksAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_todo)
        initComponents()
        initUI()
    }

    private fun initComponents() {
        rvCategories = findViewById(R.id.rvCategories)
        rvTasks = findViewById(R.id.rvTasks)
    }

    private fun initUI() {
        categoriesAdapter = CategoriesAdapter(categories)
        rvCategories.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        rvCategories.adapter = categoriesAdapter

        //tasksAdapter = TasksAdapter()
    }
}