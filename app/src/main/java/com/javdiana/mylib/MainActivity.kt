package com.javdiana.mylib

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.javdiana.mylib.recyclerView.BookAdapter

class MainActivity : AppCompatActivity() {
    private lateinit var rvBook: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvBook = findViewById(R.id.rv_books)
        rvBook.layoutManager = LinearLayoutManager(applicationContext)
        rvBook.adapter = BookAdapter(books, applicationContext)

        val ivAddNewBook: ImageView = findViewById(R.id.imageView_add)
        val listener = View.OnClickListener {
            val manager: FragmentManager = supportFragmentManager
            val dialog = AddBookDialog()
            dialog.show(manager, "dialog")
        }
        ivAddNewBook.setOnClickListener(listener)
    }

    override fun onResume() {
        super.onResume()
        rvBook.adapter = BookAdapter(books, applicationContext)
    }
}
