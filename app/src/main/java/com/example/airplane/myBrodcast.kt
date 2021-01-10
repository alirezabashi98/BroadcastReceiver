package com.example.airplane

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.provider.Settings
import android.widget.Toast

class myBrodcast(val data: setData) : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        Toast.makeText(
            context,
            if (isAirplaneModeOn(context!!.applicationContext)) "حالت هواپیما فعال شد" else "حالت هواپیما غیرفعال شد",
            Toast.LENGTH_LONG
        ).show()
        data.onAirplaneMode(if (isAirplaneModeOn(context.applicationContext)) "حالت هواپیما فعال شد" else "حالت هواپیما غیرفعال شد")
    }

    private fun isAirplaneModeOn(context: Context): Boolean {
        return Settings.System.getInt(
            context.getContentResolver(),
            Settings.Global.AIRPLANE_MODE_ON,
            0
        ) !== 0
    }

    interface setData {

        fun onAirplaneMode(txt: String)

    }
}