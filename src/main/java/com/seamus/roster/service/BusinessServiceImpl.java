package com.seamus.roster.service;

import com.seamus.roster.data.Business;
import com.seamus.roster.repo.BusinessRepo;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class BusinessServiceImpl implements BusinessService {

    @Autowired
    private BusinessRepo businessRepo;

    @Override
    public Business createBusiness(Business business) {
        return businessRepo.save(business);
    }

    @Override
    public List<Business> getAllBusiness() {
        return StreamSupport.stream(businessRepo.findAll().spliterator(), false).collect(Collectors.toList());
    }

    @Override
    public Business getBusiness(Long id) {
        return businessRepo.findById(id).orElse(null);
    }

    @Override
    public Business updateBusiness(Business business) {
        return businessRepo.save(business);
    }

    @Override
    public void deleteBusiness(Long id) {
        businessRepo.deleteById(id);
    }
}
