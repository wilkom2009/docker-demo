package com.wilkom.dockerdemo.controller;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {

    @GetMapping
    public String hello() {
        InetAddress ip;
        String hostname = "";
        String hostip = "";
        try {
            ip = InetAddress.getLocalHost();
            hostname = ip.getHostName();
            hostip = ip.toString();
        } catch (UnknownHostException e) {

            e.printStackTrace();
        }
        return "<html>Hello dears !!!! <br>" +
                "Your current IP address : " + hostip + "<br>" +
                "Your current Hostname : " + hostname + "<br>"
                + "</html>";
    }
}
