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
 * Manage and invoke Google Cloud Functions
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface GoogleCloudFunctionsEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Google Cloud Functions component.
     */
    public interface GoogleCloudFunctionsEndpointBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedGoogleCloudFunctionsEndpointBuilder advanced() {
            return (AdvancedGoogleCloudFunctionsEndpointBuilder) this;
        }
        /**
         * Service account key to authenticate an application as a service
         * account.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param serviceAccountKey the value to set
         * @return the dsl builder
         */
        default GoogleCloudFunctionsEndpointBuilder serviceAccountKey(
                String serviceAccountKey) {
            doSetProperty("serviceAccountKey", serviceAccountKey);
            return this;
        }
        /**
         * The Google Cloud Location (Region) where the Function is located.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param location the value to set
         * @return the dsl builder
         */
        default GoogleCloudFunctionsEndpointBuilder location(String location) {
            doSetProperty("location", location);
            return this;
        }
        /**
         * The operation to perform on the producer.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.google.functions.GoogleCloudFunctionsOperations&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param operation the value to set
         * @return the dsl builder
         */
        default GoogleCloudFunctionsEndpointBuilder operation(
                org.apache.camel.component.google.functions.GoogleCloudFunctionsOperations operation) {
            doSetProperty("operation", operation);
            return this;
        }
        /**
         * The operation to perform on the producer.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.component.google.functions.GoogleCloudFunctionsOperations&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param operation the value to set
         * @return the dsl builder
         */
        default GoogleCloudFunctionsEndpointBuilder operation(String operation) {
            doSetProperty("operation", operation);
            return this;
        }
        /**
         * Specifies if the request is a pojo request.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param pojoRequest the value to set
         * @return the dsl builder
         */
        default GoogleCloudFunctionsEndpointBuilder pojoRequest(
                boolean pojoRequest) {
            doSetProperty("pojoRequest", pojoRequest);
            return this;
        }
        /**
         * Specifies if the request is a pojo request.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param pojoRequest the value to set
         * @return the dsl builder
         */
        default GoogleCloudFunctionsEndpointBuilder pojoRequest(
                String pojoRequest) {
            doSetProperty("pojoRequest", pojoRequest);
            return this;
        }
        /**
         * The Google Cloud Project name where the Function is located.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param project the value to set
         * @return the dsl builder
         */
        default GoogleCloudFunctionsEndpointBuilder project(String project) {
            doSetProperty("project", project);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Google Cloud Functions component.
     */
    public interface AdvancedGoogleCloudFunctionsEndpointBuilder
            extends
                EndpointProducerBuilder {
        default GoogleCloudFunctionsEndpointBuilder basic() {
            return (GoogleCloudFunctionsEndpointBuilder) this;
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
        default AdvancedGoogleCloudFunctionsEndpointBuilder lazyStartProducer(
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
        default AdvancedGoogleCloudFunctionsEndpointBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * The client to use during service invocation.
         * 
         * The option is a:
         * &lt;code&gt;com.google.cloud.functions.v1.CloudFunctionsServiceClient&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param client the value to set
         * @return the dsl builder
         */
        default AdvancedGoogleCloudFunctionsEndpointBuilder client(
                com.google.cloud.functions.v1.CloudFunctionsServiceClient client) {
            doSetProperty("client", client);
            return this;
        }
        /**
         * The client to use during service invocation.
         * 
         * The option will be converted to a
         * &lt;code&gt;com.google.cloud.functions.v1.CloudFunctionsServiceClient&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param client the value to set
         * @return the dsl builder
         */
        default AdvancedGoogleCloudFunctionsEndpointBuilder client(String client) {
            doSetProperty("client", client);
            return this;
        }
    }

    public interface GoogleCloudFunctionsBuilders {
        /**
         * Google Cloud Functions (camel-google-functions)
         * Manage and invoke Google Cloud Functions
         * 
         * Category: cloud
         * Since: 3.9
         * Maven coordinates: org.apache.camel:camel-google-functions
         * 
         * Syntax: <code>google-functions:functionName</code>
         * 
         * Path parameter: functionName (required)
         * The user-defined name of the function
         * 
         * @param path functionName
         * @return the dsl builder
         */
        default GoogleCloudFunctionsEndpointBuilder googleFunctions(String path) {
            return GoogleCloudFunctionsEndpointBuilderFactory.endpointBuilder("google-functions", path);
        }
        /**
         * Google Cloud Functions (camel-google-functions)
         * Manage and invoke Google Cloud Functions
         * 
         * Category: cloud
         * Since: 3.9
         * Maven coordinates: org.apache.camel:camel-google-functions
         * 
         * Syntax: <code>google-functions:functionName</code>
         * 
         * Path parameter: functionName (required)
         * The user-defined name of the function
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path functionName
         * @return the dsl builder
         */
        default GoogleCloudFunctionsEndpointBuilder googleFunctions(
                String componentName,
                String path) {
            return GoogleCloudFunctionsEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }
    static GoogleCloudFunctionsEndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class GoogleCloudFunctionsEndpointBuilderImpl extends AbstractEndpointBuilder implements GoogleCloudFunctionsEndpointBuilder, AdvancedGoogleCloudFunctionsEndpointBuilder {
            public GoogleCloudFunctionsEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new GoogleCloudFunctionsEndpointBuilderImpl(path);
    }
}