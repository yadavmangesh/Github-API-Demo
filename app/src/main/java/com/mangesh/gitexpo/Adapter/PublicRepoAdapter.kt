package com.mangesh.gitexpo.Adapter

import android.content.Context
import android.content.Intent
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mangesh.gitexpo.Activities.OwnerActivity
import com.mangesh.gitexpo.R
import com.mangesh.gitexpo.Pojo.Repo
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.repo_item.view.*

class PublicRepoAdapter(val context: Context): androidx.recyclerview.widget.RecyclerView.Adapter<PublicRepoAdapter.MyViewHolder>() {

    var publicRepoList:MutableList<Repo> = arrayListOf()

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): MyViewHolder {

        return MyViewHolder(LayoutInflater.from(p0.context).inflate(R.layout.repo_item,p0,false))
    }

    override fun getItemCount(): Int {
      return publicRepoList.size
    }

    override fun onBindViewHolder(p0: MyViewHolder, p1: Int) {
       val repo= publicRepoList[p1]

        p0.itemView.tvOwnerName.text=repo.name
        p0.itemView.tvRepoName.text= repo.fullName
        Picasso.get().load(repo.owner?.avatarUrl).into(p0.itemView.ivOwnerImage)

        p0.itemView.setOnClickListener {
                 val intent=Intent(context,OwnerActivity::class.java).apply {
                     putExtra("repo",repo)
                     putExtra("url",repo.owner?.avatarUrl)

                 }
            context.startActivity(intent)
        }
    }

    fun setData(list: MutableList<Repo>){
        publicRepoList=list
        notifyDataSetChanged()
    }

    class MyViewHolder(itemView: View) : androidx.recyclerview.widget.RecyclerView.ViewHolder(itemView)
}