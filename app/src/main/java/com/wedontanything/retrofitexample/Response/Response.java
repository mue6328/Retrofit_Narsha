package com.wedontanything.retrofitexample.Response;

import com.google.gson.annotations.SerializedName;

public class Response {
    @SerializedName(value = "status")
    private Integer status;

    @SerializedName(value = "data")
    private String data;

    private String message;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
