package com.atividade_escobar.cor.handlers;

import com.atividade_escobar.cor.handler.Handler;
import com.atividade_escobar.cor.model.Request;

public class ValidationHandler extends Handler {
    @Override
    protected boolean process(Request request) {
        if (request.getData() == null || request.getData().trim().isEmpty()) {
            request.setResult("Invalid request: empty data");
            return true;
        }
        request.setResult((request.getResult() == null ? "" : request.getResult() + " -> ") + "Validated");
        return false;
    }
}
