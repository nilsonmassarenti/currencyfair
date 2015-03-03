package com.nilsonmassarenti.app.currencyfair;

/**
 * Class to start the application
 * @author nilsonmassarenti - nilsonmassarenti@gmail.com
 * @version 0.1
 * Last update: 03-Mar-2015 12:10 am
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class App 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(App.class, args);
    }
}
