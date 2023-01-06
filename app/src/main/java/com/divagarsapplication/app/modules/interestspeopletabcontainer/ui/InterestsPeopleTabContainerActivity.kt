package com.divagarsapplication.app.modules.interestspeopletabcontainer.ui

import androidx.activity.viewModels
import com.divagarsapplication.app.R
import com.divagarsapplication.app.appcomponents.base.BaseActivity
import com.divagarsapplication.app.databinding.ActivityInterestsPeopleTabContainerBinding
import com.divagarsapplication.app.modules.interestspeopletabcontainer.`data`.viewmodel.InterestsPeopleTabContainerVM
import com.google.android.material.tabs.TabLayoutMediator
import kotlin.String
import kotlin.Unit

class InterestsPeopleTabContainerActivity :
    BaseActivity<ActivityInterestsPeopleTabContainerBinding>(R.layout.activity_interests_people_tab_container)
    {
  private val viewModel: InterestsPeopleTabContainerVM by
      viewModels<InterestsPeopleTabContainerVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.interestsPeopleTabContainerVM = viewModel
    val adapter =
    InterestsPeopleTabContainerActivityPagerAdapter(supportFragmentManager,lifecycle)
    binding.viewPagerTabbarview.adapter = adapter
    TabLayoutMediator(binding.tabLayoutGroup2993,binding.viewPagerTabbarview) { tab, position ->
      tab.text = InterestsPeopleTabContainerActivityPagerAdapter.title[position]
      }.attach()
    }

    override fun setUpClicks(): Unit {
    }

    companion object {
      const val TAG: String = "INTERESTS_PEOPLE_TAB_CONTAINER_ACTIVITY"

    }
  }
