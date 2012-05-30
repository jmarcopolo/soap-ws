package com.centeractive.ws.server;

/**
 * Copyright (c) centeractive ag, Inc. All Rights Reserved.
 * <p/>
 * User: Tom Bujok (tomasz.bujok@centeractive.com)
 * Date: 22/11/11
 * Time: 7:53 PM
 */
public class SoapServerException extends RuntimeException {

    public SoapServerException(String message) {
        super(message);
    }

    public SoapServerException(String message, Throwable cause) {
        super(message, cause);
    }

    public SoapServerException(Throwable cause) {
        super(cause.getMessage(), cause);
    }

}
