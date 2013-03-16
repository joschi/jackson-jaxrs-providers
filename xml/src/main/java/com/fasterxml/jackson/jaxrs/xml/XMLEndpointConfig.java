package com.fasterxml.jackson.jaxrs.xml;

import java.lang.annotation.Annotation;

import com.fasterxml.jackson.databind.*;

import com.fasterxml.jackson.jaxrs.base.cfg.EndpointConfigBase;
import com.fasterxml.jackson.jaxrs.xml.annotation.JacksonFeatures;

/**
 * Container class for figuring out annotation-based configuration
 * for JAX-RS end points.
 */
public class XMLEndpointConfig
    extends EndpointConfigBase<XMLEndpointConfig>
{
    /*
    /**********************************************************
    /* Construction
    /**********************************************************
     */

    protected XMLEndpointConfig() { }

    public static XMLEndpointConfig forReading(ObjectMapper mapper, Annotation[] annotations)
    {
        return new XMLEndpointConfig()
            .add(annotations, false)
            .initReader(mapper);
    }

    public static XMLEndpointConfig forWriting(ObjectMapper mapper, Annotation[] annotations)
    {
        XMLEndpointConfig config =  new XMLEndpointConfig();
        return config
            .add(annotations, true)
            .initWriter(mapper)
        ;
    }

    @Override
    protected void addAnnotation(Class<? extends Annotation> type,
            Annotation annotation, boolean forWriting)
    {
        if (type == JacksonFeatures.class) {
            JacksonFeatures feats = (JacksonFeatures) annotation;
            if (forWriting) {
                _serEnable = nullIfEmpty(feats.serializationEnable());
                _serDisable = nullIfEmpty(feats.serializationDisable());
            } else {
                _deserEnable = nullIfEmpty(feats.deserializationEnable());
                _deserDisable = nullIfEmpty(feats.deserializationDisable());
            }
        } else {
            super.addAnnotation(type, annotation, forWriting);
        }
    }
    
    @Override
    public Object modifyBeforeWrite(Object value) {
        // nothing to add
        return value;
    }
}