package com.sprincioc.ioc.service;

import com.sprincioc.ioc.uitl.SimService;
import com.sprincioc.ioc.uitl.SimServiceType;

public class VodaPhoneService implements SimService {

    public VodaPhoneService(){
        System.out.println("VodaPhoneService No-args Constructor! Called");
    }
    @Override
    public SimServiceType getServiceType () {

        return SimServiceType.VODAPHONE;
    }

    @Override
    public void calling () {
        System.out.println("Calling using Voda-Phone Sim, Dummy Impl");
    }

    @Override
    public void data () {
        System.out.println("Browsing Internet using Voda-Phone Sim, Dummy Impl");
    }
}
