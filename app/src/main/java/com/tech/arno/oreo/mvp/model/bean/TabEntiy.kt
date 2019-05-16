package com.tech.arno.oreo.mvp.model.bean

import com.flyco.tablayout.listener.CustomTabEntity

/**
 * Tab原型
 *
 * @author xin.xu
 * @date 2019-05-16
 */

class TabEntity(var title: String, private var selectedIcon: Int, private var unSelectedIcon: Int) : CustomTabEntity {

    override fun getTabTitle(): String {
        return title
    }

    override fun getTabSelectedIcon(): Int {
        return selectedIcon
    }

    override fun getTabUnselectedIcon(): Int {
        return unSelectedIcon
    }
}