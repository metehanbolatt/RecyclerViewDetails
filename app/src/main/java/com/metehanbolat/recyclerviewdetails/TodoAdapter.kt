package com.metehanbolat.recyclerviewdetails

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.metehanbolat.recyclerviewdetails.databinding.TodoHeaderDesignBinding
import com.metehanbolat.recyclerviewdetails.databinding.TodoItemDesignBinding

private val TYPE_HEADER = 0
private val TYPE_ITEM = 1

class TodoAdapter: RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    var onTodoClick: (TodoModel) -> Unit = {}

    private val todoList = arrayListOf<Any>()

    class TodoViewHolder(val binding: TodoItemDesignBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(todo: DataItem.TodoItem) {
            binding.todoItem = todo
        }
    }

    class HeaderViewHolder(val headerBinding: TodoHeaderDesignBinding): RecyclerView.ViewHolder(headerBinding.root) {
        fun bind(header: DataItem.Header) {
            headerBinding.header = header.header
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when(viewType) {
            TYPE_ITEM -> TodoViewHolder(TodoItemDesignBinding.inflate(LayoutInflater.from(parent.context), parent, false))
            TYPE_HEADER -> HeaderViewHolder(TodoHeaderDesignBinding.inflate(LayoutInflater.from(parent.context), parent, false))
            else -> throw IllegalArgumentException("Invalid ViewType")
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder) {
            is TodoViewHolder -> holder.bind(todoList[position] as DataItem.TodoItem)
            is HeaderViewHolder -> holder.bind(todoList[position] as DataItem.Header)
        }

    }

    override fun getItemCount(): Int = todoList.size

    override fun getItemViewType(position: Int): Int {
        return when (todoList[position]) {
            is DataItem.TodoItem -> TYPE_ITEM
            is DataItem.Header -> TYPE_HEADER
            else -> throw IllegalArgumentException("Invalid Data")
        }
    }

    fun updateList(updatedList: List<Any>) {
        todoList.clear()
        todoList.addAll(updatedList)
        notifyDataSetChanged()
    }

}