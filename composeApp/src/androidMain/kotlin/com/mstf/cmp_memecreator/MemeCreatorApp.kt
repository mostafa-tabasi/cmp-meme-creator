package com.mstf.cmp_memecreator

import android.app.Application
import com.mstf.cmp_memecreator.di.initKoin
import org.koin.android.ext.koin.androidContext

class MemeCreatorApp : Application() {

    override fun onCreate() {
        super.onCreate()
        initKoin{
            androidContext(this@MemeCreatorApp)
        }
    }
}