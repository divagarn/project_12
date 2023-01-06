package com.divagarsapplication.app.modules.home.ui

import android.os.Handler
import android.os.Looper
import android.view.View
import androidx.activity.viewModels
import androidx.core.view.GravityCompat
import com.divagarsapplication.app.R
import com.divagarsapplication.app.appcomponents.base.BaseActivity
import com.divagarsapplication.app.databinding.ActivityHomeBinding
import com.divagarsapplication.app.modules.home.`data`.model.HomeRowModel
import com.divagarsapplication.app.modules.home.`data`.viewmodel.HomeVM
import com.divagarsapplication.app.modules.signup.ui.SignUpActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class HomeActivity : BaseActivity<ActivityHomeBinding>(R.layout.activity_home) {
  private val viewModel: HomeVM by viewModels<HomeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val homeAdapter = HomeAdapter(viewModel.homeList.value?:mutableListOf())
    binding.recyclerHome.adapter = homeAdapter
    homeAdapter.setOnItemClickListener(
    object : HomeAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : HomeRowModel) {
        onClickRecyclerHome(view, position, item)
      }
    }
    )
    viewModel.homeList.observe(this) {
      homeAdapter.updateData(it)
    }
    binding.homeVM = viewModel
    Handler(Looper.getMainLooper()).postDelayed( {
      val destIntent = SignUpActivity.getIntent(this, null)
      startActivity(destIntent)
      }, 3000)
    }

    override fun setUpClicks(): Unit {
      binding.imageMenu.setOnClickListener {
        	toggleDrawer()
      }
    }

    private fun toggleDrawer(): Unit {
      if (!binding.drawerLayout.isDrawerOpen(GravityCompat.START)) {
        binding.drawerLayout.openDrawer(GravityCompat.START)
      }
      else {
        binding.drawerLayout.closeDrawer(GravityCompat.START)
      }
    }

    fun onClickRecyclerHome(
      view: View,
      position: Int,
      item: HomeRowModel
    ): Unit {
      when(view.id) {
      }
    }

    companion object {
      const val TAG: String = "HOME_ACTIVITY"

    }
  }
