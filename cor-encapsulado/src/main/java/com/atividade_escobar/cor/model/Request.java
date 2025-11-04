package com.atividade_escobar.cor.model;

public class Request {
    private final String data;
    private String result;

    public Request(String data) {
        this.data = data;
        this.result = null;
    }

    public String getData() { return data; }
    public String getResult() { return result; }
    public void setResult(String result) { this.result = result; }
}
