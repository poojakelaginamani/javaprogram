package com.xworkz.market;

import com.xworkz.market.base.SuperMarket;
import com.xworkz.market.online.OnlineMarket;

public class RunnerMarket {
   public static void main(String[] args) {
	SuperMarket market = new SuperMarket();
	market.sell();
	//market.buy();
	OnlineMarket market1 = new OnlineMarket();
	 //market1.sell();
	 market1.buy();
	}
}

