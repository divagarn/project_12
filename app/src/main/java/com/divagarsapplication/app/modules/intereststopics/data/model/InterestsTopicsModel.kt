package com.divagarsapplication.app.modules.intereststopics.`data`.model

import com.divagarsapplication.app.R
import com.divagarsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class InterestsTopicsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtArtEntertainment: String? =
      MyApp.getInstance().resources.getString(R.string.msg_arts_entertai)

)
