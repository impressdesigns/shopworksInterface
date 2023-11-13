// 
// Decompiled by Procyon v0.5.36
// 

package com.impressdesigns.shopworks_interface;

import java.sql.ResultSet;
import java.sql.Statement;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.util.ArrayList;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Connection;

class SQL
{
    private SQL() {
    }
    
    private static Connection connect() {
        Connection connection = null;
        try {
            Class.forName("com.filemaker.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:filemaker://192.168.10.6/Data_ODBCMapping", "extro", "extro");
        }
        catch (ClassNotFoundException | SQLException ex2) {
            final Exception ex;
            final Exception e = ex;
            System.out.println(e);
        }
        return connection;
    }
    
    static JsonNode getOrder(final int orderNumber) {
        final ObjectMapper mapper = new ObjectMapper();
        final ObjectNode node = mapper.createObjectNode();
        try {
            final Statement stmt = connect().createStatement();
            try {
                final ResultSet rs = stmt.executeQuery(invokedynamic(makeConcatWithConstants:(I)Ljava/lang/String;, orderNumber));
                final ArrayList<Order> orders = new ArrayList<Order>();
                while (rs.next()) {
                    orders.add(new Order(rs.getInt(4), rs.getInt(1), rs.getInt(3), rs.getInt(2), rs.getInt(6), rs.getString(5)));
                }
                node.putPOJO("orders", (Object)orders);
                if (stmt != null) {
                    stmt.close();
                }
            }
            catch (Throwable t) {
                if (stmt != null) {
                    try {
                        stmt.close();
                    }
                    catch (Throwable exception) {
                        t.addSuppressed(exception);
                    }
                }
                throw t;
            }
        }
        catch (SQLException sqle) {
            System.out.println(sqle);
        }
        return (JsonNode)node;
    }
    
    static JsonNode getAddress(final int orderNumber) {
        final ObjectMapper mapper = new ObjectMapper();
        final ObjectNode node = mapper.createObjectNode();
        try {
            final Statement stmt = connect().createStatement();
            try {
                final ResultSet rs = stmt.executeQuery(invokedynamic(makeConcatWithConstants:(I)Ljava/lang/String;, orderNumber));
                final ArrayList<Address> addresses = new ArrayList<Address>();
                while (rs.next()) {
                    addresses.add(new Address(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11)));
                }
                node.putPOJO("addresses", (Object)addresses);
                if (stmt != null) {
                    stmt.close();
                }
            }
            catch (Throwable t) {
                if (stmt != null) {
                    try {
                        stmt.close();
                    }
                    catch (Throwable exception) {
                        t.addSuppressed(exception);
                    }
                }
                throw t;
            }
        }
        catch (SQLException sqle) {
            System.out.println(sqle);
        }
        return (JsonNode)node;
    }
    
    static JsonNode getCompanyName(final int designNumber) {
        final ObjectMapper mapper = new ObjectMapper();
        final ObjectNode node = mapper.createObjectNode();
        try {
            final Statement stmt = connect().createStatement();
            try {
                final ResultSet rs = stmt.executeQuery(invokedynamic(makeConcatWithConstants:(I)Ljava/lang/String;, designNumber));
                final ArrayList<Design> designs = new ArrayList<Design>();
                while (rs.next()) {
                    designs.add(new Design(rs.getString(1)));
                }
                node.putPOJO("designs", (Object)designs);
                if (stmt != null) {
                    stmt.close();
                }
            }
            catch (Throwable t) {
                if (stmt != null) {
                    try {
                        stmt.close();
                    }
                    catch (Throwable exception) {
                        t.addSuppressed(exception);
                    }
                }
                throw t;
            }
        }
        catch (SQLException sqle) {
            System.out.println(sqle);
        }
        return (JsonNode)node;
    }
}
