package com.sprincioc.ioc.uitl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.EnumMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

@Service
public class SimServiceFactory {

    // Final Variable:
    private final Map<SimServiceType, SimService> serviceMap = new EnumMap<>(SimServiceType.class);

    // Parameterized Constructor:
    @Autowired
    public SimServiceFactory (Set<SimService> actionSet) {
        actionSet.forEach(this::createAction);
    }

    // Instance Method:
    private void createAction(SimService service) {
        serviceMap.put(service.getServiceType(), service);
    }

    // Instance Method:
    public SimService getService(SimServiceType type) {
        return Optional.ofNullable(serviceMap.get(type)).orElseThrow(() -> new RuntimeException("Action (" + type +
                ") is not implemented yet"));
    }
}

