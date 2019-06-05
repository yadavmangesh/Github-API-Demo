package com.mangesh.gitexpo.Activities

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.mangesh.gitexpo.Adapter.PublicRepoAdapter
import com.mangesh.gitexpo.GitViewModel
import com.mangesh.gitexpo.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var gitViewModel: GitViewModel

    private  var publicRepoAdapter: PublicRepoAdapter

    init {
        publicRepoAdapter=PublicRepoAdapter(this@MainActivity)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvChat.apply {
            layoutManager=LinearLayoutManager(this@MainActivity)
            adapter=publicRepoAdapter
        }

        gitViewModel=ViewModelProviders.of(this).get(GitViewModel::class.java)

        gitViewModel.publicRepoList.observe(this, Observer {
            list->list?.let {
            publicRepoAdapter.setData(it) }
        })

    }
}
