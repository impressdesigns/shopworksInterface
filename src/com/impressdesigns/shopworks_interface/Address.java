// 
// Decompiled by Procyon v0.5.36
// 

package com.impressdesigns.shopworks_interface;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("address")
public class Address
{
    private int order_number;
    private String po_number;
    private String address1;
    private String address2;
    private String company;
    private String email;
    private String city;
    private String state;
    private String zip;
    private String country;
    private String method;
    
    public Address(final int order_number, final String po_number, final String address1, final String address2, final String company, final String email, final String city, final String state, final String zip, final String country, final String method) {
        this.order_number = order_number;
        this.po_number = po_number;
        this.address1 = address1;
        this.address2 = address2;
        this.company = company;
        this.email = email;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.country = country;
        this.method = method;
    }
    
    @JsonProperty("order_number")
    public int getOrder_number() {
        return this.order_number;
    }
    
    public void setOrder_number(final int order_number) {
        this.order_number = order_number;
    }
    
    @JsonProperty("po_number")
    public String getPo_number() {
        return this.po_number;
    }
    
    public void setPo_number(final String po_number) {
        this.po_number = po_number;
    }
    
    @JsonProperty("address1")
    public String getAddress1() {
        return this.address1;
    }
    
    public void setAddress1(final String address1) {
        this.address1 = address1;
    }
    
    @JsonProperty("address2")
    public String getAddress2() {
        return this.address2;
    }
    
    public void setAddress2(final String address2) {
        this.address2 = address2;
    }
    
    @JsonProperty("company")
    public String getCompany() {
        return this.company;
    }
    
    public void setCompany(final String company) {
        this.company = company;
    }
    
    @JsonProperty("email")
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(final String email) {
        this.email = email;
    }
    
    @JsonProperty("city")
    public String getCity() {
        return this.city;
    }
    
    public void setCity(final String city) {
        this.city = city;
    }
    
    @JsonProperty("state")
    public String getState() {
        return this.state;
    }
    
    public void setState(final String state) {
        this.state = state;
    }
    
    @JsonProperty("zipcode")
    public String getZip() {
        return this.zip;
    }
    
    public void setZip(final String zip) {
        this.zip = zip;
    }
    
    @JsonProperty("country")
    public String getCountry() {
        return this.country;
    }
    
    public void setCountry(final String country) {
        this.country = country;
    }
    
    @JsonProperty("method")
    public String getMethod() {
        return this.method;
    }
    
    public void setMethod(final String method) {
        this.method = method;
    }
}
