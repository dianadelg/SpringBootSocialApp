package com.example.socialapp.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

/*
 * @RestController tells Spring Boot that this class
 * will handle incoming HTTP requests.
 *
 * Spring will automatically discover this class
 * because it is inside the com.example.socialapp package hierarchy.
 */

@RestController
public class HelloController {

    /*
     * @GetMapping("/hello")
     * - GET is an HTTP method used to retrieve information.
     * - "/hello" is the URL path for this endpoint.
     * - When someone sends GET /hello, Spring calls sayHello().
     *
     * String:
     * - The return type of our method.
     *
     * return:
     * - Sends "Hello World!" back as the HTTP response body.
     */
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello World!";
    }
	
}
