// 
// Decompiled by Procyon v0.5.36
// 

package com.impressdesigns.shopworks_interface;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("order")
public class Order
{
    private int machine_number;
    private int order_number;
    private int design_number;
    private int number_of_colors;
    private int quantity;
    private String location;
    
    Order(final int machine_number, final int order_number, final int design_number, final int number_of_colors, final int quantity, final String location) {
        this.machine_number = machine_number;
        this.order_number = order_number;
        this.design_number = design_number;
        this.number_of_colors = number_of_colors;
        this.quantity = quantity;
        this.location = location;
    }
    
    @JsonProperty("machine_number")
    public int getMachine_number() {
        return this.machine_number;
    }
    
    @JsonProperty("order_number")
    public int getOrder_number() {
        return this.order_number;
    }
    
    @JsonProperty("design_number")
    public int getDesign_number() {
        return this.design_number;
    }
    
    @JsonProperty("number_of_colors")
    public int getNumber_of_colors() {
        return this.number_of_colors;
    }
    
    @JsonProperty("quantity")
    public int getQuantity() {
        return this.quantity;
    }
    
    @JsonProperty("location")
    public String getLocation() {
        return this.location;
    }
}
