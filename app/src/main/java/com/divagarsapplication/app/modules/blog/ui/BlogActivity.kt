package com.divagarsapplication.app.modules.blog.ui

import androidx.activity.viewModels
import com.divagarsapplication.app.R
import com.divagarsapplication.app.appcomponents.base.BaseActivity
import com.divagarsapplication.app.databinding.ActivityBlogBinding
import com.divagarsapplication.app.modules.blog.`data`.viewmodel.BlogVM
import kotlin.String
import kotlin.Unit

class BlogActivity : BaseActivity<ActivityBlogBinding>(R.layout.activity_blog) {
  private val viewModel: BlogVM by viewModels<BlogVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.blogVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "BLOG_ACTIVITY"

  }
}
