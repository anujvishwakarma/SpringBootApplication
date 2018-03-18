package com.example.myUIDemo.ModelClass;

/**
 * @author Anuj Kumar Vishwakarma(Zeref)
 * @Time 18/03/18 : 8:31 AM
 */
public class GlobalResponse {
    private Integer responseCode;
    private String  responseCodeMessage;
    private String  message;
    private String  data;

    public GlobalResponse(Integer responseCode, String responseCodeMessage, String message) {
        this.responseCode = responseCode;
        this.responseCodeMessage = responseCodeMessage;
        this.message = message;
    }

    public GlobalResponse(Integer responseCode, String responseCodeMessage, String message, String data) {
        this.responseCode = responseCode;
        this.responseCodeMessage = responseCodeMessage;
        this.message = message;
        this.data = data;
    }

    public Integer getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(Integer responseCode) {
        this.responseCode = responseCode;
    }

    public String getResponseCodeMessage() {
        return responseCodeMessage;
    }

    public void setResponseCodeMessage(String responseCodeMessage) {
        this.responseCodeMessage = responseCodeMessage;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

}
