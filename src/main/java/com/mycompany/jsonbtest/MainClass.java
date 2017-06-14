/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jsonbtest;

import java.util.concurrent.CompletionStage;
import javax.json.Json;
import javax.json.JsonBuilderFactory;
import javax.json.JsonObjectBuilder;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.Response;

/**
 *
 * @author ahsharma
 */
public class MainClass {

    public static void main(String[] args) {
        NewJerseyClient client = new NewJerseyClient();
        System.out.println(client.getXml());
    }
}
