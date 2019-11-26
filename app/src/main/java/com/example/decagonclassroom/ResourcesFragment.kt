package com.example.decagonclassroom


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toolbar
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabItem
import com.google.android.material.tabs.TabLayout

/**
 * A simple [Fragment] subclass.
 */
class ResourcesFragment : Fragment() {

    lateinit var tabLayout: TabLayout
    lateinit var viewPager: ViewPager
    lateinit var pageAdapter: ResourcesAdapter
    lateinit var tabArticles: TabItem
    lateinit var tabBooks: TabItem
    lateinit var tabVideos: TabItem

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        var view = inflater.inflate(R.layout.fragment_resources, container, false)

        tabLayout = view.findViewById(R.id.resources)
        tabArticles = view.findViewById(R.id.articles_tab)
        tabBooks = view.findViewById(R.id.books_tab)
        tabVideos = view.findViewById(R.id.videos_tab)
        viewPager = view.findViewById(R.id.viewPager)

        pageAdapter = ResourcesAdapter(fragmentManager!!, tabLayout.tabCount)
        viewPager.adapter = pageAdapter


    return view
    }


}
