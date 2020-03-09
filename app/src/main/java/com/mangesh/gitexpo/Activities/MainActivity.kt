package com.mangesh.gitexpo.Activities

import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.mangesh.gitexpo.Adapter.PublicRepoAdapter
import com.mangesh.gitexpo.GitViewModel
import com.mangesh.gitexpo.R
import kotlinx.android.synthetic.main.activity_main.*
import androidx.fragment.app.Fragment
import com.mangesh.gitexpo.BlankFragment
import com.mangesh.gitexpo.RepositoryListFragment


class MainActivity : AppCompatActivity(),BottomNavigationView.OnNavigationItemSelectedListener {

   private var fragment:Fragment=RepositoryListFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        loadFragment(fragment)
        bottom_navigation_view.setOnNavigationItemSelectedListener(this)

    }
    override fun onNavigationItemSelected(item: MenuItem): Boolean {

        when(item.itemId){

            R.id.item_home->{
                fragment=RepositoryListFragment()
            }
            else->{
                fragment=BlankFragment()
            }
        }

        return loadFragment(fragment)
    }

    private fun loadFragment(fragment: Fragment?): Boolean {
        if (fragment != null) {
            supportFragmentManager.beginTransaction().replace(R.id.frame_layout, fragment!!).commit()
            return true
        }
        return false
    }

}
