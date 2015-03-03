package com.nilsonmassarenti.app.currencyfair.dao;

/**
 * Class to Access Data
 * @author nilsonmassarenti - nilsonmassarenti@gmail.com
 * @version 0.1
 * Last update: 03-Mar-2015 12:10 am
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import com.nilsonmassarenti.app.currencyfair.model.CurrencyFair;
import com.nilsonmassarenti.app.currencyfair.utils.ConvertData;

public class DAOCurrencyFair {
	private ArrayList<CurrencyFair> arrayCurrencyFairs = new ArrayList<CurrencyFair>();
	
	/**
	 * This method save all currency fair
	 * @param 		CurrencyFair	It's necessary the class currencyFair
	 * @return 		Boolean			if not exception return true to OK
	 * @exception	IOException
	 */
	public Boolean saveCurrencyFair(CurrencyFair currencyFair) {
		synchronized (this) {
			try {
				File file = new File("cur_saved.txt");
				if (!file.exists()) {
					file.createNewFile();
				}
				FileWriter fileWritter = new FileWriter(file.getName(), true);
				BufferedWriter bufferWritter = new BufferedWriter(fileWritter);
				bufferWritter.write(currencyFair.getUserId() + ";"
						+ currencyFair.getCurrencyFrom() + ";"
						+ currencyFair.getCurrencyTo() + ";"
						+ currencyFair.getAmountSell() + ";"
						+ currencyFair.getAmountBuy() + ";"
						+ currencyFair.getRate() + ";"
						+ currencyFair.getTimePlaced() + ";"
						+ currencyFair.getOriginatingCountry() + "\n");
				bufferWritter.close();
				fileWritter.close();
				return true;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return false;
			}
		}
	}
	
	/**
	 * This method return all currency fair
	 * @return 		Boolean			if not exception return true to OK
	 * @exception	IOException
	 */
	public Boolean readCurrencyFair() {
		arrayCurrencyFairs.clear();
		try {
			ConvertData convertData = new ConvertData();
			FileInputStream fis = new FileInputStream("cur_saved.txt");
			InputStreamReader reader = new InputStreamReader(fis);
			BufferedReader br = new BufferedReader(reader);
			String line;
			line = br.readLine();
			while (line != null) {
				String info[] = line.split(";");
				CurrencyFair currencyFair = new CurrencyFair();
				currencyFair.addCurrencyFair(Integer.parseInt(info[0]),
						info[1], info[2], Double.parseDouble(info[3]),
						Double.parseDouble(info[4]),
						Double.parseDouble(info[5]), info[6], info[7]);
				currencyFair.setNewTimePlaced(convertData.convertDate(info[6]));
				arrayCurrencyFairs.add(currencyFair);
				line = br.readLine();
			}
			br.close();
			reader.close();
			fis.close();
			return true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}

	}

	public ArrayList<CurrencyFair> getArrayCurrencyFairs() {
		return arrayCurrencyFairs;
	}

}
