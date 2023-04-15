package com.wrf.galinfomatch.services;

import java.util.Map;

/**
 * @program: GalInfoMatch
 * @description:
 * @author: Rifu Wu
 * @create: 2023-04-10 11:28
 **/
public interface AddGameService {
    public Map<String, String> addGame(String uuid, String name, String company, int years, String folderName, String exeName);
}
