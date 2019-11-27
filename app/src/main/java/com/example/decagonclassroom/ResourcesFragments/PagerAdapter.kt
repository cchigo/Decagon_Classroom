package com.example.decagonclassroom.ResourcesFragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class PagerAdapter(fragmentManager: FragmentManager, var tabCount : Int): FragmentPagerAdapter(fragmentManager) {
    override fun getItem(position: Int): Fragment {
        val fragment = when (position) {
            0 -> ArticlesFragment()
            1 -> BooksFragment()
            2 -> VideosFragment()
            else -> null
        }
        return fragment!!
    }

    override fun getCount(): Int {
        return tabCount
    }
}