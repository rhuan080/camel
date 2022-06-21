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
 * Manage Google Secret Manager Secrets
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface GoogleSecretManagerEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Google Secret Manager component.
     */
    public interface GoogleSecretManagerEndpointBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedGoogleSecretManagerEndpointBuilder advanced() {
            return (AdvancedGoogleSecretManagerEndpointBuilder) this;
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
        default GoogleSecretManagerEndpointBuilder serviceAccountKey(
                String serviceAccountKey) {
            doSetProperty("serviceAccountKey", serviceAccountKey);
            return this;
        }
        /**
         * The operation to perform on the producer.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.google.secret.manager.GoogleSecretManagerOperations&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param operation the value to set
         * @return the dsl builder
         */
        default GoogleSecretManagerEndpointBuilder operation(
                org.apache.camel.component.google.secret.manager.GoogleSecretManagerOperations operation) {
            doSetProperty("operation", operation);
            return this;
        }
        /**
         * The operation to perform on the producer.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.component.google.secret.manager.GoogleSecretManagerOperations&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param operation the value to set
         * @return the dsl builder
         */
        default GoogleSecretManagerEndpointBuilder operation(String operation) {
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
        default GoogleSecretManagerEndpointBuilder pojoRequest(
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
        default GoogleSecretManagerEndpointBuilder pojoRequest(
                String pojoRequest) {
            doSetProperty("pojoRequest", pojoRequest);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Google Secret Manager component.
     */
    public interface AdvancedGoogleSecretManagerEndpointBuilder
            extends
                EndpointProducerBuilder {
        default GoogleSecretManagerEndpointBuilder basic() {
            return (GoogleSecretManagerEndpointBuilder) this;
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
        default AdvancedGoogleSecretManagerEndpointBuilder lazyStartProducer(
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
        default AdvancedGoogleSecretManagerEndpointBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * The client to use during service invocation.
         * 
         * The option is a:
         * &lt;code&gt;com.google.cloud.secretmanager.v1.SecretManagerServiceClient&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param client the value to set
         * @return the dsl builder
         */
        default AdvancedGoogleSecretManagerEndpointBuilder client(
                com.google.cloud.secretmanager.v1.SecretManagerServiceClient client) {
            doSetProperty("client", client);
            return this;
        }
        /**
         * The client to use during service invocation.
         * 
         * The option will be converted to a
         * &lt;code&gt;com.google.cloud.secretmanager.v1.SecretManagerServiceClient&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param client the value to set
         * @return the dsl builder
         */
        default AdvancedGoogleSecretManagerEndpointBuilder client(String client) {
            doSetProperty("client", client);
            return this;
        }
    }

    public interface GoogleSecretManagerBuilders {
        /**
         * Google Secret Manager (camel-google-secret-manager)
         * Manage Google Secret Manager Secrets
         * 
         * Category: cloud
         * Since: 3.16
         * Maven coordinates: org.apache.camel:camel-google-secret-manager
         * 
         * Syntax: <code>google-secret-manager:project</code>
         * 
         * Path parameter: project (required)
         * The Google Cloud Project Id name related to the Secret Manager
         * 
         * @param path project
         * @return the dsl builder
         */
        default GoogleSecretManagerEndpointBuilder googleSecretManager(
                String path) {
            return GoogleSecretManagerEndpointBuilderFactory.endpointBuilder("google-secret-manager", path);
        }
        /**
         * Google Secret Manager (camel-google-secret-manager)
         * Manage Google Secret Manager Secrets
         * 
         * Category: cloud
         * Since: 3.16
         * Maven coordinates: org.apache.camel:camel-google-secret-manager
         * 
         * Syntax: <code>google-secret-manager:project</code>
         * 
         * Path parameter: project (required)
         * The Google Cloud Project Id name related to the Secret Manager
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path project
         * @return the dsl builder
         */
        default GoogleSecretManagerEndpointBuilder googleSecretManager(
                String componentName,
                String path) {
            return GoogleSecretManagerEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }
    static GoogleSecretManagerEndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class GoogleSecretManagerEndpointBuilderImpl extends AbstractEndpointBuilder implements GoogleSecretManagerEndpointBuilder, AdvancedGoogleSecretManagerEndpointBuilder {
            public GoogleSecretManagerEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new GoogleSecretManagerEndpointBuilderImpl(path);
    }
}