package com.zq.zqplayer.mvvm.login

import android.text.TextWatcher
import android.view.View
import androidx.lifecycle.MutableLiveData
import com.zq.zqplayer.bean.UserInfoBean

interface ILoginViewModel {
    val isValid: MutableLiveData<Boolean>
    val userName: MutableLiveData<String>
    val userPassword: MutableLiveData<String>
    val userNameTextWatcher: TextWatcher
    val userPasswordTextWatcher: TextWatcher

    val isGotoRegisterActivity: MutableLiveData<Boolean>
    val isLoading: MutableLiveData<Boolean>
    val toastMsg: MutableLiveData<String>
    val userInfo: MutableLiveData<UserInfoBean>
    fun login(view: View):Unit
    fun gotoRegisterPage(view: View):Unit
}