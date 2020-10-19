package com.cts.stock.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cts.stock.model.Stock;
import com.cts.stock.service.StockService;


@RestController

public class StockController {

	@Autowired
	StockService service;
	
	@GetMapping(value = "/stockList")
	public ResponseEntity<Object> personList()
	{
		
		return new ResponseEntity<>(service.getAllStock(),HttpStatus.OK);
	}
	
	
	@GetMapping(value = "/getStockById/id/{stock_id}")
	public ResponseEntity<Object> personList(@PathVariable("stock_id") Integer stock_id)
	{
		
			Stock s=service.getStockById(stock_id);
			if(s!=null) {
				
				return new ResponseEntity<>(s,HttpStatus.OK);	
			}
			else
			return new ResponseEntity<>("Result Not Found",HttpStatus.OK);
				
	}
	
	
	@GetMapping(value = "/getStockByName/name/{stock_name}")
	public ResponseEntity<Object> personName(@PathVariable("stock_name") String stock_name)
	{
		
			Stock s=service.getStockByName(stock_name);
			if(s!=null) {
				
				return new ResponseEntity<>(s,HttpStatus.OK);	
			}
			else
			return new ResponseEntity<>("Result Not Found",HttpStatus.OK);
				
	}
}
