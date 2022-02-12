package com.metehanbolat.recyclerviewdetails

object TodoDb {

    fun getTodos(): ArrayList<Any> {

        val todoList = arrayListOf<Any>()

        todoList.add(DataItem.Header("Günlük"))
        todoList.add(DataItem.TodoItem(1, "Alışverişe Git"))
        todoList.add(DataItem.TodoItem(2, "16:00 Ekip Toplantısı"))
        todoList.add(DataItem.TodoItem(3, "Bitirme tezine çalış"))
        todoList.add(DataItem.TodoItem(4, "Telefon faturasını yatır"))
        todoList.add(DataItem.TodoItem(5, "Çeviriyi tamamla"))
        todoList.add(DataItem.TodoItem(6, "Ödevleri hazırla"))
        todoList.add(DataItem.TodoItem(7, "Bilgisayarı temizle"))
        todoList.add(DataItem.TodoItem(8, "Bug'lara bak"))
        todoList.add(DataItem.TodoItem(9, "Proje için hazırlık yap"))
        todoList.add(DataItem.TodoItem(10, "Bankayı ara"))

        todoList.add(DataItem.Header("Düzenli"))
        todoList.add(DataItem.TodoItem(11, "Her gün 30dk spor yap"))
        todoList.add(DataItem.TodoItem(11, "Her gün 30dk kitap oku"))
        todoList.add(DataItem.TodoItem(12, "Her gün Medium'da bir yazı oku"))
        todoList.add(DataItem.TodoItem(13, "Her gün 30dk ingilizce çalış"))

        return todoList
    }
}