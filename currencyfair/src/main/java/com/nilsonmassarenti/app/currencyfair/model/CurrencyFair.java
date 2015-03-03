package com.nilsonmassarenti.app.currencyfair.model;

/**
 * This class is model to information of system.
 * @author nilsonmassarenti - nilsonmassarenti@gmail.com
 * @version 0.1
 * Last update: 03-Mar-2015 12:20 am
 */

import java.util.Date;

public class CurrencyFair {
	private Integer userId;
	private String currencyFrom;
	private String currencyTo;
	private Double amountSell;
	private Double amountBuy;
	private Double rate;
	private String timePlaced;
	private String originatingCountry;
	private Date newTimePlaced;

	/**
	 * This method to create Class
	 */
	public void addCurrencyFair(Integer userId, String currencyFrom,
			String currencyTo, Double amountSell, Double amountBuy,
			Double rate, String timePlaced, String originatingCountry) {
		this.userId = userId;
		this.currencyFrom = currencyFrom;
		this.currencyTo = currencyTo;
		this.amountSell = amountSell;
		this.amountBuy = amountBuy;
		this.rate = rate;
		this.timePlaced = timePlaced;
		this.originatingCountry = originatingCountry;
	}

	public Integer getUserId() {
		return userId;
	}

	public String getCurrencyFrom() {
		return currencyFrom;
	}

	public String getCurrencyTo() {
		return currencyTo;
	}

	public Double getAmountSell() {
		return amountSell;
	}

	public Double getAmountBuy() {
		return amountBuy;
	}

	public Double getRate() {
		return rate;
	}

	public String getTimePlaced() {
		return timePlaced;
	}

	public String getOriginatingCountry() {
		return originatingCountry;
	}

	public Date getNewTimePlaced() {
		return newTimePlaced;
	}

	public void setNewTimePlaced(Date newTimePlaced) {
		this.newTimePlaced = newTimePlaced;
	}

}
