package com.nilsonmassarenti.app.currencyfair.view;

/**
 * This class is responsable to Rest of application
 * @author nilsonmassarenti - nilsonmassarenti@gmail.com
 * @version 0.1
 * Last update: 03-Mar-2015 12:20 am
 */

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.nilsonmassarenti.app.currencyfair.controller.ControllerCurrencyFair;
import com.nilsonmassarenti.app.currencyfair.model.CurrencyFair;
import com.nilsonmassarenti.app.currencyfair.model.CurrencyFairURI;

@RestController
public class ViewRestCurrencyFair {
	private ControllerCurrencyFair controllerCurrencyFair = new ControllerCurrencyFair();
	
	@RequestMapping(value = CurrencyFairURI.CREATE_CURRENCY_FAIR)
	public @ResponseBody String saveCurrencyFair(@RequestBody CurrencyFair currencyFair){
		return this.controllerCurrencyFair.addCurrencyFair(currencyFair);
	}
	
	@RequestMapping(value = CurrencyFairURI.GET_ALL_CURRENCY_FAIR)
	public @ResponseBody ArrayList<CurrencyFair> readCurrencyFair(){
		return this.controllerCurrencyFair.readCurrencyFair();
	}

}
