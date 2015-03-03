package com.nilsonmassarenti.app.currencyfair.controller;

/**
 * Class to control Trades
 * @author nilsonmassarenti - nilsonmassarenti@gmail.com
 * @version 0.1
 * Last update: 03-Mar-2015 12:10 am
 */

import java.util.ArrayList;

import com.nilsonmassarenti.app.currencyfair.dao.DAOCurrencyFair;
import com.nilsonmassarenti.app.currencyfair.model.CurrencyFair;

public class ControllerCurrencyFair {
	
	private DAOCurrencyFair daoCurrencyFair = new DAOCurrencyFair();

	public String addCurrencyFair(CurrencyFair currencyFair){
		
		//save the information in file
		if (daoCurrencyFair.saveCurrencyFair(currencyFair)) {
			return "Success to save file";
		} else {
			return "Error to save file";
		}
	}
	
	public ArrayList<CurrencyFair> readCurrencyFair(){
		if (daoCurrencyFair.readCurrencyFair()) {
			return daoCurrencyFair.getArrayCurrencyFairs();
		} else {
			return null;
		}
	}
}
