package com.mangesh.gitexpo.Adapter

import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mangesh.gitexpo.Activities.ListRepoActivity
import com.mangesh.gitexpo.Activities.OwnerActivity
import com.mangesh.gitexpo.Pojo.Contributor
import com.mangesh.gitexpo.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.contributor_item.view.*

class ContributorAdapter(val context: Context) : RecyclerView.Adapter<ContributorAdapter.ContributorViewHolder>() {

    private var contributorList:MutableList<Contributor> = mutableListOf()

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ContributorViewHolder {

        return ContributorViewHolder(LayoutInflater.from(p0.context).inflate(R.layout.contributor_item,p0,false))
    }

    override fun getItemCount(): Int {
        return contributorList.size
    }

    override fun onBindViewHolder(p0: ContributorViewHolder, p1: Int) {

        val contributor= contributorList[p1]

        p0.itemView.tvContributorName.text=contributor.login
        Picasso.get().load(contributor.avatarUrl).into(p0.itemView.ivContributor)

        p0.itemView.setOnClickListener {
            val intent=Intent(context,ListRepoActivity::class.java)
            intent.apply {
                putExtra("listRepo",contributor)
            }

            context.startActivity(intent)
        }
    }

    fun setData(list: MutableList<Contributor>){
        contributorList=list
        notifyDataSetChanged()
    }

    class ContributorViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}