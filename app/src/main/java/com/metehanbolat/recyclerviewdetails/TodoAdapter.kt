package com.metehanbolat.recyclerviewdetails

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.metehanbolat.recyclerviewdetails.databinding.TodoItemDesignBinding

class TodoAdapter(): RecyclerView.Adapter<TodoAdapter.TodoViewHolder>() {

    private val todoList = arrayListOf<TodoModel>()

    class TodoViewHolder(private val binding: TodoItemDesignBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(todo: TodoModel) {
            binding.todoItem = todo
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder {
        val binding = TodoItemDesignBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TodoViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {
        holder.bind(todoList[position])
    }

    override fun getItemCount(): Int = todoList.size

    fun updateList(updatedList: List<TodoModel>) {
        todoList.clear()
        todoList.addAll(updatedList)
        notifyDataSetChanged()
    }

}