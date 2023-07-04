package com.sprincioc.ioc;

import com.sprincioc.ioc.service.AirtelService;
import com.sprincioc.ioc.service.JioService;
import com.sprincioc.ioc.service.VodaPhoneService;

public class MobileUserApplication {
    public static void main(String[] args){


        // Creating an object of VodaPhoneService Class and use it manually:
        VodaPhoneService vodaPhone = new VodaPhoneService();
        vodaPhone.calling();
        vodaPhone.data();
    }
}

