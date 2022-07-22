package com.example.Details.Controller;

import com.example.Details.Entity.Details;
import com.example.Details.Service.DetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/details")
public class DetailsController {
        @Autowired
        private DetailsService detailsService;

        @PostMapping("/")
        public Details saveDetails(@RequestBody Details details)
        {
            return detailsService.saveDetails(details);
        }

        @GetMapping("/{id}")
        public Details findUserDetailsById(@PathVariable("id") Long userDetailsId){
            return detailsService.findByUserDetailsId(userDetailsId);
        }

    }


