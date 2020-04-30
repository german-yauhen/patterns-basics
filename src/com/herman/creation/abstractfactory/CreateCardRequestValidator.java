package com.herman.creation.abstractfactory;

import com.herman.creation.abstractfactory.card.CreateCardRequest;

public interface CreateCardRequestValidator {
    boolean isValidRequest(CreateCardRequest createCardRequest);
}
