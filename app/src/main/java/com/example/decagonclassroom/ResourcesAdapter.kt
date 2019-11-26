package com.example.decagonclassroom

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class ResourcesAdapter(var fm: FragmentManager, var numOfTabs: Int) : FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        var fragment: Fragment = when (position) {
            0 ->{
                 ArticlesFragment()
            }
            1 ->{
                 VideosFragment()
            }
            2 ->{
                BooksFragment()
            }
            else -> {
                Fragment()
            }
        }
        return fragment
         //To change body of created functions use File | Settings | File Templates.
    }

    override fun getCount(): Int {
        return numOfTabs
        //To change body of created functions use File | Settings | File Templates.
    }
}