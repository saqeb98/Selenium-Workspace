package com.utilityFunction;

import java.io.IOException;

import org.testng.annotations.Test;

import com.smartbear.service.SmartBearCheckOut;
import com.smartbear.service.SmartBearMobileAddToCart;
import com.smartbear.service.SmartBearMobilePage;
import com.smartbear.service.SmartBearProductPage;

public class comsmartbearTC  extends Utiliy_Functions{
	@Test
	public void Tc01() throws IOException
	{
		precndition();
		SmartBearProductPage spp=new SmartBearProductPage(driver);
		spp._clickmobile();
		SmartBearMobilePage smp=new SmartBearMobilePage(driver);
		smp.phoneMinus();
		SmartBearMobileAddToCart sma=new SmartBearMobileAddToCart(driver);
		sma.cartbutton();
		sma.compare();
		
		SmartBearCheckOut sbt=new SmartBearCheckOut();
		sbt.checkout();
				
		postCondition();
		
		
		
	}
}
