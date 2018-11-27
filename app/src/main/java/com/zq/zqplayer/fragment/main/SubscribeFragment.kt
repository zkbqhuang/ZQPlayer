package com.zq.zqplayer.fragment.main

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.View
import com.ziq.base.dagger.component.AppComponent
import com.ziq.base.mvp.BaseFragment
import com.ziq.base.mvp.IBasePresenter
import com.zq.zqplayer.R

/**
 * @author wuyanqiang
 * @date 2018/10/15
 */
class SubscribeFragment : BaseFragment<IBasePresenter>() {

    override fun initLayoutResourceId(): Int {
        return R.layout.fragment_subscribe
    }
    override fun initForInject(appComponent: AppComponent?) {
    }
    override fun initData(view: View, savedInstanceState: Bundle?) {

    }

}