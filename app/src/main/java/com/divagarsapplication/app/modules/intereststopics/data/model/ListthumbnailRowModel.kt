package com.divagarsapplication.app.modules.intereststopics.`data`.model

import com.divagarsapplication.app.R
import com.divagarsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ListthumbnailRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtEasytoUse: String? = MyApp.getInstance().resources.getString(R.string.lbl_art)

)
