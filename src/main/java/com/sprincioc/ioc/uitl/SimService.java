package com.sprincioc.ioc.uitl;

public interface SimService {

    SimServiceType getServiceType ();

    // =>> Sim have two features like calling and browsing internet:
    void calling();

    void data();

}

