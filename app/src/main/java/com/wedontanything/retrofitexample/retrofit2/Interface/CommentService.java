package com.wedontanything.retrofitexample.retrofit2.Interface;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface CommentService {
    @FormUrlEncoded
    @POST
    Call<Response> postCreateComment (
       //  @Field("")
    );
}
