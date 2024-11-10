package com.example.introductionto.SampleLearning;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
/*
Using above @primary Notation getting
Creating the apple before use
2024-11-10T18:58:51.596+05:30  INFO 8568 --- [SampleLearning] [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port 27 (http) with context path '/'
2024-11-10T18:58:51.607+05:30  INFO 8568 --- [SampleLearning] [           main] c.e.i.S.SampleLearningApplication        : Started SampleLearningApplication in 2.522 seconds (process running for 3.29)
I'm eating the Apple
I'm eating the Apple
2146540595
2146540595
Product Data
this o/p this is tightly coupled here every time we need to do changes
in code on the basis of requirements

 */
@ConditionalOnProperty(name="deploy.env", havingValue = "production")
//Here we need to do changes in application.properties file on the basis of that we can create it
public class ProdDB implements  DB{
    public String getData()
    {
        return  "Product Data";
    }
}
