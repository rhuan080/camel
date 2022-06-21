/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.builder.endpoint.dsl;

import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.stream.*;
import javax.annotation.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * Read and write nodes to/from a JCR compliant content repository.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface JcrEndpointBuilderFactory {


    /**
     * Builder for endpoint consumers for the JCR component.
     */
    public interface JcrEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default AdvancedJcrEndpointConsumerBuilder advanced() {
            return (AdvancedJcrEndpointConsumerBuilder) this;
        }
        /**
         * When isDeep is true, events whose associated parent node is at
         * absPath or within its subgraph are received.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: common
         * 
         * @param deep the value to set
         * @return the dsl builder
         */
        default JcrEndpointConsumerBuilder deep(boolean deep) {
            doSetProperty("deep", deep);
            return this;
        }
        /**
         * When isDeep is true, events whose associated parent node is at
         * absPath or within its subgraph are received.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: common
         * 
         * @param deep the value to set
         * @return the dsl builder
         */
        default JcrEndpointConsumerBuilder deep(String deep) {
            doSetProperty("deep", deep);
            return this;
        }
        /**
         * eventTypes (a combination of one or more event types encoded as a bit
         * mask value such as javax.jcr.observation.Event.NODE_ADDED,
         * javax.jcr.observation.Event.NODE_REMOVED, etc.).
         * 
         * The option is a: &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param eventTypes the value to set
         * @return the dsl builder
         */
        default JcrEndpointConsumerBuilder eventTypes(int eventTypes) {
            doSetProperty("eventTypes", eventTypes);
            return this;
        }
        /**
         * eventTypes (a combination of one or more event types encoded as a bit
         * mask value such as javax.jcr.observation.Event.NODE_ADDED,
         * javax.jcr.observation.Event.NODE_REMOVED, etc.).
         * 
         * The option will be converted to a &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param eventTypes the value to set
         * @return the dsl builder
         */
        default JcrEndpointConsumerBuilder eventTypes(String eventTypes) {
            doSetProperty("eventTypes", eventTypes);
            return this;
        }
        /**
         * When a comma separated nodeTypeName list string is set, only events
         * whose associated parent node has one of the node types (or a subtype
         * of one of the node types) in this list will be received.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param nodeTypeNames the value to set
         * @return the dsl builder
         */
        default JcrEndpointConsumerBuilder nodeTypeNames(String nodeTypeNames) {
            doSetProperty("nodeTypeNames", nodeTypeNames);
            return this;
        }
        /**
         * If noLocal is true, then events generated by the session through
         * which the listener was registered are ignored. Otherwise, they are
         * not ignored.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: common
         * 
         * @param noLocal the value to set
         * @return the dsl builder
         */
        default JcrEndpointConsumerBuilder noLocal(boolean noLocal) {
            doSetProperty("noLocal", noLocal);
            return this;
        }
        /**
         * If noLocal is true, then events generated by the session through
         * which the listener was registered are ignored. Otherwise, they are
         * not ignored.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: common
         * 
         * @param noLocal the value to set
         * @return the dsl builder
         */
        default JcrEndpointConsumerBuilder noLocal(String noLocal) {
            doSetProperty("noLocal", noLocal);
            return this;
        }
        /**
         * Password for login.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param password the value to set
         * @return the dsl builder
         */
        default JcrEndpointConsumerBuilder password(String password) {
            doSetProperty("password", password);
            return this;
        }
        /**
         * Interval in milliseconds to wait before each session live checking
         * The default value is 60000 ms.
         * 
         * The option is a: &lt;code&gt;long&lt;/code&gt; type.
         * 
         * Default: 60000
         * Group: common
         * 
         * @param sessionLiveCheckInterval the value to set
         * @return the dsl builder
         */
        default JcrEndpointConsumerBuilder sessionLiveCheckInterval(
                long sessionLiveCheckInterval) {
            doSetProperty("sessionLiveCheckInterval", sessionLiveCheckInterval);
            return this;
        }
        /**
         * Interval in milliseconds to wait before each session live checking
         * The default value is 60000 ms.
         * 
         * The option will be converted to a &lt;code&gt;long&lt;/code&gt; type.
         * 
         * Default: 60000
         * Group: common
         * 
         * @param sessionLiveCheckInterval the value to set
         * @return the dsl builder
         */
        default JcrEndpointConsumerBuilder sessionLiveCheckInterval(
                String sessionLiveCheckInterval) {
            doSetProperty("sessionLiveCheckInterval", sessionLiveCheckInterval);
            return this;
        }
        /**
         * Interval in milliseconds to wait before the first session live
         * checking. The default value is 3000 ms.
         * 
         * The option is a: &lt;code&gt;long&lt;/code&gt; type.
         * 
         * Default: 3000
         * Group: common
         * 
         * @param sessionLiveCheckIntervalOnStart the value to set
         * @return the dsl builder
         */
        default JcrEndpointConsumerBuilder sessionLiveCheckIntervalOnStart(
                long sessionLiveCheckIntervalOnStart) {
            doSetProperty("sessionLiveCheckIntervalOnStart", sessionLiveCheckIntervalOnStart);
            return this;
        }
        /**
         * Interval in milliseconds to wait before the first session live
         * checking. The default value is 3000 ms.
         * 
         * The option will be converted to a &lt;code&gt;long&lt;/code&gt; type.
         * 
         * Default: 3000
         * Group: common
         * 
         * @param sessionLiveCheckIntervalOnStart the value to set
         * @return the dsl builder
         */
        default JcrEndpointConsumerBuilder sessionLiveCheckIntervalOnStart(
                String sessionLiveCheckIntervalOnStart) {
            doSetProperty("sessionLiveCheckIntervalOnStart", sessionLiveCheckIntervalOnStart);
            return this;
        }
        /**
         * Username for login.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param username the value to set
         * @return the dsl builder
         */
        default JcrEndpointConsumerBuilder username(String username) {
            doSetProperty("username", username);
            return this;
        }
        /**
         * When a comma separated uuid list string is set, only events whose
         * associated parent node has one of the identifiers in the comma
         * separated uuid list will be received.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param uuids the value to set
         * @return the dsl builder
         */
        default JcrEndpointConsumerBuilder uuids(String uuids) {
            doSetProperty("uuids", uuids);
            return this;
        }
        /**
         * The workspace to access. If it's not specified then the default one
         * will be used.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param workspaceName the value to set
         * @return the dsl builder
         */
        default JcrEndpointConsumerBuilder workspaceName(String workspaceName) {
            doSetProperty("workspaceName", workspaceName);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint consumers for the JCR component.
     */
    public interface AdvancedJcrEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default JcrEndpointConsumerBuilder basic() {
            return (JcrEndpointConsumerBuilder) this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: consumer (advanced)
         * 
         * @param bridgeErrorHandler the value to set
         * @return the dsl builder
         */
        default AdvancedJcrEndpointConsumerBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: consumer (advanced)
         * 
         * @param bridgeErrorHandler the value to set
         * @return the dsl builder
         */
        default AdvancedJcrEndpointConsumerBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.spi.ExceptionHandler&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param exceptionHandler the value to set
         * @return the dsl builder
         */
        default AdvancedJcrEndpointConsumerBuilder exceptionHandler(
                org.apache.camel.spi.ExceptionHandler exceptionHandler) {
            doSetProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.spi.ExceptionHandler&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param exceptionHandler the value to set
         * @return the dsl builder
         */
        default AdvancedJcrEndpointConsumerBuilder exceptionHandler(
                String exceptionHandler) {
            doSetProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.ExchangePattern&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param exchangePattern the value to set
         * @return the dsl builder
         */
        default AdvancedJcrEndpointConsumerBuilder exchangePattern(
                org.apache.camel.ExchangePattern exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.ExchangePattern&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param exchangePattern the value to set
         * @return the dsl builder
         */
        default AdvancedJcrEndpointConsumerBuilder exchangePattern(
                String exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
        }
    }

    /**
     * Builder for endpoint producers for the JCR component.
     */
    public interface JcrEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedJcrEndpointProducerBuilder advanced() {
            return (AdvancedJcrEndpointProducerBuilder) this;
        }
        /**
         * When isDeep is true, events whose associated parent node is at
         * absPath or within its subgraph are received.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: common
         * 
         * @param deep the value to set
         * @return the dsl builder
         */
        default JcrEndpointProducerBuilder deep(boolean deep) {
            doSetProperty("deep", deep);
            return this;
        }
        /**
         * When isDeep is true, events whose associated parent node is at
         * absPath or within its subgraph are received.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: common
         * 
         * @param deep the value to set
         * @return the dsl builder
         */
        default JcrEndpointProducerBuilder deep(String deep) {
            doSetProperty("deep", deep);
            return this;
        }
        /**
         * eventTypes (a combination of one or more event types encoded as a bit
         * mask value such as javax.jcr.observation.Event.NODE_ADDED,
         * javax.jcr.observation.Event.NODE_REMOVED, etc.).
         * 
         * The option is a: &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param eventTypes the value to set
         * @return the dsl builder
         */
        default JcrEndpointProducerBuilder eventTypes(int eventTypes) {
            doSetProperty("eventTypes", eventTypes);
            return this;
        }
        /**
         * eventTypes (a combination of one or more event types encoded as a bit
         * mask value such as javax.jcr.observation.Event.NODE_ADDED,
         * javax.jcr.observation.Event.NODE_REMOVED, etc.).
         * 
         * The option will be converted to a &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param eventTypes the value to set
         * @return the dsl builder
         */
        default JcrEndpointProducerBuilder eventTypes(String eventTypes) {
            doSetProperty("eventTypes", eventTypes);
            return this;
        }
        /**
         * When a comma separated nodeTypeName list string is set, only events
         * whose associated parent node has one of the node types (or a subtype
         * of one of the node types) in this list will be received.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param nodeTypeNames the value to set
         * @return the dsl builder
         */
        default JcrEndpointProducerBuilder nodeTypeNames(String nodeTypeNames) {
            doSetProperty("nodeTypeNames", nodeTypeNames);
            return this;
        }
        /**
         * If noLocal is true, then events generated by the session through
         * which the listener was registered are ignored. Otherwise, they are
         * not ignored.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: common
         * 
         * @param noLocal the value to set
         * @return the dsl builder
         */
        default JcrEndpointProducerBuilder noLocal(boolean noLocal) {
            doSetProperty("noLocal", noLocal);
            return this;
        }
        /**
         * If noLocal is true, then events generated by the session through
         * which the listener was registered are ignored. Otherwise, they are
         * not ignored.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: common
         * 
         * @param noLocal the value to set
         * @return the dsl builder
         */
        default JcrEndpointProducerBuilder noLocal(String noLocal) {
            doSetProperty("noLocal", noLocal);
            return this;
        }
        /**
         * Password for login.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param password the value to set
         * @return the dsl builder
         */
        default JcrEndpointProducerBuilder password(String password) {
            doSetProperty("password", password);
            return this;
        }
        /**
         * Interval in milliseconds to wait before each session live checking
         * The default value is 60000 ms.
         * 
         * The option is a: &lt;code&gt;long&lt;/code&gt; type.
         * 
         * Default: 60000
         * Group: common
         * 
         * @param sessionLiveCheckInterval the value to set
         * @return the dsl builder
         */
        default JcrEndpointProducerBuilder sessionLiveCheckInterval(
                long sessionLiveCheckInterval) {
            doSetProperty("sessionLiveCheckInterval", sessionLiveCheckInterval);
            return this;
        }
        /**
         * Interval in milliseconds to wait before each session live checking
         * The default value is 60000 ms.
         * 
         * The option will be converted to a &lt;code&gt;long&lt;/code&gt; type.
         * 
         * Default: 60000
         * Group: common
         * 
         * @param sessionLiveCheckInterval the value to set
         * @return the dsl builder
         */
        default JcrEndpointProducerBuilder sessionLiveCheckInterval(
                String sessionLiveCheckInterval) {
            doSetProperty("sessionLiveCheckInterval", sessionLiveCheckInterval);
            return this;
        }
        /**
         * Interval in milliseconds to wait before the first session live
         * checking. The default value is 3000 ms.
         * 
         * The option is a: &lt;code&gt;long&lt;/code&gt; type.
         * 
         * Default: 3000
         * Group: common
         * 
         * @param sessionLiveCheckIntervalOnStart the value to set
         * @return the dsl builder
         */
        default JcrEndpointProducerBuilder sessionLiveCheckIntervalOnStart(
                long sessionLiveCheckIntervalOnStart) {
            doSetProperty("sessionLiveCheckIntervalOnStart", sessionLiveCheckIntervalOnStart);
            return this;
        }
        /**
         * Interval in milliseconds to wait before the first session live
         * checking. The default value is 3000 ms.
         * 
         * The option will be converted to a &lt;code&gt;long&lt;/code&gt; type.
         * 
         * Default: 3000
         * Group: common
         * 
         * @param sessionLiveCheckIntervalOnStart the value to set
         * @return the dsl builder
         */
        default JcrEndpointProducerBuilder sessionLiveCheckIntervalOnStart(
                String sessionLiveCheckIntervalOnStart) {
            doSetProperty("sessionLiveCheckIntervalOnStart", sessionLiveCheckIntervalOnStart);
            return this;
        }
        /**
         * Username for login.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param username the value to set
         * @return the dsl builder
         */
        default JcrEndpointProducerBuilder username(String username) {
            doSetProperty("username", username);
            return this;
        }
        /**
         * When a comma separated uuid list string is set, only events whose
         * associated parent node has one of the identifiers in the comma
         * separated uuid list will be received.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param uuids the value to set
         * @return the dsl builder
         */
        default JcrEndpointProducerBuilder uuids(String uuids) {
            doSetProperty("uuids", uuids);
            return this;
        }
        /**
         * The workspace to access. If it's not specified then the default one
         * will be used.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param workspaceName the value to set
         * @return the dsl builder
         */
        default JcrEndpointProducerBuilder workspaceName(String workspaceName) {
            doSetProperty("workspaceName", workspaceName);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint producers for the JCR component.
     */
    public interface AdvancedJcrEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default JcrEndpointProducerBuilder basic() {
            return (JcrEndpointProducerBuilder) this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer (advanced)
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default AdvancedJcrEndpointProducerBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer (advanced)
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default AdvancedJcrEndpointProducerBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
    }

    /**
     * Builder for endpoint for the JCR component.
     */
    public interface JcrEndpointBuilder
            extends
                JcrEndpointConsumerBuilder,
                JcrEndpointProducerBuilder {
        default AdvancedJcrEndpointBuilder advanced() {
            return (AdvancedJcrEndpointBuilder) this;
        }
        /**
         * When isDeep is true, events whose associated parent node is at
         * absPath or within its subgraph are received.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: common
         * 
         * @param deep the value to set
         * @return the dsl builder
         */
        default JcrEndpointBuilder deep(boolean deep) {
            doSetProperty("deep", deep);
            return this;
        }
        /**
         * When isDeep is true, events whose associated parent node is at
         * absPath or within its subgraph are received.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: common
         * 
         * @param deep the value to set
         * @return the dsl builder
         */
        default JcrEndpointBuilder deep(String deep) {
            doSetProperty("deep", deep);
            return this;
        }
        /**
         * eventTypes (a combination of one or more event types encoded as a bit
         * mask value such as javax.jcr.observation.Event.NODE_ADDED,
         * javax.jcr.observation.Event.NODE_REMOVED, etc.).
         * 
         * The option is a: &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param eventTypes the value to set
         * @return the dsl builder
         */
        default JcrEndpointBuilder eventTypes(int eventTypes) {
            doSetProperty("eventTypes", eventTypes);
            return this;
        }
        /**
         * eventTypes (a combination of one or more event types encoded as a bit
         * mask value such as javax.jcr.observation.Event.NODE_ADDED,
         * javax.jcr.observation.Event.NODE_REMOVED, etc.).
         * 
         * The option will be converted to a &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param eventTypes the value to set
         * @return the dsl builder
         */
        default JcrEndpointBuilder eventTypes(String eventTypes) {
            doSetProperty("eventTypes", eventTypes);
            return this;
        }
        /**
         * When a comma separated nodeTypeName list string is set, only events
         * whose associated parent node has one of the node types (or a subtype
         * of one of the node types) in this list will be received.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param nodeTypeNames the value to set
         * @return the dsl builder
         */
        default JcrEndpointBuilder nodeTypeNames(String nodeTypeNames) {
            doSetProperty("nodeTypeNames", nodeTypeNames);
            return this;
        }
        /**
         * If noLocal is true, then events generated by the session through
         * which the listener was registered are ignored. Otherwise, they are
         * not ignored.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: common
         * 
         * @param noLocal the value to set
         * @return the dsl builder
         */
        default JcrEndpointBuilder noLocal(boolean noLocal) {
            doSetProperty("noLocal", noLocal);
            return this;
        }
        /**
         * If noLocal is true, then events generated by the session through
         * which the listener was registered are ignored. Otherwise, they are
         * not ignored.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: common
         * 
         * @param noLocal the value to set
         * @return the dsl builder
         */
        default JcrEndpointBuilder noLocal(String noLocal) {
            doSetProperty("noLocal", noLocal);
            return this;
        }
        /**
         * Password for login.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param password the value to set
         * @return the dsl builder
         */
        default JcrEndpointBuilder password(String password) {
            doSetProperty("password", password);
            return this;
        }
        /**
         * Interval in milliseconds to wait before each session live checking
         * The default value is 60000 ms.
         * 
         * The option is a: &lt;code&gt;long&lt;/code&gt; type.
         * 
         * Default: 60000
         * Group: common
         * 
         * @param sessionLiveCheckInterval the value to set
         * @return the dsl builder
         */
        default JcrEndpointBuilder sessionLiveCheckInterval(
                long sessionLiveCheckInterval) {
            doSetProperty("sessionLiveCheckInterval", sessionLiveCheckInterval);
            return this;
        }
        /**
         * Interval in milliseconds to wait before each session live checking
         * The default value is 60000 ms.
         * 
         * The option will be converted to a &lt;code&gt;long&lt;/code&gt; type.
         * 
         * Default: 60000
         * Group: common
         * 
         * @param sessionLiveCheckInterval the value to set
         * @return the dsl builder
         */
        default JcrEndpointBuilder sessionLiveCheckInterval(
                String sessionLiveCheckInterval) {
            doSetProperty("sessionLiveCheckInterval", sessionLiveCheckInterval);
            return this;
        }
        /**
         * Interval in milliseconds to wait before the first session live
         * checking. The default value is 3000 ms.
         * 
         * The option is a: &lt;code&gt;long&lt;/code&gt; type.
         * 
         * Default: 3000
         * Group: common
         * 
         * @param sessionLiveCheckIntervalOnStart the value to set
         * @return the dsl builder
         */
        default JcrEndpointBuilder sessionLiveCheckIntervalOnStart(
                long sessionLiveCheckIntervalOnStart) {
            doSetProperty("sessionLiveCheckIntervalOnStart", sessionLiveCheckIntervalOnStart);
            return this;
        }
        /**
         * Interval in milliseconds to wait before the first session live
         * checking. The default value is 3000 ms.
         * 
         * The option will be converted to a &lt;code&gt;long&lt;/code&gt; type.
         * 
         * Default: 3000
         * Group: common
         * 
         * @param sessionLiveCheckIntervalOnStart the value to set
         * @return the dsl builder
         */
        default JcrEndpointBuilder sessionLiveCheckIntervalOnStart(
                String sessionLiveCheckIntervalOnStart) {
            doSetProperty("sessionLiveCheckIntervalOnStart", sessionLiveCheckIntervalOnStart);
            return this;
        }
        /**
         * Username for login.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param username the value to set
         * @return the dsl builder
         */
        default JcrEndpointBuilder username(String username) {
            doSetProperty("username", username);
            return this;
        }
        /**
         * When a comma separated uuid list string is set, only events whose
         * associated parent node has one of the identifiers in the comma
         * separated uuid list will be received.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param uuids the value to set
         * @return the dsl builder
         */
        default JcrEndpointBuilder uuids(String uuids) {
            doSetProperty("uuids", uuids);
            return this;
        }
        /**
         * The workspace to access. If it's not specified then the default one
         * will be used.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param workspaceName the value to set
         * @return the dsl builder
         */
        default JcrEndpointBuilder workspaceName(String workspaceName) {
            doSetProperty("workspaceName", workspaceName);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the JCR component.
     */
    public interface AdvancedJcrEndpointBuilder
            extends
                AdvancedJcrEndpointConsumerBuilder,
                AdvancedJcrEndpointProducerBuilder {
        default JcrEndpointBuilder basic() {
            return (JcrEndpointBuilder) this;
        }
    }

    public interface JcrBuilders {
        /**
         * JCR (camel-jcr)
         * Read and write nodes to/from a JCR compliant content repository.
         * 
         * Category: database,cms
         * Since: 1.3
         * Maven coordinates: org.apache.camel:camel-jcr
         * 
         * Syntax: <code>jcr:host/base</code>
         * 
         * Path parameter: host (required)
         * Name of the javax.jcr.Repository to lookup from the Camel registry to
         * be used.
         * 
         * Path parameter: base
         * Get the base node when accessing the repository
         * 
         * @param path host/base
         * @return the dsl builder
         */
        default JcrEndpointBuilder jcr(String path) {
            return JcrEndpointBuilderFactory.endpointBuilder("jcr", path);
        }
        /**
         * JCR (camel-jcr)
         * Read and write nodes to/from a JCR compliant content repository.
         * 
         * Category: database,cms
         * Since: 1.3
         * Maven coordinates: org.apache.camel:camel-jcr
         * 
         * Syntax: <code>jcr:host/base</code>
         * 
         * Path parameter: host (required)
         * Name of the javax.jcr.Repository to lookup from the Camel registry to
         * be used.
         * 
         * Path parameter: base
         * Get the base node when accessing the repository
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path host/base
         * @return the dsl builder
         */
        default JcrEndpointBuilder jcr(String componentName, String path) {
            return JcrEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }
    static JcrEndpointBuilder endpointBuilder(String componentName, String path) {
        class JcrEndpointBuilderImpl extends AbstractEndpointBuilder implements JcrEndpointBuilder, AdvancedJcrEndpointBuilder {
            public JcrEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new JcrEndpointBuilderImpl(path);
    }
}