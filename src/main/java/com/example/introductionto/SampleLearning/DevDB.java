package com.example.introductionto.SampleLearning;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name="deploy.env",havingValue ="development")
//@Primary
/*
This @Primary in this file gives below o/p used @Primary in DevDB instead of ProdDB
Creating the apple before use
2024-11-10T19:01:14.871+05:30  INFO 21068 --- [SampleLearning] [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port 27 (http) with context path '/'
2024-11-10T19:01:14.883+05:30  INFO 21068 --- [SampleLearning] [           main] c.e.i.S.SampleLearningApplication        : Started SampleLearningApplication in 2.498 seconds (process running for 3.275)
I'm eating the Apple
I'm eating the Apple
2099541600
2099541600
Dev Data
 */
public class DevDB implements  DB {
    public  String getData()
    {
        return "Dev Data";
    }
}
