/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kaan.schoolmanagementmaven.sms;
import com.twilio.Twilio ;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber ;
/**
 *
 * @author kaan
 * 
 */
public class MessageSendingManager implements IMessageSendingManager{
    private static final String ACCOUNT_SID = "Your Account ID" ;
    private static final String AUTH_TOKEN = "Your Token";
    private final PhoneNumber virtualPhoneNumber ;
    
    private static IMessageSendingManager messageSendingObject ;
    
    private MessageSendingManager () {
        Twilio.init(ACCOUNT_SID , AUTH_TOKEN) ;
        virtualPhoneNumber = new PhoneNumber ("Phone Number") ;
    }
    
    public static IMessageSendingManager getInstance () {
        if (messageSendingObject == null) messageSendingObject = new MessageSendingManager () ;
        return messageSendingObject ; 
    }

    @Override
    public void sendMessage(String destinationPhoneNumber , int code) {
        PhoneNumber destinationNumber = new PhoneNumber (destinationPhoneNumber);
        Message message = Message.creator(destinationNumber, virtualPhoneNumber, Integer.toString(code)).create();
    }  
    
}   
