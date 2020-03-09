package com.mangesh.gitexpo


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.mangesh.gitexpo.Adapter.PublicRepoAdapter
import kotlinx.android.synthetic.main.fragment_repository_list.view.*

/**
 * A simple [Fragment] subclass.
 */
class RepositoryListFragment : Fragment() {

    private lateinit var gitViewModel: GitViewModel

    private var publicRepoAdapter: PublicRepoAdapter?=null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
   val view = inflater.inflate(R.layout.fragment_repository_list, container, false)

         publicRepoAdapter= context?.let { PublicRepoAdapter(it) }

        view.rv_chat.apply {
            adapter=publicRepoAdapter
        }

        gitViewModel= ViewModelProviders.of(this).get(GitViewModel::class.java)

        gitViewModel.publicRepoList.observe(this, Observer {
                list->list?.let {
            publicRepoAdapter?.setData(it) }
        })

        return view
    }


}
