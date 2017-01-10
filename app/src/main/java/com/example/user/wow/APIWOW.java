package com.example.user.wow;


import android.net.Uri;

import java.io.IOException;

public class APIWOW {

    private final String BASE_URL = "https://us.api.battle.net/wow/boss/?locale=en_US&apikey=kqqxgdajmjuahyapepfsbvg4aj88qeyw";

    String getInfoBosses(String boss) {
        Uri builtUri = Uri.parse(BASE_URL)
                .buildUpon()
                .build();
        String url = builtUri.toString();

        try {
            String JsonResponse = HttpUtils.get(url);
            return JsonResponse;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
