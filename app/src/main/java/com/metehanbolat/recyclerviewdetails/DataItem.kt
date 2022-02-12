package com.metehanbolat.recyclerviewdetails

sealed class DataItem {

    data class TodoItem(val todoId: Int, val todoText: String): DataItem()
    data class Header(val header: String): DataItem()

}
