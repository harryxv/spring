# jerseytutorial
Jersey: JAX-RS implementation. 
JAX-RS: Java API for developing RESTful web services. It defines interfaces and annotations to expose resources and methods to visit resources. 
Resources: @Path
Methods: @GET @PUT @POST...

we need a jersey customized servlet to handle requests. 
    <servlet>
        <servlet-name>jersey-serlvet</servlet-name>
        <servlet-class>
            com.sun.jersey.spi.container.servlet.ServletContainer
        </servlet-class>
        <init-param>
            <param-name>com.sun.jersey.config.property.packages</param-name>
            <param-value>com.harrywork</param-value>
        </init-param>
        <load-on-startup>1</load-on-startup>
    </servlet>

    <servlet-mapping>
        <servlet-name>jersey-serlvet</servlet-name>
        <url-pattern>/rest/*</url-pattern>
        <!--example: rest/hello/harry-->
    </servlet-mapping>

we need servlet container, for example, tomcat to run this web app. 
