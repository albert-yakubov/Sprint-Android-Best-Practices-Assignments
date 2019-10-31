package com.stepasha.neewsfeedinjector.ui

import androidx.annotation.StringRes
import com.stepasha.neewsfeedinjector.BaseView
import com.stepasha.neewsfeedinjector.model.Post
import java.security.AccessController.getContext

/**
 * Interface providing required method for a view displaying posts
 */
interface PostView : BaseView {
    /**
     * Updates the previous posts by the specified ones
     * @param posts the list of posts that will replace existing ones
     */
    fun updatePosts(posts: List<Post>)

    /**
     * Displays an error in the view
     * @param error the error to display in the view
     */
    fun showError(error: String)

    /**
     * Displays an error in the view
     * @param errorResId the resource id of the error to display in the view
     */
    fun showError(@StringRes errorResId: Int){
        this.showError(getContext().getString(errorResId))
    }

    /**
     * Displays the loading indicator of the view
     */
    fun showLoading()

    /**
     * Hides the loading indicator of the view
     */
    fun hideLoading()
}