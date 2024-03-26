package com.example.battletank.models

import com.example.battletank.enums.Material

data class Element(
    val viewId:Int,
    val material: Material,
    val coordinate: Coordinate
)
