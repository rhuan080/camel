/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.twilio;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class TwilioEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, ExtendedPropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("apiName", org.apache.camel.component.twilio.internal.TwilioApiName.class);
        map.put("methodName", java.lang.String.class);
        map.put("inBody", java.lang.String.class);
        map.put("sendEmptyMessageWhenIdle", boolean.class);
        map.put("bridgeErrorHandler", boolean.class);
        map.put("exceptionHandler", org.apache.camel.spi.ExceptionHandler.class);
        map.put("exchangePattern", org.apache.camel.ExchangePattern.class);
        map.put("pollStrategy", org.apache.camel.spi.PollingConsumerPollStrategy.class);
        map.put("lazyStartProducer", boolean.class);
        map.put("backoffErrorThreshold", int.class);
        map.put("backoffIdleThreshold", int.class);
        map.put("backoffMultiplier", int.class);
        map.put("delay", long.class);
        map.put("greedy", boolean.class);
        map.put("initialDelay", long.class);
        map.put("repeatCount", long.class);
        map.put("runLoggingLevel", org.apache.camel.LoggingLevel.class);
        map.put("scheduledExecutorService", java.util.concurrent.ScheduledExecutorService.class);
        map.put("scheduler", java.lang.Object.class);
        map.put("schedulerProperties", java.util.Map.class);
        map.put("startScheduler", boolean.class);
        map.put("timeUnit", java.util.concurrent.TimeUnit.class);
        map.put("useFixedDelay", boolean.class);
        ALL_OPTIONS = map;
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        TwilioEndpoint target = (TwilioEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "backofferrorthreshold":
        case "backoffErrorThreshold": target.setBackoffErrorThreshold(property(camelContext, int.class, value)); return true;
        case "backoffidlethreshold":
        case "backoffIdleThreshold": target.setBackoffIdleThreshold(property(camelContext, int.class, value)); return true;
        case "backoffmultiplier":
        case "backoffMultiplier": target.setBackoffMultiplier(property(camelContext, int.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "delay": target.setDelay(property(camelContext, long.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "greedy": target.setGreedy(property(camelContext, boolean.class, value)); return true;
        case "inbody":
        case "inBody": target.setInBody(property(camelContext, java.lang.String.class, value)); return true;
        case "initialdelay":
        case "initialDelay": target.setInitialDelay(property(camelContext, long.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "pollstrategy":
        case "pollStrategy": target.setPollStrategy(property(camelContext, org.apache.camel.spi.PollingConsumerPollStrategy.class, value)); return true;
        case "repeatcount":
        case "repeatCount": target.setRepeatCount(property(camelContext, long.class, value)); return true;
        case "runlogginglevel":
        case "runLoggingLevel": target.setRunLoggingLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "scheduledexecutorservice":
        case "scheduledExecutorService": target.setScheduledExecutorService(property(camelContext, java.util.concurrent.ScheduledExecutorService.class, value)); return true;
        case "scheduler": target.setScheduler(property(camelContext, java.lang.Object.class, value)); return true;
        case "schedulerproperties":
        case "schedulerProperties": target.setSchedulerProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "sendemptymessagewhenidle":
        case "sendEmptyMessageWhenIdle": target.setSendEmptyMessageWhenIdle(property(camelContext, boolean.class, value)); return true;
        case "startscheduler":
        case "startScheduler": target.setStartScheduler(property(camelContext, boolean.class, value)); return true;
        case "timeunit":
        case "timeUnit": target.setTimeUnit(property(camelContext, java.util.concurrent.TimeUnit.class, value)); return true;
        case "usefixeddelay":
        case "useFixedDelay": target.setUseFixedDelay(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        return ALL_OPTIONS;
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "backofferrorthreshold":
        case "backoffErrorThreshold": return int.class;
        case "backoffidlethreshold":
        case "backoffIdleThreshold": return int.class;
        case "backoffmultiplier":
        case "backoffMultiplier": return int.class;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return boolean.class;
        case "delay": return long.class;
        case "exceptionhandler":
        case "exceptionHandler": return org.apache.camel.spi.ExceptionHandler.class;
        case "exchangepattern":
        case "exchangePattern": return org.apache.camel.ExchangePattern.class;
        case "greedy": return boolean.class;
        case "inbody":
        case "inBody": return java.lang.String.class;
        case "initialdelay":
        case "initialDelay": return long.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "pollstrategy":
        case "pollStrategy": return org.apache.camel.spi.PollingConsumerPollStrategy.class;
        case "repeatcount":
        case "repeatCount": return long.class;
        case "runlogginglevel":
        case "runLoggingLevel": return org.apache.camel.LoggingLevel.class;
        case "scheduledexecutorservice":
        case "scheduledExecutorService": return java.util.concurrent.ScheduledExecutorService.class;
        case "scheduler": return java.lang.Object.class;
        case "schedulerproperties":
        case "schedulerProperties": return java.util.Map.class;
        case "sendemptymessagewhenidle":
        case "sendEmptyMessageWhenIdle": return boolean.class;
        case "startscheduler":
        case "startScheduler": return boolean.class;
        case "timeunit":
        case "timeUnit": return java.util.concurrent.TimeUnit.class;
        case "usefixeddelay":
        case "useFixedDelay": return boolean.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        TwilioEndpoint target = (TwilioEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "backofferrorthreshold":
        case "backoffErrorThreshold": return target.getBackoffErrorThreshold();
        case "backoffidlethreshold":
        case "backoffIdleThreshold": return target.getBackoffIdleThreshold();
        case "backoffmultiplier":
        case "backoffMultiplier": return target.getBackoffMultiplier();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "delay": return target.getDelay();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "greedy": return target.isGreedy();
        case "inbody":
        case "inBody": return target.getInBody();
        case "initialdelay":
        case "initialDelay": return target.getInitialDelay();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "pollstrategy":
        case "pollStrategy": return target.getPollStrategy();
        case "repeatcount":
        case "repeatCount": return target.getRepeatCount();
        case "runlogginglevel":
        case "runLoggingLevel": return target.getRunLoggingLevel();
        case "scheduledexecutorservice":
        case "scheduledExecutorService": return target.getScheduledExecutorService();
        case "scheduler": return target.getScheduler();
        case "schedulerproperties":
        case "schedulerProperties": return target.getSchedulerProperties();
        case "sendemptymessagewhenidle":
        case "sendEmptyMessageWhenIdle": return target.isSendEmptyMessageWhenIdle();
        case "startscheduler":
        case "startScheduler": return target.isStartScheduler();
        case "timeunit":
        case "timeUnit": return target.getTimeUnit();
        case "usefixeddelay":
        case "useFixedDelay": return target.isUseFixedDelay();
        default: return null;
        }
    }

    @Override
    public Object getCollectionValueType(Object target, String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "schedulerproperties":
        case "schedulerProperties": return java.lang.Object.class;
        default: return null;
        }
    }
}

