// Originally generated using Moditect maven plugin, last mod 14-Oct-2020
module com.fasterxml.jackson.jaxrs.smile {
    exports com.fasterxml.jackson.jaxrs.smile;
    // [jaxrs-providers#119]: CXF, RESTEasy, OpenAPI require reflective access
    opens com.fasterxml.jackson.jaxrs.smile;

    requires com.fasterxml.jackson.core;
    requires com.fasterxml.jackson.databind;
    requires com.fasterxml.jackson.dataformat.smile;
    requires com.fasterxml.jackson.module.jaxb;

    requires com.fasterxml.jackson.jaxrs.base;

    //jakarta 3.x final location - https://github.com/jboss/jboss-jakarta-jaxrs-api_spec
    requires static jakarta.ws.rs;
    //jakarta 3.x final location - https://github.com/eclipse-ee4j/jaxrs-api
    requires static jakarta.ws.rs.api;

    provides jakarta.ws.rs.ext.MessageBodyReader with
        com.fasterxml.jackson.jaxrs.smile.JacksonSmileProvider;
    provides jakarta.ws.rs.ext.MessageBodyWriter with
        com.fasterxml.jackson.jaxrs.smile.JacksonSmileProvider;
}
