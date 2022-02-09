package com.seamus.roster.controller;

import com.seamus.roster.data.Business;
import com.seamus.roster.service.BusinessService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/business")
@RequiredArgsConstructor
public class BusinessController {

    private final BusinessService businessService;

    @GetMapping
    public ResponseEntity<List<Business>> getAllBusiness() {
        return ResponseEntity.ok(businessService.getAllBusiness());
    }
}
