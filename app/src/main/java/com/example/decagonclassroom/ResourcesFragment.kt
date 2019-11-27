package com.example.decagonclassroom


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.ViewPager
import com.example.decagonclassroom.ResourcesFragments.ArticlesFragment
import com.example.decagonclassroom.ResourcesFragments.BooksFragment
import com.example.decagonclassroom.ResourcesFragments.PagerAdapter
import com.example.decagonclassroom.ResourcesFragments.VideosFragment
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.fragment_resources.*

/**
 * A simple [Fragment] subclass.
 */
class ResourcesFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_resources, container, false)
        val viewPager = view.findViewById<ViewPager>(R.id.resources_viewPager)
        val tabLayout = view.findViewById<TabLayout>(R.id.resources_tablayout)
        viewPager.adapter = PagerAdapter(fragmentManager!!, tabLayout.tabCount)
        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabReselected(p0: TabLayout.Tab?) {

            }

            override fun onTabUnselected(p0: TabLayout.Tab?) {

            }
            override fun onTabSelected(p0: TabLayout.Tab?) {
                viewPager.currentItem = p0!!.position
//                when(p0!!.position){
//                    0 -> article_tab_item.isSelected = true
//                    1 ->
//                }
            }

        })
        viewPager.addOnPageChangeListener(
            TabLayout.TabLayoutOnPageChangeListener(
                tabLayout
            )
        )
        return view
    }

}
