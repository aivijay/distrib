package com.bc.distrib

class ConsumerService {
    static rabbitQueue = "msgs"

    void handleMessage(msg) {
        log.debug "Received message: $msg"
    }
}