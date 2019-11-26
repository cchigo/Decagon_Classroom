package com.example.decagonclassroom

import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.NonNull
import androidx.recyclerview.widget.RecyclerView
import com.example.decagonclassroom.R.id.article_date
import kotlinx.android.synthetic.main.activity_verification.view.*
import kotlinx.android.synthetic.main.list_row.view.*
import java.util.*

class ArticlesAdapter (val articles: List<Articles>):
    RecyclerView.Adapter<ArticlesAdapter.ArticleViewHolder>(){

    class ArticleViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        lateinit var articleImage: ImageView
        lateinit var articleDate: TextView
        lateinit var articleTitle: TextView
        lateinit var articleAuthor: TextView

        init {
            articleImage = view.findViewById(R.id.article_image_id)
            articleDate = view.findViewById(R.id.article_date)
            articleTitle =view.findViewById(R.id.article_title)
            articleAuthor = view.findViewById(R.id.article_author)
        }

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticleViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_row, parent, false)

        return ArticleViewHolder(view)
         //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItemCount(): Int {
        return articles.size
        //To change body of created functions use File | Settings | File Templates.
    }

    override fun onBindViewHolder(@NonNull holder: ArticleViewHolder, position: Int) {
        val article = articles[position]

        holder.articleDate.text = article.date
        holder.articleTitle.text = article.articleTitle
        holder.articleAuthor.text = article.author



        //To change body of created functions use File | Settings | File Templates.
    }

}


