package com.javdiana.mylib

import android.app.AlertDialog
import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.EditText
import android.widget.Switch
import androidx.fragment.app.DialogFragment

class AddBookDialog() : DialogFragment() {
    private lateinit var book: Book
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val view: View = LayoutInflater.from(activity).inflate(R.layout.dialog_add_book, null)

        val name: EditText = view.findViewById(R.id.editText_add_name_of_book)
        val author: EditText = view.findViewById(R.id.editText_add_authors)
        val pages: EditText = view.findViewById(R.id.editText_add_pages)
        val isRead: Switch = view.findViewById(R.id.switch_add_is_read)

        val listener = DialogInterface.OnClickListener { dialogInterface, i ->
            book = Book()
            book.id = books.size + 1.toLong()
            book.name = name.text.toString()
            book.authors = listOf(author.text.toString())
            book.pages = pages.text.toString().toInt()
            book.isRead = isRead.isChecked

            updateBooks(book)
        }


        return AlertDialog.Builder(activity)
            .setView(view)
            .setTitle("Enter data:")
            .setPositiveButton("Ok", listener)
            .setNegativeButton("Cancel", null)
            .create()
    }
}