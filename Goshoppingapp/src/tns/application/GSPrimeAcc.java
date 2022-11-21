package tns.application;

import tns.framework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc {

	
	public GSPrimeAcc(int AccNo, String AccNm, float charges, boolean isPrime) {
		super(AccNo, AccNm, charges, isPrime);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void bookProduct(float charges) {
		System.out.println("Dear Prime User, Your Product Charges are: "+getCharges()+" with Delivery Charges:" +getDeliverycharges());	
		//System.out.println("Dear Prime User, Your Product Charges are: "+getDeliverycharges());	
		System.out.println("Acc No: 456");
		System.out.println("Acc Name: Santhosh");
		System.out.println("Total amount: 7000");
	}

	@Override
	public String toString() {
		return "GSPrimeAcc [getCharges()=" + getCharges() + ", toString()=" + super.toString() + ", isPrime()="
				+ isPrime() + ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}


}
