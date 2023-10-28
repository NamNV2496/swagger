package com.example.swagger.controller;

import com.example.swagger.dto.RequestDTO;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import javax.websocket.server.PathParam;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class ExampleController {


    @GetMapping("/test")
    public String testGet2() {
        return "get method";
    }

    @GetMapping("/test/{id}/item")
    public String testGet(@PathParam("id") Integer id) {
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

    @PutMapping("/test/{id}")
    public String testUpdateData(@PathParam("id") Integer id, @RequestBody RequestDTO request) {
        return "put method";
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
