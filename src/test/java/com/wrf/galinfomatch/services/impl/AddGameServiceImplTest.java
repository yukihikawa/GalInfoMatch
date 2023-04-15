package com.wrf.galinfomatch.services.impl;

import com.wrf.galinfomatch.GalInfoMatchApplication;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = GalInfoMatchApplication.class)
class AddGameServiceImplTest {

    @Autowired
    AddGameServiceImpl addGameService;
    @Test
    void addGame() {
        Map result = addGameService.addGame("0000004", "千恋＊万花", "ゆずソフト", 2016, "千恋＊万花", "SenrenBankaCHS;SenrenBanka");
        System.out.println(result);
        Map result1 = addGameService.addGame(null, "千恋＊万花", "ゆずソフト", 2016, "千恋＊万花", "SenrenBankaCHS;SenrenBanka");
        System.out.println(result1);
        Map result2 = addGameService.addGame("0000005", null, "ゆずソフト", 2016, "千恋＊万花", "SenrenBankaCHS;SenrenBanka");
        System.out.println(result2);
    }
}