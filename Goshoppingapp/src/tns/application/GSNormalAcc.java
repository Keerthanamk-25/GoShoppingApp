package tns.application;

import tns.framework.NormalAcc;

public class GSNormalAcc extends NormalAcc {

	public GSNormalAcc(int AccNo, String AccNm, float charges) {
		super(AccNo, AccNm, charges);
		// TODO Auto-generated constructor stub
	}
	
	

	public void bookProduct(float charges)
	{
		System.out.println("Dear Normal User, Your Charges are: "+charges+" with Delivery Charges is: "+getDeliveryCharges());
		System.out.println("Acc No: 123");
		System.out.println("Acc Name: Keerthana");
		System.out.println("Total amount: 5050");
	}

	@Override
	public String toString() {
		return "GSNormalAcc [accNo=" + getAccNo() + ", charges=" + getCharges() + ", deliveryCharges=" +getDeliveryCharges() + "]";
	}

}
