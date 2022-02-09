package com.seamus.roster.service;

import com.seamus.roster.data.Business;

import java.util.List;

public interface BusinessService {

    Business createBusiness(Business business);

    List<Business> getAllBusiness();

    Business getBusiness(Long id);

    Business updateBusiness(Business business);

    void deleteBusiness(Long id);

}
