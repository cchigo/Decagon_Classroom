package com.example.decagonclassroom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import com.example.decagonclassroom.R.id.*
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener {


    lateinit var bottomNavigationView : BottomNavigationView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      bottomNavigationView = findViewById(R.id.bottom_navigation_view)


        supportFragmentManager
            .beginTransaction()
            .replace(R.id.container, home)
            .commit()


      bottomNavigationView.selectedItemId = R.id.navigation_home

       bottomNavigationView.setOnNavigationItemSelectedListener(this)

    }

    var home =  HomeFragment()
    var curriculum = CurriculumFragment()
    var resources = ResourcesFragment()
    var profile = ProfileFragment()


    override fun onNavigationItemSelected(p0: MenuItem): Boolean {

       when (p0.itemId){
           navigation_home ->{
           supportFragmentManager
               .beginTransaction()
               .replace(R.id.container, home).commit()
                return true
           }
           navigation_curriculum ->{
               supportFragmentManager
                   .beginTransaction()
                   .replace(R.id.container, curriculum).commit()
               return true
           }
           navigation_resources ->{
               supportFragmentManager
                   .beginTransaction()
                   .replace(R.id.container, resources).commit()
               return true
           }
           navigation_profile ->{
               supportFragmentManager
                   .beginTransaction()
                   .replace(R.id.container, profile).commit()
               return true
           }
       }

        return true
    }



}
