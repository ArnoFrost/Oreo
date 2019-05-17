package com.tech.arno.oreo.mvp.presenter

import com.tech.arno.oreo.base.BasePresenter
import com.tech.arno.oreo.mvp.contract.HomeContract
import com.tech.arno.oreo.mvp.model.HomeModel
import com.tech.arno.oreo.mvp.model.bean.HomeBean

/**
 * com.tech.arno.oreo.mvp.presenter
 *
 * @author xin.xu
 * @date 2019-05-16
 */

class HomePresenter : BasePresenter<HomeContract.View>(), HomeContract.Presenter {
    val TAG: String = "HomePresenter"

    private val bannnerHomeBean: HomeBean? = null

    private var nextPageUrl: String? = null

    private val homeModel: HomeModel by lazy {
        HomeModel()
    }


    override fun requestHomeData(num: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun loadMoreData() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}