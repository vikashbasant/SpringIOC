package com.sprincioc.ioc.service;

import com.sprincioc.ioc.uitl.SimService;
import com.sprincioc.ioc.uitl.SimServiceType;

public class BSNLService implements SimService {

    public BSNLService() {
        System.out.println("BSNLService No-args Constructor! Called");
    }

    @Override
    public SimServiceType getServiceType() {
        return SimServiceType.BSNL;
    }

    @Override
    public void calling() {
        System.out.println("Calling using BSNL Sim, Dummy Impl");
    }

    @Override
    public void data() {
        System.out.println("Browsing Internet using BSNL Sim, Dummy Impl");
    }
}
