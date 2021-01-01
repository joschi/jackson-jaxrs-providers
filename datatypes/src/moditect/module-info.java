// Originally generated using Moditect maven plugin, last mod 14-Oct-2020
module com.fasterxml.jackson.datatype.jaxrs {
    exports com.fasterxml.jackson.datatype.jaxrs;

    requires com.fasterxml.jackson.core;
    requires com.fasterxml.jackson.databind;

    //jakarta 3.x final location - https://github.com/jboss/jboss-jakarta-jaxrs-api_spec
    requires static jakarta.ws.rs;
    //jakarta 3.x final location - https://github.com/eclipse-ee4j/jaxrs-api
    requires static jakarta.ws.rs.api;

    provides com.fasterxml.jackson.databind.Module with
        com.fasterxml.jackson.datatype.jaxrs.Jaxrs2TypesModule;
}
