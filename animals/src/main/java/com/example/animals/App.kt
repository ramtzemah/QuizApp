package com.example.animals

import com.example.common.App_Parent

class App: App_Parent() {

    protected override fun getAdMobBannerID(): String? {
        return BuildConfig.AD_MOB_BANNER_ID
    }
}