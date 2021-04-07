package com.example.android2mysharedpreferences

import android.content.Context

internal class UserPreference(context: Context) {
    companion object {
        private const val PREFS_NAME = "USER_PREF"
        private const val NAME = "NAME"
        private const val EMAIL = "EMAIL"
        private const val AGE = "AGE"
        private const val PHONE_NUMBER = "PHONE"
        private const val LOVE_MU = "islove"
    }
}