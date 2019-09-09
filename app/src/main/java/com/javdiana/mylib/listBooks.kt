package com.javdiana.mylib


var books = mutableListOf(
    Book(1L, "Game of thrones 5", listOf("George Martin"), 1100, false),
    Book(2L, "Why do we sleep?", listOf("Mettiu Volker"), 202, true),
    Book(3L, "Psychology 101", listOf("Pol Kleyman"), 240, false)
)

fun updateBooks(book: Book) {
    books.add(book)
}