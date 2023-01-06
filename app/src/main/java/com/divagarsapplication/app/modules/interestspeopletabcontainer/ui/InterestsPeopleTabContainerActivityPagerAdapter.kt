package com.divagarsapplication.app.modules.interestspeopletabcontainer.ui

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.divagarsapplication.app.R
import com.divagarsapplication.app.appcomponents.di.MyApp
import com.divagarsapplication.app.modules.intereststopics.ui.InterestsTopicsFragment
import kotlin.Int
import kotlin.String
import kotlin.collections.List

class InterestsPeopleTabContainerActivityPagerAdapter(
    val fragmentManager: FragmentManager,
    val lifecycle: Lifecycle
) : FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int = viewPages.size

    override fun createFragment(position: Int): Fragment = viewPages[position]

    /**
     * TODO add missing fragment in viewPages
     */
    companion object AdapterConstant {
        val title: List<String> =
                listOf(MyApp.getInstance().resources.getString(R.string.lbl_topics),MyApp.getInstance().resources.getString(R.string.lbl_people),MyApp.getInstance().resources.getString(R.string.lbl_publication))

        val viewPages: List<Fragment> = listOf(InterestsTopicsFragment(),InterestsTopicsFragment())

    }
}
