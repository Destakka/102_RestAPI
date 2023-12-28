package com.example.pam_act8

import android.app.Application
import com.example.pam_act8.repository.AppContainer
import com.example.pam_act8.repository.KontakContainer

class KontakAplikation: Application() {
    lateinit var container: AppContainer

    override fun onCreate(){
        super.onCreate()
        container = KontakContainer()
    }
}