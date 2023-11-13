// 
// Decompiled by Procyon v0.5.36
// 

package com.impressdesigns.shopworks_interface;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.GetMapping;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.stereotype.Controller;

@Controller
public class OrderController
{
    @GetMapping({ "/orders" })
    @ResponseBody
    public JsonNode getOrder(@RequestParam final int orderNumber) {
        return SQL.getOrder(orderNumber);
    }
}
