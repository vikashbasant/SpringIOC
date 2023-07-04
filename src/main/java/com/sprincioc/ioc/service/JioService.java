package com.sprincioc.ioc.service;

import com.sprincioc.ioc.uitl.SimService;
import com.sprincioc.ioc.uitl.SimServiceType;
import org.springframework.stereotype.Service;


public class JioService implements SimService {
    @Override
    public SimServiceType getServiceType () {
        return SimServiceType.JIO;
    }

    @Override
    public void calling () {
        System.out.println("Calling using Jio Sim, Dummy Impl");
    }

    @Override
    public void data () {
        System.out.println("Browsing Internet using Jio Sim, Dummy Impl");
    }
}
