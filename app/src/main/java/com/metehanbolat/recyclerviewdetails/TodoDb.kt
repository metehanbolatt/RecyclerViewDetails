package com.metehanbolat.recyclerviewdetails

object TodoDb {

    fun getTodos(): ArrayList<TodoModel> {

        val todoList = arrayListOf<TodoModel>()

        todoList.add(TodoModel(1, "Alışverişe Git"))
        todoList.add(TodoModel(2, "16:00 Ekip Toplantısı"))
        todoList.add(TodoModel(3, "Bitirme tezine çalış"))
        todoList.add(TodoModel(4, "Telefon faturasını yatır"))
        todoList.add(TodoModel(5, "Çeviriyi tamamla"))
        todoList.add(TodoModel(6, "Ödevleri hazırla"))
        todoList.add(TodoModel(7, "Bilgisayarı temizle"))
        todoList.add(TodoModel(8, "Bug'lara bak"))
        todoList.add(TodoModel(9, "Proje için hazırlık yap"))
        todoList.add(TodoModel(10, "Bankayı ara"))

        todoList.add(TodoModel(11, "Her gün 30dk spor yap"))
        todoList.add(TodoModel(11, "Her gün 30dk kitap oku"))
        todoList.add(TodoModel(12, "Her gün Medium'da bir yazı oku"))
        todoList.add(TodoModel(13, "Her gün 30dk ingilizce çalış"))

        return todoList
    }
}