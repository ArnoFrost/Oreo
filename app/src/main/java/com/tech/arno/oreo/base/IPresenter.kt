package com.tech.arno.oreo.base


/**
 * Presenter接口
 *
 * @author xin.xu
 * @date 2019-05-16
 */


interface IPresenter<in V : IBaseView> {

    fun attachView(mRootView: V)

    fun detachView()

}
