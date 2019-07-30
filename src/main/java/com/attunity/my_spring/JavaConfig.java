package com.attunity.my_spring;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Evgeny Borisov
 */
public class JavaConfig implements Config {

    private Map<Class, Class> ifc2Class = new HashMap<>();
    private String pacakgesNames;

    public JavaConfig(String pacakgesNames) {
        this.pacakgesNames = pacakgesNames;
        ifc2Class.put(Speaker.class, ConsoleSpeaker.class);
        ifc2Class.put(Cleaner.class, CleanerImpl.class);
    }



    @Override
    public <T> Class<T> getImplClass(Class<T> type) {
        return ifc2Class.get(type);
    }

    @Override
    public String getPackagesToScan() {
        return pacakgesNames;
    }
}
