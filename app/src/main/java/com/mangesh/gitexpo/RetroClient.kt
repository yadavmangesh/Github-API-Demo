package com.mangesh.gitexpo

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetroClient {

    companion object {
        val BASE_URL:String="https://api.github.com/"
        var retrofit:Retrofit?=null

        fun getClient(): Api? {
            if (retrofit == null) {
                retrofit = Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
            }
            return retrofit?.create(Api::class.java)
        }
    }
}