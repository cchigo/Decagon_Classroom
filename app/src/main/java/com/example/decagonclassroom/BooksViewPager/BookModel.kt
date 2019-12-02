package com.example.decagonclassroom.BooksViewPager

class BookModel {
    private var image: Int = 0
    private var title: String = ""
    private var author: String = ""

    constructor(image: Int, title: String, author: String) {
        this.image = image
        this.title = title
        this.author = author
    }

    public fun getImage(): Int {
        return image;
    }

    public fun setImage(image: Int) {
        this.image = image
    }

    public fun getTitle(): String {
        return title;
    }

    public fun setTitle(title: String) {
        this.title = title
    }


    public fun getAuthor(): String {
        return author
    }

    public fun setAuthor(author: String) {
        this.author = author
    }
}