package com.metehanbolat.recyclerviewdetails

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.metehanbolat.recyclerviewdetails.databinding.TodoItemDesignBinding

class TodoAdapter: RecyclerView.Adapter<TodoAdapter.TodoViewHolder>() {

    var onTodoClick: (TodoModel) -> Unit = {}

    private val todoList = arrayListOf<TodoModel>()

    class TodoViewHolder(val binding: TodoItemDesignBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder {
        val binding = TodoItemDesignBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TodoViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {
        val currentItem = todoList[position]
        holder.binding.apply {
            todoItem = currentItem
            checkbox.setOnCheckedChangeListener { _, b ->
                if (b) {
                    onTodoClick(currentItem)
                }
            }
        }
    }

    override fun getItemCount(): Int = todoList.size

    fun updateList(updatedList: List<TodoModel>) {
        todoList.clear()
        todoList.addAll(updatedList)
        notifyDataSetChanged()
    }

}