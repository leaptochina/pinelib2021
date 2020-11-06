package com.blueberrysolution.pinelib21.net.retrofit

import kotlin.reflect.KClass

// myRs = N(baseUrl, RetrofitServices::class).n()
class N<T : Any>(baseUrl: String, kClass: KClass<T>) {
    var retrofitManager:  RetrofitManager<T>? = null;

    init{
        retrofitManager = RetrofitManager<T>(baseUrl, kClass)
    }

    fun n(): T{
        return retrofitManager!!.req()
    }

}


