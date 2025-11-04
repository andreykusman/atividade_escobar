package com.atividade_escobar.cor.handlers;

import com.atividade_escobar.cor.handler.Handler;
import com.atividade_escobar.cor.model.Request;

public class BusinessHandler extends Handler {
    @Override
    protected boolean process(Request request) {
        if (request.getData().contains("process")) {
            request.setResult((request.getResult() == null ? "" : request.getResult() + " -> ") + "BusinessProcessed");
            return true;
        }
        return false;
    }
}
