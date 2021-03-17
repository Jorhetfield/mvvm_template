package es.jrhtfld.mvvm_template.setup.client

import android.content.SharedPreferences

class Prefs(private val sharedPrefs: SharedPreferences) {

    //region Vars
    companion object {
        const val IS_FIRST_TIME = "IS_FIRST_TIME"
        const val TOKEN = "TOKEN"
        const val FCM_TOKEN = "FCM_TOKEN"
        const val USER = "USER"
        const val FAMILY_MEMBER_LIST = "FAMILY_MEMBER_LIST"
        const val FAMILY_ID = "FAMILYID"
        const val FAMILY_CODE = "FAMILYCODE"
        const val IS_PREMIUM = "ISPREMIUM"
        const val USER_ID = "USER_ID"
        const val OTHER_USER_ID = "OTHER_USER_ID"
        const val USER_EMAIL = "USER_EMAIL"
        const val USER_NAME = "USER_NAME"
        const val STATE = "STATE"
        const val FILTER = "FILTER"
        const val USER_TYPE = "USER_TYPE"
        const val SERVICES_APPLIED = "SERVICES_APPLIED"
        const val IS_REGISTER_COMPLETED = "IS_REGISTER_COMPLETED"
        const val IS_OLDER = "IS_OLDER"
        const val IS_FAMILY_CREATOR = "IS_FAMILY_CREATOR"
        const val IS_COMING_FROM_LOGIN = "IS_COMING_FROM_LOGIN"
        const val CREATE_EVENT = "CREATE_EVENT"
        const val CREATE_TASK = "CREATE_TASK"
        const val EVENT_TODAY_LIST = "EVENT_TODAY_LIST"
        const val TASK_TODAY_LIST = "TASK_TODAY_LIST"
        const val IS_EVENT_SELECTED = "IS_EVENT_SELECTED"
    }

    //endregion

    //region UserPrefs
    var isFirstTime: Boolean
        get() = sharedPrefs.getBoolean(IS_FIRST_TIME, true)
        set(value) = sharedPrefs.edit().putBoolean(IS_FIRST_TIME, value).apply()

    var isRegisterCompleted: Boolean
        get() = sharedPrefs.getBoolean(IS_REGISTER_COMPLETED, false)
        set(value) = sharedPrefs.edit().putBoolean(IS_REGISTER_COMPLETED, value).apply()

    var token: String?
        get() = sharedPrefs.getString(TOKEN, "")
        set(value) = sharedPrefs.edit().putString(TOKEN, value).apply()

    var familyMemberList: String?
        get() = sharedPrefs.getString(FAMILY_MEMBER_LIST, "")
        set(value) = sharedPrefs.edit().putString(FAMILY_MEMBER_LIST, value).apply()

    var familyId: String?
        get() = sharedPrefs.getString(FAMILY_ID, null)
        set(value) = sharedPrefs.edit().putString(FAMILY_ID, value).apply()

    var otherUserId: String?
        get() = sharedPrefs.getString(OTHER_USER_ID, "")
        set(value) = sharedPrefs.edit().putString(OTHER_USER_ID, value).apply()

    var familyCode: String?
        get() = sharedPrefs.getString(FAMILY_CODE, "")
        set(value) = sharedPrefs.edit().putString(FAMILY_CODE, value).apply()

    var isPremium: Boolean
        get() = sharedPrefs.getBoolean(IS_PREMIUM, false)
        set(value) = sharedPrefs.edit().putBoolean(IS_PREMIUM, value).apply()

    var userId: String?
        get() = sharedPrefs.getString(USER_ID, null)
        set(value) = sharedPrefs.edit().putString(USER_ID, value).apply()

    var user: String?
        get() = sharedPrefs.getString(USER, null)
        set(value) = sharedPrefs.edit().putString(USER, value).apply()

    var userEmail: String?
        get() = sharedPrefs.getString(USER_EMAIL, "")
        set(value) = sharedPrefs.edit().putString(USER_EMAIL, value).apply()

    var userName: String?
        get() = sharedPrefs.getString(USER_NAME, "")
        set(value) = sharedPrefs.edit().putString(USER_NAME, value).apply()

    var state: String?
        get() = sharedPrefs.getString(STATE, "available")
        set(value) = sharedPrefs.edit().putString(STATE, value).apply()

    var isOlder: Boolean
        get() = sharedPrefs.getBoolean(IS_OLDER, true)
        set(value) = sharedPrefs.edit().putBoolean(IS_OLDER, value).apply()

    var isFamilyCreator: Boolean
        get() = sharedPrefs.getBoolean(IS_FAMILY_CREATOR, false)
        set(value) = sharedPrefs.edit().putBoolean(IS_FAMILY_CREATOR, value).apply()

    var isComingFromLogin: Boolean
        get() = sharedPrefs.getBoolean(IS_COMING_FROM_LOGIN, false)
        set(value) = sharedPrefs.edit().putBoolean(IS_COMING_FROM_LOGIN, value).apply()

    var createEvent: String?
        get() = sharedPrefs.getString(CREATE_EVENT, null)
        set(value) = sharedPrefs.edit().putString(CREATE_EVENT, value).apply()

    var createTask: String?
        get() = sharedPrefs.getString(CREATE_TASK, null)
        set(value) = sharedPrefs.edit().putString(CREATE_TASK, value).apply()

    var eventTodayList: String?
        get() = sharedPrefs.getString(EVENT_TODAY_LIST, "")
        set(value) = sharedPrefs.edit().putString(EVENT_TODAY_LIST, value).apply()

    var taskTodayList: String?
        get() = sharedPrefs.getString(TASK_TODAY_LIST, "")
        set(value) = sharedPrefs.edit().putString(TASK_TODAY_LIST, value).apply()

    var isEventsSelected: Boolean
        get() = sharedPrefs.getBoolean(IS_EVENT_SELECTED, true)
        set(value) = sharedPrefs.edit().putBoolean(IS_EVENT_SELECTED, value).apply()

    //region Clear and remove Prefs
    fun clear(): Boolean {
        return sharedPrefs.edit().clear().commit()
    }

    fun clearServicesApplied() {
        remove(SERVICES_APPLIED)
    }

    private fun remove(key: String) {
        sharedPrefs.edit().remove(key).apply()
    }

    fun clearLogin() {
        remove(TOKEN)
        remove(USER)
        remove(USER_TYPE)
    }
    //endregion
}