package com.tech.arno.oreo.mvp.model.bean

/**
 * 热门TabInfo
 *
 * @author xin.xu
 * @date 2019-05-16
 */
data class TabInfoBean(val tabInfo: TabInfo) {
    data class TabInfo(val tabList: ArrayList<Tab>)

    data class Tab(val id: Long, val name: String, val apiUrl: String)
}