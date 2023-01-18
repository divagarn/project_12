package com.divagarsapplication.app.modules.interestspeopletabcontainer.`data`.model

import com.divagarsapplication.app.R
import com.divagarsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class InterestsPeopleTabContainerModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCategoryOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_interests)

)
