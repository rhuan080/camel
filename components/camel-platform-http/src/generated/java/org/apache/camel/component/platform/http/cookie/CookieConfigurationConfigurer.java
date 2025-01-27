/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.platform.http.cookie;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.component.platform.http.cookie.CookieConfiguration;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class CookieConfigurationConfigurer extends org.apache.camel.support.component.PropertyConfigurerSupport implements GeneratedPropertyConfigurer, ExtendedPropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("CookieDomain", java.lang.String.class);
        map.put("CookieHttpOnly", boolean.class);
        map.put("CookieMaxAge", java.lang.Long.class);
        map.put("CookiePath", java.lang.String.class);
        map.put("CookieSameSite", org.apache.camel.component.platform.http.cookie.CookieConfiguration.CookieSameSite.class);
        map.put("CookieSecure", boolean.class);
        ALL_OPTIONS = map;
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        org.apache.camel.component.platform.http.cookie.CookieConfiguration target = (org.apache.camel.component.platform.http.cookie.CookieConfiguration) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "cookiedomain":
        case "CookieDomain": target.setCookieDomain(property(camelContext, java.lang.String.class, value)); return true;
        case "cookiehttponly":
        case "CookieHttpOnly": target.setCookieHttpOnly(property(camelContext, boolean.class, value)); return true;
        case "cookiemaxage":
        case "CookieMaxAge": target.setCookieMaxAge(property(camelContext, java.lang.Long.class, value)); return true;
        case "cookiepath":
        case "CookiePath": target.setCookiePath(property(camelContext, java.lang.String.class, value)); return true;
        case "cookiesamesite":
        case "CookieSameSite": target.setCookieSameSite(property(camelContext, org.apache.camel.component.platform.http.cookie.CookieConfiguration.CookieSameSite.class, value)); return true;
        case "cookiesecure":
        case "CookieSecure": target.setCookieSecure(property(camelContext, boolean.class, value)); return true;
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
        case "cookiedomain":
        case "CookieDomain": return java.lang.String.class;
        case "cookiehttponly":
        case "CookieHttpOnly": return boolean.class;
        case "cookiemaxage":
        case "CookieMaxAge": return java.lang.Long.class;
        case "cookiepath":
        case "CookiePath": return java.lang.String.class;
        case "cookiesamesite":
        case "CookieSameSite": return org.apache.camel.component.platform.http.cookie.CookieConfiguration.CookieSameSite.class;
        case "cookiesecure":
        case "CookieSecure": return boolean.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        org.apache.camel.component.platform.http.cookie.CookieConfiguration target = (org.apache.camel.component.platform.http.cookie.CookieConfiguration) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "cookiedomain":
        case "CookieDomain": return target.getCookieDomain();
        case "cookiehttponly":
        case "CookieHttpOnly": return target.isCookieHttpOnly();
        case "cookiemaxage":
        case "CookieMaxAge": return target.getCookieMaxAge();
        case "cookiepath":
        case "CookiePath": return target.getCookiePath();
        case "cookiesamesite":
        case "CookieSameSite": return target.getCookieSameSite();
        case "cookiesecure":
        case "CookieSecure": return target.isCookieSecure();
        default: return null;
        }
    }
}

