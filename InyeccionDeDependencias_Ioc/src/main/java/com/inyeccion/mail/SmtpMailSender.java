package com.inyeccion.mail;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class SmtpMailSender implements MailSender{


    private Log Log = LogFactory.getLog(SmtpMailSender.class);

    @Override
    public void send(String to, String subject, String body) {

        Log.info("Sending MOCK mail to " + to);
        Log.info("with subject " + subject);
        Log.info("and body " + body);
    }
}