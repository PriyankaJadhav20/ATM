package com.example.UserService.Service;

import com.example.UserService.Entitiy.Users;
import com.example.UserService.NewVolume.Details;
import com.example.UserService.NewVolume.ResponseTemplate;
import com.example.UserService.Repository.ApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {

    @Autowired
    private ApplicationRepository applicationRepository;

    @Autowired
    private RestTemplate restTemplate;

    public Users saveUsers(Users users){
        return applicationRepository.save(users);
    }

   public ResponseTemplate getUserWithDetails(Long userId){
        ResponseTemplate responseTemplate = new ResponseTemplate();
        Users users = applicationRepository.findByUserId(userId);

        Details details = restTemplate.getForObject("http://localhost:9092/details/"+ users.getUserDetailsId(), Details.class);

        responseTemplate.setUsers(users);
        responseTemplate.setDetails(details);

        return responseTemplate;
    }

}
