package com.mangesh.gitexpo

import androidx.lifecycle.MutableLiveData
import android.util.Log
import com.mangesh.gitexpo.Pojo.Contributor
import com.mangesh.gitexpo.Pojo.Owner
import com.mangesh.gitexpo.Pojo.Repo
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class Repository {

    private  var api:Api?

    private var liveDataPublicRepoList:MutableLiveData<MutableList<Repo>> = MutableLiveData()

    private var liveContributorList:MutableLiveData<MutableList<Contributor>> = MutableLiveData()

    private var liveRepoList:MutableLiveData<MutableList<Repo>> = MutableLiveData()

    init {
        api= RetroClient.getClient()
    }

    fun getListofPublicRepos(LIMIT:Int):MutableLiveData<MutableList<Repo>>{

        api?.getPublicRepositories(LIMIT)?.enqueue(object :retrofit2.Callback<MutableList<Repo>>{
            override fun onFailure(call: Call<MutableList<Repo>>, t: Throwable) {
               Log.d("Repository ","getPublicRepositories onFailure")
            }

            override fun onResponse(call: Call<MutableList<Repo>>, response: Response<MutableList<Repo>>) {
                liveDataPublicRepoList.value = response.body()
            }

        })

        return liveDataPublicRepoList
    }

    fun getContributorList(ownerName:String?,repoName:String?):MutableLiveData<MutableList<Contributor>>{

        api?.getListofContributors(ownerName,repoName)?.enqueue(object :retrofit2.Callback<MutableList<Contributor>>{
            override fun onFailure(call: Call<MutableList<Contributor>>, t: Throwable) {

                Log.d("Repository ","getListofContributors onFailure")
            }

            override fun onResponse(call: Call<MutableList<Contributor>>, response: Response<MutableList<Contributor>>) {

               liveContributorList.value=response.body()
                Log.d("Repository ","getListofContributors onResponse")
            }

        })

        return liveContributorList
    }

    fun getRepoList(ownerName: String?):MutableLiveData<MutableList<Repo>>{

        api?.getRepoList(ownerName)?.enqueue(object :retrofit2.Callback<MutableList<Repo>>{
            override fun onFailure(call: Call<MutableList<Repo>>, t: Throwable) {
                Log.d("Repository ","getRepoList onFailure")
            }

            override fun onResponse(call: Call<MutableList<Repo>>, response: Response<MutableList<Repo>>) {

                 liveRepoList.value=response.body()

            }

        })

        return liveRepoList
    }
}