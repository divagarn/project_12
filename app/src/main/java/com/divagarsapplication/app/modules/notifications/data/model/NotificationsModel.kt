package com.divagarsapplication.app.modules.notifications.`data`.model

import com.divagarsapplication.app.R
import com.divagarsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class NotificationsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtActivity: String? = MyApp.getInstance().resources.getString(R.string.lbl_activity)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_bezaleel_nwabia)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_catalunha_mj_re)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTisanthanpanchsadram: String? =
      MyApp.getInstance().resources.getString(R.string.msg_tisanthan_panch)

)
