package com.mangesh.gitexpo.Pojo

import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class  Repo() :Parcelable{

    @SerializedName("id")
    @Expose
     var id: Int? = null
    @SerializedName("node_id")
    @Expose
     var nodeId: String? = null
    @SerializedName("name")
    @Expose
     var name: String? = null
    @SerializedName("full_name")
    @Expose
     var fullName: String? = null
    @SerializedName("owner")
    @Expose
     var owner: Owner? = null
    @SerializedName("private")
    @Expose
     var _private: Boolean? = null
    @SerializedName("html_url")
    @Expose
     var htmlUrl: String? = null
    @SerializedName("description")
    @Expose
     var description: String? = null
    @SerializedName("fork")
    @Expose
     var fork: Boolean? = null
    @SerializedName("url")
    @Expose
     var url: String? = null
    @SerializedName("archive_url")
    @Expose
     var archiveUrl: String? = null
    @SerializedName("assignees_url")
    @Expose
     var assigneesUrl: String? = null
    @SerializedName("blobs_url")
    @Expose
     var blobsUrl: String? = null
    @SerializedName("branches_url")
    @Expose
     var branchesUrl: String? = null
    @SerializedName("collaborators_url")
    @Expose
     var collaboratorsUrl: String? = null
    @SerializedName("comments_url")
    @Expose
     var commentsUrl: String? = null
    @SerializedName("commits_url")
    @Expose
     var commitsUrl: String? = null
    @SerializedName("compare_url")
    @Expose
     var compareUrl: String? = null
    @SerializedName("contents_url")
    @Expose
     var contentsUrl: String? = null
    @SerializedName("contributors_url")
    @Expose
     var contributorsUrl: String? = null
    @SerializedName("deployments_url")
    @Expose
     var deploymentsUrl: String? = null
    @SerializedName("downloads_url")
    @Expose
     var downloadsUrl: String? = null
    @SerializedName("events_url")
    @Expose
     var eventsUrl: String? = null
    @SerializedName("forks_url")
    @Expose
     var forksUrl: String? = null
    @SerializedName("git_commits_url")
    @Expose
     var gitCommitsUrl: String? = null
    @SerializedName("git_refs_url")
    @Expose
     var gitRefsUrl: String? = null
    @SerializedName("git_tags_url")
    @Expose
     var gitTagsUrl: String? = null
    @SerializedName("git_url")
    @Expose
     var gitUrl: String? = null
    @SerializedName("issue_comment_url")
    @Expose
     var issueCommentUrl: String? = null
    @SerializedName("issue_events_url")
    @Expose
     var issueEventsUrl: String? = null
    @SerializedName("issues_url")
    @Expose
     var issuesUrl: String? = null
    @SerializedName("keys_url")
    @Expose
     var keysUrl: String? = null
    @SerializedName("labels_url")
    @Expose
     var labelsUrl: String? = null
    @SerializedName("languages_url")
    @Expose
     var languagesUrl: String? = null
    @SerializedName("merges_url")
    @Expose
     var mergesUrl: String? = null
    @SerializedName("milestones_url")
    @Expose
     var milestonesUrl: String? = null
    @SerializedName("notifications_url")
    @Expose
     var notificationsUrl: String? = null
    @SerializedName("pulls_url")
    @Expose
     var pullsUrl: String? = null
    @SerializedName("releases_url")
    @Expose
     var releasesUrl: String? = null
    @SerializedName("ssh_url")
    @Expose
     var sshUrl: String? = null
    @SerializedName("stargazers_url")
    @Expose
     var stargazersUrl: String? = null
    @SerializedName("statuses_url")
    @Expose
     var statusesUrl: String? = null
    @SerializedName("subscribers_url")
    @Expose
     var subscribersUrl: String? = null
    @SerializedName("subscription_url")
    @Expose
     var subscriptionUrl: String? = null
    @SerializedName("tags_url")
    @Expose
     var tagsUrl: String? = null
    @SerializedName("teams_url")
    @Expose
     var teamsUrl: String? = null
    @SerializedName("trees_url")
    @Expose
     var treesUrl: String? = null

     constructor(parcel: Parcel) : this() {
         id = parcel.readValue(Int::class.java.classLoader) as? Int
         nodeId = parcel.readString()
         name = parcel.readString()
         fullName = parcel.readString()
         _private = parcel.readValue(Boolean::class.java.classLoader) as? Boolean
         htmlUrl = parcel.readString()
         description = parcel.readString()
         fork = parcel.readValue(Boolean::class.java.classLoader) as? Boolean
         url = parcel.readString()
         archiveUrl = parcel.readString()
         assigneesUrl = parcel.readString()
         blobsUrl = parcel.readString()
         branchesUrl = parcel.readString()
         collaboratorsUrl = parcel.readString()
         commentsUrl = parcel.readString()
         commitsUrl = parcel.readString()
         compareUrl = parcel.readString()
         contentsUrl = parcel.readString()
         contributorsUrl = parcel.readString()
         deploymentsUrl = parcel.readString()
         downloadsUrl = parcel.readString()
         eventsUrl = parcel.readString()
         forksUrl = parcel.readString()
         gitCommitsUrl = parcel.readString()
         gitRefsUrl = parcel.readString()
         gitTagsUrl = parcel.readString()
         gitUrl = parcel.readString()
         issueCommentUrl = parcel.readString()
         issueEventsUrl = parcel.readString()
         issuesUrl = parcel.readString()
         keysUrl = parcel.readString()
         labelsUrl = parcel.readString()
         languagesUrl = parcel.readString()
         mergesUrl = parcel.readString()
         milestonesUrl = parcel.readString()
         notificationsUrl = parcel.readString()
         pullsUrl = parcel.readString()
         releasesUrl = parcel.readString()
         sshUrl = parcel.readString()
         stargazersUrl = parcel.readString()
         statusesUrl = parcel.readString()
         subscribersUrl = parcel.readString()
         subscriptionUrl = parcel.readString()
         tagsUrl = parcel.readString()
         teamsUrl = parcel.readString()
         treesUrl = parcel.readString()
     }

     override fun writeToParcel(parcel: Parcel, flags: Int) {
         parcel.writeValue(id)
         parcel.writeString(nodeId)
         parcel.writeString(name)
         parcel.writeString(fullName)
         parcel.writeValue(_private)
         parcel.writeString(htmlUrl)
         parcel.writeString(description)
         parcel.writeValue(fork)
         parcel.writeString(url)
         parcel.writeString(archiveUrl)
         parcel.writeString(assigneesUrl)
         parcel.writeString(blobsUrl)
         parcel.writeString(branchesUrl)
         parcel.writeString(collaboratorsUrl)
         parcel.writeString(commentsUrl)
         parcel.writeString(commitsUrl)
         parcel.writeString(compareUrl)
         parcel.writeString(contentsUrl)
         parcel.writeString(contributorsUrl)
         parcel.writeString(deploymentsUrl)
         parcel.writeString(downloadsUrl)
         parcel.writeString(eventsUrl)
         parcel.writeString(forksUrl)
         parcel.writeString(gitCommitsUrl)
         parcel.writeString(gitRefsUrl)
         parcel.writeString(gitTagsUrl)
         parcel.writeString(gitUrl)
         parcel.writeString(issueCommentUrl)
         parcel.writeString(issueEventsUrl)
         parcel.writeString(issuesUrl)
         parcel.writeString(keysUrl)
         parcel.writeString(labelsUrl)
         parcel.writeString(languagesUrl)
         parcel.writeString(mergesUrl)
         parcel.writeString(milestonesUrl)
         parcel.writeString(notificationsUrl)
         parcel.writeString(pullsUrl)
         parcel.writeString(releasesUrl)
         parcel.writeString(sshUrl)
         parcel.writeString(stargazersUrl)
         parcel.writeString(statusesUrl)
         parcel.writeString(subscribersUrl)
         parcel.writeString(subscriptionUrl)
         parcel.writeString(tagsUrl)
         parcel.writeString(teamsUrl)
         parcel.writeString(treesUrl)
     }

     override fun describeContents(): Int {
         return 0
     }

     companion object CREATOR : Parcelable.Creator<Repo> {
         override fun createFromParcel(parcel: Parcel): Repo {
             return Repo(parcel)
         }

         override fun newArray(size: Int): Array<Repo?> {
             return arrayOfNulls(size)
         }
     }


 }