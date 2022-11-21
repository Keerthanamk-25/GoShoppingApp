package tns.client;

import tns.application.GSNormalAcc;
import tns.application.GSPrimeAcc;
import tns.application.GSShopFactory;

public class ClientMain {
  
	public static void main(String[] args) {
		GSShopFactory factory=new GSShopFactory();

		System.out.println("Welcome to Goshopping");


		//Creating Normal Account
		
	 GSNormalAcc gsn=(GSNormalAcc) factory.getNewNormalAcc(123,"Keerthana",5000);
		 gsn.bookProduct(gsn.getCharges());
		
		//Creating Prime Account
		GSPrimeAcc gsp=(GSPrimeAcc) factory.getNewPrimeAcc(456, "Santhosh", 7000, true);
		gsp.bookProduct(gsp.getCharges());
		
		System.out.println("Thank You!!!");
		System.out.println("Happy Shopping Visit Again");
		
	}

}
