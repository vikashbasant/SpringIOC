package com.sprincioc.ioc.service;

import com.sprincioc.ioc.uitl.SimService;
import com.sprincioc.ioc.uitl.SimServiceType;

public class AirtelService implements SimService {
    @Override
    public SimServiceType getServiceType () {
        return SimServiceType.AIRTEL;
    }

    @Override
    public void calling () {
        System.out.println("Calling using Airtel Sim, Dummy Impl");
    }

    @Override
    public void data () {
        System.out.println("Browsing Internet using Aritel Sim, Dummy Impl");
    }
}
