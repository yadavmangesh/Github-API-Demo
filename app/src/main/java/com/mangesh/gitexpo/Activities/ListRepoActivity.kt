package com.mangesh.gitexpo.Activities

import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcelable
import androidx.recyclerview.widget.LinearLayoutManager
import com.mangesh.gitexpo.Adapter.PublicRepoAdapter
import com.mangesh.gitexpo.GitViewModel
import com.mangesh.gitexpo.Pojo.Contributor
import com.mangesh.gitexpo.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_list_repo.*

class ListRepoActivity : AppCompatActivity() {

    private  var publicRepoAdapter: PublicRepoAdapter

    private lateinit var gitViewModel: GitViewModel


    init {
        publicRepoAdapter= PublicRepoAdapter(this@ListRepoActivity)
    }

    private var contributor: Contributor? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_repo)

        contributor=intent.getParcelableExtra("listRepo")

        RepoOwnerName.text=contributor?.login

        Picasso.get().load(contributor?.avatarUrl).into(RepoOwnerImage)

        RepoOwnerName.text

        rvRepo.apply {
            layoutManager= androidx.recyclerview.widget.LinearLayoutManager(this@ListRepoActivity)
            adapter=publicRepoAdapter

        }

        gitViewModel= ViewModelProviders.of(this).get(GitViewModel::class.java)

        gitViewModel.getRepoList(contributor?.login)

        gitViewModel.repoList.observe(this, Observer {
                list->list?.let {
            publicRepoAdapter.setData(it) }
        })
    }
}
