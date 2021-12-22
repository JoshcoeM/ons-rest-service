package com.manifestcorp.onsrestservice.controllers;

import com.manifestcorp.onsrestservice.models.OnsRestModel;
import com.manifestcorp.onsrestservice.repositories.OnsRestRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OnsRestController {
    Logger stick = LoggerFactory.getLogger(OnsRestController.class);

    @Autowired
    OnsRestRepo onsRestRepo;

    @PostMapping("/")
    public void getInfo (@RequestBody OnsRestModel model) {
        stick.info(model.getDistroCenter());
        onsRestRepo.save(model);
    }
}
