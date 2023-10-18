package com.mardelapps.apprueba.superheroapp

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
    @GET("api/3658146914508104/search/{name}")
    suspend fun getSuperHeroes(@Path("name") superheroName: String): Response<SuperHeroDataResponse>

    @GET("/api/3658146914508104/{id}")
    suspend fun getSuperheroDetail(@Path("id") superheroId:String):Response<SuperHeroDetailResponse>
}