package com.javdiana.mylib.recyclerView

import android.view.View
import android.widget.Switch
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.javdiana.mylib.Book
import com.javdiana.mylib.R

class BookViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private lateinit var name: TextView
    private lateinit var authors: TextView
    private lateinit var pages: TextView
    private lateinit var isRead: Switch

    fun initViews() {
        name = itemView.findViewById(R.id.textView_name_book)
        authors = itemView.findViewById(R.id.textView_authors)
        pages = itemView.findViewById(R.id.textView_pages)
        isRead = itemView.findViewById(R.id.switch_isRead)
    }

    fun bind(book: Book) {
        initViews()
        name.text = book.name
        authors.text = book.authors[0]//just for 1
        val pagesInt = book.pages
        pages.text = "Pages: $pagesInt"
        isRead.isChecked = book.isRead
    }
}