package com.deliver.bank.admin.bankadmin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeignService {
    private final TestFeign testFeign;

    @Autowired
    public FeignService(TestFeign testFeign) {
        this.testFeign = testFeign;
    }

    public List<Post> getPosts() {
        return testFeign.getPosts();
    }
}
