package com.zq.zqplayer.mvp.main.ui

import android.os.Bundle
import android.view.View
import com.ziq.base.baserx.dagger.component.AppComponent
import com.ziq.base.mvp.IBasePresenter
import com.ziq.base.mvp.MvpBaseFragment
import com.zq.zqplayer.R

/**
 * @author wuyanqiang
 * @date 2018/10/15
 */
class EmptyFragment : MvpBaseFragment<IBasePresenter>() {
    override fun initForInject(appComponent: AppComponent?) {
    }

    override fun initLayoutResourceId(): Int {
        return R.layout.fragment_empty
    }

    override fun initData(view: View, savedInstanceState: Bundle?) {

    }

}