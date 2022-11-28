package com.axis.service

import com.axis.module.Book
import com.axis.utility.BookUtil

class BookService {
    var bookUtil = BookUtil()

    fun addBook(book: Book){
        bookUtil.addBook(book)
    }

    fun updateBook(bookID:String, updateValue:String):Int{
        var result=bookUtil.updateBook(bookID, updateValue)
        return result
    }

    fun deleteBook(deletebookID:String):Int{
        var delete=bookUtil.deleteBook(deletebookID)
        return delete
    }

    fun displayAll():MutableList<Book>{
        return bookUtil.displayAll()
    }

    fun displayBook(bookID: String):MutableList<Book>{
        return bookUtil.display(bookID)
    }

    fun searchbyTitle(title:String):MutableList<Book>{
        return bookUtil.searchbyTitle(title)
    }

    fun searchbyAuthor(author:String):MutableList<Book>{
        return bookUtil.searchbyAuthor(author)
    }

    fun sortByName():List<Book>{
        return bookUtil.displayAll().sortedBy { it.price }
    }


}



