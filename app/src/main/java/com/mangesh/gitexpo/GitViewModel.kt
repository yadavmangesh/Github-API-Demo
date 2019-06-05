package com.mangesh.gitexpo

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import android.arch.lifecycle.MutableLiveData
import com.mangesh.gitexpo.Pojo.Contributor
import com.mangesh.gitexpo.Pojo.Repo

class GitViewModel(application: Application) :AndroidViewModel(application) {

    val publicRepoList:MutableLiveData<MutableList<Repo>>

    var contributorList:MutableLiveData<MutableList<Contributor>> = MutableLiveData()

    var repoList:MutableLiveData<MutableList<Repo>> = MutableLiveData()

    private val repository:Repository = Repository()


    init {
        publicRepoList=repository.getListofPublicRepos()
    }

    fun getContributorsList(ownerName:String?,repoName:String?){
       contributorList = repository.getContributorList(ownerName,repoName)
    }

    fun getRepoList(ownerName: String?){
        repoList=repository.getRepoList(ownerName)
    }

}