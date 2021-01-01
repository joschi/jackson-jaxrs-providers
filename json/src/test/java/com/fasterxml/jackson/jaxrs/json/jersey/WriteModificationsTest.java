package com.fasterxml.jackson.jaxrs.json.jersey;

import jakarta.servlet.Servlet;

import com.fasterxml.jackson.jaxrs.json.dw.WriteModificationsTestBase;

import org.glassfish.jersey.servlet.ServletContainer;

public class WriteModificationsTest extends WriteModificationsTestBase {
    @Override
    protected Class<? extends Servlet> servletContainerClass() { return ServletContainer.class; }
}
