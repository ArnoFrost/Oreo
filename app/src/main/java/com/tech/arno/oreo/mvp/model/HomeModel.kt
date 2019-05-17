package com.tech.arno.oreo.mvp.model

import com.tech.arno.oreo.mvp.model.bean.HomeBean
import com.tech.arno.oreo.net.RetrofitManager
import com.tech.arno.oreo.rx.scheduler.SchedulerUtils
import io.reactivex.Observable

/**
 * com.tech.arno.oreo.mvp.model
 *
 * @author xin.xu
 * @date 2019-05-16
 */

class HomeModel {

    /**
     * 获取首页 Banner 数据
     */
    fun requestHomeData(num: Int): Observable<HomeBean> {
        return RetrofitManager.service.getFirstHomeData(num)
            .compose(SchedulerUtils.ioToMain())
    }

    /**
     * 加载更多
     */
    fun loadMoreData(url: String): Observable<HomeBean> {

        return RetrofitManager.service.getMoreHomeData(url)
            .compose(SchedulerUtils.ioToMain())
    }
}