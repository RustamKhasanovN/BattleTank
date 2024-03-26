package com.example.battletank.enums

enum class Material(val tankCanGoThrough:Boolean) {
    EMPTY(tankCanGoThrough:true),
    BRICK(tankCanGoThrough:false),
    CONCRETE(tankCanGoThrough:false),
    GRASS(tankCanGoThrough:true),
}