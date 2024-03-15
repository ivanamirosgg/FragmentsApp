package com.example.fragmentsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.fragmentsapp.fragments.Blank1Fragment
import com.example.fragmentsapp.fragments.Blank2Fragment
import com.example.fragmentsapp.fragments.CategoryFragment
import com.example.fragmentsapp.fragments.HomeFragment
import com.google.android.material.bottomappbar.BottomAppBar
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var bottomNav : BottomNavigationView
    private var MainActivityTag = "MENU_ITEM"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bottomNav = findViewById(R.id.bottom_nav_menu)
        val HomeFragment = HomeFragment()
        supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer, HomeFragment).commit()

//        Menu/bottomNavmenu
        bottomNav.setOnItemSelectedListener { menuItem ->
            when(menuItem.itemId){
                R.id.home_menu ->{
                    Log.i(MainActivityTag, "HOME")
                    val HomeFragment = HomeFragment()
                    supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer, HomeFragment).commit()
                }
                R.id.category_menu -> {
                    Log.i(MainActivityTag, "CATEGORY")
                    val CategoryFragment = CategoryFragment()
                    supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer, CategoryFragment).commit()
                }
                R.id.blank1 -> {
                    Log.i(MainActivityTag, "CATEGORY")
                    val Blank1Fragment = Blank1Fragment()
                    supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer, Blank1Fragment).commit()
                }
                R.id.blank2 -> {
                    Log.i(MainActivityTag, "CATEGORY")
                    val Blank2Fragment = Blank2Fragment()
                    supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer, Blank2Fragment).commit()
                }
            }
            true
        }
    }
}