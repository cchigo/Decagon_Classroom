package com.example.decagonclassroom


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.ViewPager
import com.example.decagonclassroom.BooksViewPager.BookModel
import com.example.decagonclassroom.BooksViewPager.BooksAdapter

/**
 * A simple [Fragment] subclass.
 */
class HomeFragment : Fragment() {
//
    lateinit var recylerView: RecyclerView
    lateinit var articles : ArrayList<Articles>


    lateinit var viewPager : ViewPager
    lateinit var adapter: BooksAdapter
    lateinit var models: ArrayList<BookModel>

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


        models = ArrayList()
        models.add(BookModel(R.drawable.nodejs, "Node.js Web", "David Herron"))
        models.add(BookModel(R.drawable.eloquent_javascript, "Eloquent Javascript", "Marijn Haverbek"))
        models.add(BookModel(R.drawable.universal_app, "Universal App", "Eric Elliott"))

        adapter = BooksAdapter(models, context!!)

        viewPager = view.findViewById(R.id.viewPager)
        viewPager.setAdapter(adapter)
        viewPager.setPadding(130, 0, 130, 0)


        viewPager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener{
            override fun onPageScrollStateChanged(state: Int) {
                //To change body of created functions use File | Settings | File Templates.
            }
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
                //To change body of created functions use File | Settings | File Templates.


            }
            override fun onPageSelected(position: Int) {//To change body of created functions use File | Settings | File Templates.
            }
        })




        return view
    }



}
