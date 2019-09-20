package com.wedontanything.retrofitexample.retrofit2.Interface;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Field;
import retrofit2.http.POST;

public interface ReportService {
    @POST("/api/report/")
    Call<Response> postReport (
        @Field("report_id") String report_id
    );
}
