package com.mangesh.gitexpo

import com.mangesh.gitexpo.Pojo.Contributor
import com.mangesh.gitexpo.Pojo.Repo
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface Api {

    @GET("/repositories")
    fun getPublicRepositories():Call<MutableList<Repo>>

    @GET("/repos/{ownerName}/{repoName}/contributors")
    fun getListofContributors(@Path("ownerName") ownerName:String?, @Path("repoName") repoName:String?):Call<MutableList<Contributor>>

    @GET("/users/{ownerName}/repos")
    fun getRepoList(@Path("ownerName") ownerName: String?):Call<MutableList<Repo>>
}