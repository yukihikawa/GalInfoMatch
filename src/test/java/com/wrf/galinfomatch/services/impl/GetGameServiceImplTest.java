package com.wrf.galinfomatch.services.impl;

import com.wrf.galinfomatch.GalInfoMatchApplication;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;
@RunWith(SpringRunner.class)
@SpringBootTest(classes = GalInfoMatchApplication.class)
class GetGameServiceImplTest {

    @Autowired
    GetGameServiceImpl getGameService;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getGame() {
        System.out.println(getGameService.getGame("0000001"));
    }
}