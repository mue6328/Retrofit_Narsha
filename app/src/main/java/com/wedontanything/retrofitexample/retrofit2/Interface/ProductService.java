package com.wedontanything.retrofitexample.retrofit2.Interface;

import com.wedontanything.retrofitexample.Request.UserRequest;
import com.wedontanything.retrofitexample.Response.Response;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Query;

public interface ProductService {

    @POST("/api/product")
    Call<Response> postProductApply (
        @Header("token") String token
        // 상품 정보
    );

    @PUT("/api/product/updateProduct/:id")
    Call<Response> putUpdateProduct (
        @Header("token") String token
        // 상품 정보
    );

    @DELETE("/api/product/deleteProduct/:id")
    Call<Response> deleteProduct (
        @Header("token") String token,
        @Field("product_id") Integer product_id
    );

    @GET("/api/product/myProduct?member_id=")
    Call<Response> getMyProduct (
        @Query("member_id") String member_id
    );

    @GET("/api/product/hashtag?hashtag=")
    Call<Response> getHashTag (
        @Field("hashtag") String hashtag
    );

    @GET("/api/product/searchProduct?product_name=")
    Call<Response> getSearchProduct (
        @Field("product_name") String product_name
    );

    @GET("/api/product/heartProduct?member_id=")
    Call<Response> getheartProduct (
        @Field("member_id") String member_id
    );

    @GET("/api/product/mypageProductDetails?id=")
    Call<Response> getProductInfo (
        @Field("product_id") Integer product_id
    );


}
