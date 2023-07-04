package com.sprincioc.ioc.service;

import com.sprincioc.ioc.uitl.SimService;
import com.sprincioc.ioc.uitl.SimServiceType;
import org.springframework.stereotype.Service;


public class VodaPhoneService implements SimService {
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
