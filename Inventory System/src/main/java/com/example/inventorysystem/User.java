package com.example.inventorysystem;

import java.util.HashMap;

public class User {

    HashMap<String, String> loginInfo = new HashMap<>();

    void IdAndPassword(){

        loginInfo.put("Patrick Star", "bubbles");
        loginInfo.put("SpongeBob", "patties");
        loginInfo.put("Squidward Tentacles", "octopus");
        loginInfo.put("Plankton", "restaurant");

    }

    protected HashMap getLoginInfo(){
        return loginInfo;
    }
}
