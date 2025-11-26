package com.mstf.cmp_memecreator

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform