package com.mangesh.gitexpo.Activities

import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.mangesh.gitexpo.Adapter.ContributorAdapter
import com.mangesh.gitexpo.GitViewModel
import com.mangesh.gitexpo.R
import com.mangesh.gitexpo.Pojo.Repo
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_owner.*
import java.lang.Exception

class OwnerActivity : AppCompatActivity() {

    private lateinit var repo: Repo

    private lateinit var gitViewModel:GitViewModel

    private var contributorAdapter:ContributorAdapter


    init {
      contributorAdapter= ContributorAdapter(this@OwnerActivity)
    }


    private var flag: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_owner)

        repo=intent.getParcelableExtra("repo")

        gitViewModel=ViewModelProviders.of(this).get(GitViewModel::class.java)

        rvContributors.apply {
            layoutManager= androidx.recyclerview.widget.GridLayoutManager(this@OwnerActivity, 3)
            adapter=contributorAdapter
        }

        try {
            gitViewModel.getContributorsList(repo.fullName?.substring(0, repo.fullName?.lastIndexOf("/")!!),repo.name )
        }
        catch (e:Exception){
            e.printStackTrace()
        }

        gitViewModel.contributorList.observe(this, Observer {
            list->list?.let {
            contributorAdapter.setData(it) }
        })

        Picasso.get().load(intent.getStringExtra("url")).into(OwnerImage)
        RepoName.text=repo.fullName
        tvDescription.text=repo.description
        OwnerName.text=repo.name

    }
}
