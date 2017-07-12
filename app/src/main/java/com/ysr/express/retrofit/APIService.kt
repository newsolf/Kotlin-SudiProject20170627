package com.ysr.express.retrofit

import com.ysr.express.bean.RequestShipperName
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

/**
 * Created by ysr on 2017/6/30 17:21.
 * 邮箱 ysr200808@163.com
 */
interface APIService {
    /**单号识别*/
    @Headers("Content-Type:application/x-www-form-urlencoded")
    @GET("/Ebusiness/EbusinessOrderHandle.aspx")
    fun searchData(@Query("RequestData") RequestData: String,
                   @Query("EBusinessID") EBusinessID: Int,
                   @Query("RequestType") RequestType: Int,
                   @Query("DataType") DataType: Int,
                   @Query("DataSign") DataSign: String
    ): Call<RequestShipperName>

}