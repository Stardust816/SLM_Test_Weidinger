package com.example.slm_test_weidinger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CapitalController {

    @GetMapping("api/capital/Austria")
    public String Austria(){

        return "Vienna";

    }
}
