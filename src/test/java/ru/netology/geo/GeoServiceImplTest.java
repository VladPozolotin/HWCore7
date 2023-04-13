package ru.netology.geo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;
import ru.netology.entity.Location;

import java.util.ArrayList;


class GeoServiceImplTest {
    GeoService geoService;

    static ArrayList<String> ruip = new ArrayList<String>();
    static ArrayList<String> usip = new ArrayList<String>();
    @BeforeAll
    static void init(){
        for (int i = 0; i < 256; i++){
            for (int k = 0; k < 256; k++){
                for (int j = 0; j < 256; j++){
                    ruip.add("172." + i + "."  + j + "." + k);
                }
            }
        }
        for (int m = 0; m < 256; m++){
            for (int n = 0; n < 256; n++){
                for (int p = 0; p < 256; p++){
                    usip.add("96." + m + "."  + n + "." + p);
                }
            }
        }
    }
    @BeforeEach
    void beforeEach(){
        geoService = new GeoServiceImpl();
        }

    @Test
    void byIpRu() {
        for (String ip : ruip) {
            Location loc = geoService.byIp(ip);
            Assertions.assertEquals(Country.RUSSIA, loc.getCountry());
        }
    }
    @Test
    void byIpUs() {
        for (String ip : usip) {
            Location loc = geoService.byIp(ip);
            Assertions.assertEquals(Country.USA, loc.getCountry());
        }
    }
}