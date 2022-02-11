package com.metehanbolat.recyclerviewdetails

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.metehanbolat.recyclerviewdetails.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val todoAdapter by lazy { TodoAdapter() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val todoList = TodoDb.getTodos()

        todoAdapter.updateList(todoList)
    }
}