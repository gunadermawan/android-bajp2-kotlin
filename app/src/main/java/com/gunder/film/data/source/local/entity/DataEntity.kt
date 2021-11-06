package com.gunder.film.data.source.local.entity

data class DetailEntity(
    var id: Int? = 0,
    var poster: String? = null,
    var posterItem: String? = null,
    var title: String? = null,
    var name: String? = null,
    var overview: String? = null,
    var release_date: String? = null
)