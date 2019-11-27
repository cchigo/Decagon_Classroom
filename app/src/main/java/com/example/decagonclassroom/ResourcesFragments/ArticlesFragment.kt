package com.example.decagonclassroom.ResourcesFragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.decagonclassroom.Articles
import com.example.decagonclassroom.ArticlesAdapter

import com.example.decagonclassroom.R
import kotlinx.android.synthetic.main.fragment_articles.*

/**
 * A simple [Fragment] subclass.
 */
class ArticlesFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_articles, container, false)

        var recyclerView = view.findViewById<RecyclerView>(R.id.article_recycler_view_add_fragment)
        var articles = ArrayList<Articles>()
        articles.add(Articles(R.drawable.avater, "23/4/1998", "this is a title", "someone"))
        articles.add(Articles(R.drawable.avater, "23/4/1998", "this is a title", "someone"))
        articles.add(Articles(R.drawable.avater, "23/4/1998", "this is a title", "someone"))
        articles.add(Articles(R.drawable.avater, "23/4/1998", "this is a title", "someone"))
        articles.add(Articles(R.drawable.avater, "23/4/1998", "this is a title", "someone"))
        articles.add(Articles(R.drawable.avater, "23/4/1998", "this is a title", "someone"))

        recyclerView.adapter = ArticlesAdapter(articles)
        recyclerView.layoutManager = LinearLayoutManager(this.context)

        return view
    }


}
