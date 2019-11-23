package com.example.decagonclassroom


import android.animation.ArgbEvaluator
import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.ViewPager
import androidx.viewpager.widget.ViewPager.OnPageChangeListener

/**
 * A simple [Fragment] subclass.
 */
class HomeFragment : Fragment() {

   lateinit var viewPager : ViewPager
   lateinit var adapter: BooksAdapter
    lateinit var models: ArrayList<BookModel>
   var argbEvaluator: ArgbEvaluator = ArgbEvaluator()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view = inflater.inflate(R.layout.fragment_home, container, false)
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

            override fun onPageSelected(position: Int) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }
        })


        return view
    }


}
