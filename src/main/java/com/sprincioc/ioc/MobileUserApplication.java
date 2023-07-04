package com.sprincioc.ioc;

import com.sprincioc.ioc.service.AirtelService;
import com.sprincioc.ioc.service.JioService;
import com.sprincioc.ioc.service.VodaPhoneService;
import com.sprincioc.ioc.uitl.SimService;

public class MobileUserApplication {
    public static void main(String[] args){


        // Creating an object of VodaPhoneService Class and store into SimService Interface Reference and then call
        // the functionality of Voda-Phone Class:
        SimService simService = new VodaPhoneService();
        simService.calling();
        simService.data();
    }
}

