package com.example.decagonclassroom


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

/**
 * A simple [Fragment] subclass.
 */
class HomeFragment : Fragment() {
//
    lateinit var recylerView: RecyclerView
    lateinit var articles : ArrayList<Articles>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view =  inflater.inflate(R.layout.fragment_home, container, false)

        articles = ArrayList()
        articles.add(Articles(R.drawable.avater, "23/4/1998", "this is a title", "someone"))
        articles.add(Articles(R.drawable.avater, "23/4/1998", "this is a title", "someone"))
        articles.add(Articles(R.drawable.avater, "23/4/1998", "this is a title", "someone"))
        articles.add(Articles(R.drawable.avater, "23/4/1998", "this is a title", "someone"))
        articles.add(Articles(R.drawable.avater, "23/4/1998", "this is a title", "someone"))
        articles.add(Articles(R.drawable.avater, "23/4/1998", "this is a title", "someone"))


        recylerView = view.findViewById(R.id.article_recycler_view)
        recylerView.adapter = ArticlesAdapter(articles)
        recylerView.layoutManager = LinearLayoutManager(this.context)

        return view
    }






}
