package com.tech.arno.oreo.base

import io.reactivex.disposables.CompositeDisposable

/**
 * Presenter基类
 *
 * @author xin.xu
 * @date 2019-05-16
 */

open class BasePresenter<T : IBaseView> : IPresenter<T> {
    var mRootView: T? = null
        private set

    private var compositeDisposable = CompositeDisposable()


    override fun attachView(mRootView: T) {
        this.mRootView = mRootView
    }

    override fun detachView() {
        mRootView = null

        //保证activity结束时取消所有正在执行的订阅
        if (!compositeDisposable.isDisposed) {
            compositeDisposable.clear()
        }
    }

    private val isViewAttached: Boolean
        get() = mRootView != null


    fun checkViewAttached(disposable: CompositeDisposable) {
        compositeDisposable.add(disposable)
    }

    private class MvpViewNotAttachedException internal constructor() :
        RuntimeException("Please call IPresenter.attachView(IBaseView) before requesting data to the IPresenter")
}