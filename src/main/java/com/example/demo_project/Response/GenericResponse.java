package com.example.demo_project.Response;

import com.example.demo_project.Enumerations.GeneralEnumerations;

public class GenericResponse <T>{

    private T t;
    private String userId;
    private String returnCode;
    private String message;

    public GenericResponse(T t, String message, String  returnCode) {
        this.t = t;
        this.message = message;
        this.returnCode = returnCode;
    }

    public static <T> GenericResponse<?> successResponse(T t) {
        return new GenericResponse<>(t,"Success!", GeneralEnumerations.ReturnCode.SUCCESS.getReturnCode());
    }
    public static <T> GenericResponse<?> failedResponse(T t) {
        return new GenericResponse<>(t,"Error!", GeneralEnumerations.ReturnCode.ERROR.getReturnCode());
    }
    public static <T> GenericResponse<?> failedResponse(T t, String message) {
        return new GenericResponse<>(t, message, GeneralEnumerations.ReturnCode.ERROR.getReturnCode());
    }

    public static <T> GenericResponse<?> failedResponse(String message) {
        return new GenericResponse<>(null, message, GeneralEnumerations.ReturnCode.ERROR.getReturnCode());
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
