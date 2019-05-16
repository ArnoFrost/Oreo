package com.tech.arno.oreo.mvp.model.bean

import java.io.Serializable

/**
 * 分类Bean
 *
 * @author xin.xu
 * @date 2019-05-16
 */
data class CategoryBean(
    val id: Long,
    val name: String,
    val description: String,
    val bgPicture: String,
    val bgColor: String,
    val headerImage: String
) :
    Serializable
