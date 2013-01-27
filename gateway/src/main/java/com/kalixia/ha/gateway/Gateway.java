package com.kalixia.ha.gateway;

/**
 * A gateway provides many different services:
 * <ul>
 *     <li>a REST API,</li>
 *     <li>a WebSockets API,</li>
 *     <li>a relay to a Cloud platform in order to route messages to/from the Cloud</li>
 * </ul>
 */
public interface Gateway {
    void start() throws InterruptedException;
    void stop();
}
