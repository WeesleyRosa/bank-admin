package com.deliver.bank.admin.bankadmin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FeignController {

    private FeignService feignService;

    @Autowired
    public FeignController(FeignService feignService){
        this.feignService = feignService;
    }

    @GetMapping("/posts")
    public ResponseEntity<List<Post>> checkUserEligibility() {
        return ResponseEntity.ok(feignService.getPosts());
    }
}
