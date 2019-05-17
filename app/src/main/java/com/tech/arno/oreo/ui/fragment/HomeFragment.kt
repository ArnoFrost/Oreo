package com.tech.arno.oreo.ui.fragment

import com.tech.arno.oreo.base.BaseFragment
import com.tech.arno.oreo.mvp.contract.HomeContract
import com.tech.arno.oreo.mvp.model.bean.HomeBean
import com.tech.arno.oreo.mvp.presenter.HomePresenter

/**
 * 主页Fragment
 *
 * @author xin.xu
 * @date 2019-05-16
 */

class HomeFragment : BaseFragment(), HomeContract.View {

    private val mPresenter by lazy { HomePresenter() }


    override fun getLayoutId(): Int {
        return 0
    }

    override fun initView() {
    }

    override fun lazyLoad() {
    }

    override fun setHomeData(homeBean: HomeBean) {
    }

    override fun setMoreData(itemList: ArrayList<HomeBean.Issue.Item>) {
    }

    override fun showError(msg: String, errorCode: Int) {
    }

    override fun showLoading() {
    }

    override fun dismissLoading() {
    }

}