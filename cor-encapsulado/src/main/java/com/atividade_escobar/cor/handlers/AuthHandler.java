package com.atividade_escobar.cor.handlers;

import com.atividade_escobar.cor.handler.Handler;
import com.atividade_escobar.cor.model.Request;

public class AuthHandler extends Handler {
    @Override
    protected boolean process(Request request) {
        if (request.getData() != null && request.getData().contains("auth")) {
            request.setResult((request.getResult() == null ? "" : request.getResult() + " -> ") + "Authenticated");
            return false;
        } else {
            request.setResult("Unauthorized");
            return true;
        }
    }
}
