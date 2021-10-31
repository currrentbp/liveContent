package com.currentbp.controller;

import com.currentbp.service.BpBiz;
//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@CrossOrigin
@RequestMapping("/test")
//@Api(tags = "test")
public class BpTestController {
    @Autowired
    private BpBiz bpBiz;


    @GetMapping("/t1")
//    @ApiOperation(value = "t1", notes = "t1")
    public String toyBrandList() {
        return bpBiz.get1();
    }
}
