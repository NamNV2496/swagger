package com.example.swagger.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ExampleController {

    @GetMapping("/test")
    public String testGet() {
        return "get method";
    }

    @PostMapping("/test")
    public String testPost(@RequestParam String param) {
        return "post method" + param;
    }

    @PutMapping("/test")
    public String testPut(@RequestParam String param) {
        return "put method" + param;
    }

    @ApiOperation(value = "getGreeting", nickname = "getGreeting")
    @ApiResponses(value = {
        @ApiResponse(code = 500, message = "Server error"),
        @ApiResponse(code = 200, message = "Successful retrieval",
            response = String.class, responseContainer = "List") })
    @RequestMapping(method = RequestMethod.DELETE, value = "/api/javainuse")
    public List<String> sayHello(@ApiParam(value = "testId",
        required = true, defaultValue = "111")  @PathVariable("id") final int institutuionId) {
        ArrayList<String> arrayList= new ArrayList<>();
        arrayList.add(new String("fđ"));
        return arrayList;
    }
}
