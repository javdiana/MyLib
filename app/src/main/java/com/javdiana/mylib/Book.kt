package com.javdiana.mylib

class Book(var id: Long, var name: String, var authors: List<String>, var pages: Int, var isRead: Boolean) {
    constructor() : this(0L, "", listOf(""), 0, false)
}
