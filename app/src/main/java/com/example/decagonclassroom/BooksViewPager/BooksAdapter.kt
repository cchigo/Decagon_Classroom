package com.example.decagonclassroom.BooksViewPager

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.viewpager.widget.PagerAdapter
import com.example.decagonclassroom.R

class BooksAdapter : PagerAdapter {

    lateinit var models : List<BookModel>
    lateinit var layoutInflater: LayoutInflater
    lateinit var context: Context

    constructor(models: List<BookModel>, context: Context) : super() {
        this.models = models
        this.context = context
    }


    override fun getCount(): Int {
        return models.size
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view.equals(`object`)
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        layoutInflater = LayoutInflater.from(context)
        var view : View = layoutInflater.inflate(R.layout.book, container, false)

        var bookImageView :ImageView
        var bookTitleView : TextView
        var bookAuthorView : TextView

        bookImageView = view.findViewById(R.id.book_image)
        bookTitleView = view.findViewById(R.id.book_title)
        bookAuthorView = view.findViewById(R.id.book_author)

        bookImageView.setImageResource(with(models) { get(position).getImage() })
        bookTitleView.text = with(models) { get(position).getTitle() }
        bookAuthorView.text = with(models) { get(position).getAuthor() }


        container.addView(view, 0)



        return view
    }

    override fun destroyItem(container: ViewGroup, position: Int, obj: Any) {
        container.removeView(obj as View)
    }

}