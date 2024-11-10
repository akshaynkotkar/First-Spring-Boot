package com.example.introductionto.SampleLearning;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
    /*
    Here we are creating own using Bean
    we want Custom obj
    so remove @Component from top of the Apple class else it will give us an error

     */
    @Bean
    //@Scope("prototype") //This will give below output creates two separate beans

    /*
    2024-11-10T14:08:57.257+05:30  INFO 21708 --- [SampleLearning] [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 746 ms
Creating the apple before use
Creating the apple before use
2024-11-10T14:08:57.589+05:30  INFO 21708 --- [SampleLearning] [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port 27 (http) with context path '/'
2024-11-10T14:08:57.614+05:30  INFO 21708 --- [SampleLearning] [           main] c.e.i.S.SampleLearningApplication        : Started SampleLearningApplication in 1.479 seconds (process running for 1.926)
I'm eating the Apple
I'm eating the Apple
1841945133
490766432
     */
    @Scope("singleton")//Already By default called but we can also declare it like this
    /*
    Singleton o/p

    Creating the apple before use
2024-11-10T14:10:59.178+05:30  INFO 16500 --- [SampleLearning] [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port 27 (http) with context path '/'
2024-11-10T14:10:59.186+05:30  INFO 16500 --- [SampleLearning] [           main] c.e.i.S.SampleLearningApplication        : Started SampleLearningApplication in 1.429 seconds (process running for 1.841)
I'm eating the Apple
I'm eating the Apple
1016156941
1016156941
     */
    Apple getApple()
    {
        return new Apple();
    }
}
