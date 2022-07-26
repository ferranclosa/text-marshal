package com.example.flatobjets.controller;

import com.example.flatobjets.dto.CustomerEnquiryiDTO;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FrontEndController {

    @ResponseBody
    @PostMapping(value = "/customerQuery", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    private void dealWithQuery (@RequestBody CustomerEnquiryiDTO iDTO){


    }

}
