package com.example.Details.Service;

import com.example.Details.Entity.Details;
import com.example.Details.Repository.DetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
//@EnableJpaRepositories
public class DetailsService {

    @Autowired
    private DetailsRepository detailsRepository;

    public Details saveDetails(Details details) {
        return detailsRepository.save(details);
    }

    public Details findByUserDetailsId(Long userDetailsId) {
        return detailsRepository.findByUserDetailsId(userDetailsId);
    }



}
