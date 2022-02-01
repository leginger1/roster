package com.seamus.roster.service;

import com.seamus.roster.data.Business;

public interface BusinessService {

    Business createBusiness(Business business);

    Business getBusiness(Long id);

    Business updateBusiness(Business business);

    void deleteBusiness(Long id);

}
