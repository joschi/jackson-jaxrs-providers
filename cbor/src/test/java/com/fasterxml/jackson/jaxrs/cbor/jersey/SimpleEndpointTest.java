package com.fasterxml.jackson.jaxrs.cbor.jersey;

import jakarta.servlet.Servlet;

import com.fasterxml.jackson.jaxrs.cbor.dw.SimpleEndpointTestBase;

import org.glassfish.jersey.servlet.ServletContainer;

public class SimpleEndpointTest extends SimpleEndpointTestBase {
    @Override
    protected Class<? extends Servlet> servletContainerClass() { return ServletContainer.class; }
}
