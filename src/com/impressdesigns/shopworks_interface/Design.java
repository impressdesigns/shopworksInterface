// 
// Decompiled by Procyon v0.5.36
// 

package com.impressdesigns.shopworks_interface;

import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("design")
public class Design
{
    private String companyName;
    
    Design(final String company_name) {
        this.companyName = company_name;
    }
    
    public String getCompanyName() {
        return this.companyName;
    }
    
    public void setCompanyName(final String companyName) {
        this.companyName = companyName;
    }
}
