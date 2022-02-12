package com.metehanbolat.recyclerviewdetails

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.metehanbolat.recyclerviewdetails.databinding.TodoItemDesignBinding

class TodoAdapter: ListAdapter<TodoModel, TodoAdapter.TodoViewHolder>(TodoDiffUtilCallback()) {

    //var onTodoClick: (TodoModel) -> Unit = {}

    //private val todoList = arrayListOf<TodoModel>()

    class TodoViewHolder(val binding: TodoItemDesignBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder {
        val binding = TodoItemDesignBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TodoViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {
        val currentItem = getItem(position)
        holder.binding.apply {
            todoItem = currentItem

        }
    }
}