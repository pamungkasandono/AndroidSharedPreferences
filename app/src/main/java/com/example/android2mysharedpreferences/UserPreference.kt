package com.example.android2mysharedpreferences

import android.annotation.SuppressLint
import android.content.Context

internal class UserPreference(context: Context) {
    companion object {
        private const val PREFS_NAME = "user_pref"
        private const val NAME = "name"
        private const val EMAIL = "email"
        private const val AGE = "age"
        private const val PHONE_NUMBER = "phone"
        private const val LOVE_MU = "islove"
    }

    private val preference = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)

    @SuppressLint("CommitPrefEdits")
    fun setUser(value: UserModel) {
        preference.edit().apply {
            putString(NAME, value.name)
            putString(EMAIL, value.email)
            putInt(AGE, value.age)
            putString(PHONE_NUMBER, value.phoneNumber)
            putBoolean(LOVE_MU, value.isLove)
            this.apply()
        }
    }

    fun getUser(): UserModel {
        return UserModel().apply {
            name = preference.getString(NAME, "")
            email = preference.getString(EMAIL, "")
            age = preference.getInt(AGE, 0)
            phoneNumber = preference.getString(PHONE_NUMBER, "")
            isLove = preference.getBoolean(LOVE_MU, false)
        }
    }
}