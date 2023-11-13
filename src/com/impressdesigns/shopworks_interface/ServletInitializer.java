// 
// Decompiled by Procyon v0.5.36
// 

package com.impressdesigns.shopworks_interface;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer
{
    protected SpringApplicationBuilder configure(final SpringApplicationBuilder application) {
        return application.sources(new Class[] { ShopworksInterfaceApplication.class });
    }
}
