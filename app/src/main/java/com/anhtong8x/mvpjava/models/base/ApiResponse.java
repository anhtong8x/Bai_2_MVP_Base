package com.anhtong8x.mvpjava.models.base;

import com.google.gson.annotations.SerializedName;

public class ApiResponse<T> {
    @SerializedName("status")
    Boolean status;
    @SerializedName("message")
    String message;
    @SerializedName("errorCode")
    int errorCode;
    @SerializedName("data")
    T data;
    @SerializedName("totalRecord")
    int totalRecord;

    public ApiResponse(Boolean status, String message, int errorCode, T data, int totalRecord) {
        this.status = status;
        this.message = message;
        this.errorCode = errorCode;
        this.data = data;
        this.totalRecord = totalRecord;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public int getTotalRecord() {
        return totalRecord;
    }

    public void setTotalRecord(int totalRecord) {
        this.totalRecord = totalRecord;
    }
}
