package com.atividade_escobar.cor.builder;

import com.atividade_escobar.cor.handler.Handler;
import com.atividade_escobar.cor.handlers.AuthHandler;
import com.atividade_escobar.cor.handlers.ValidationHandler;
import com.atividade_escobar.cor.handlers.BusinessHandler;
import com.atividade_escobar.cor.handlers.FinalHandler;

/**
 * Constrói a cadeia. Encapsula a ordem e os handlers concretos.
 */
public class ChainBuilder {
    public Handler build() {
        FinalHandler finalHandler = new FinalHandler();
        BusinessHandler business = new BusinessHandler();
        ValidationHandler validation = new ValidationHandler();
        AuthHandler auth = new AuthHandler();

        auth.setNext(validation).setNext(business).setNext(finalHandler);

        return auth;
    }
}
