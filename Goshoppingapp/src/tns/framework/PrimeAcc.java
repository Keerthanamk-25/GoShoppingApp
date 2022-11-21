package tns.framework;

public class PrimeAcc extends ShopAcc {

private boolean isPrime;
private static final float deliveryCharges=0;


public static float getDeliverycharges() {
	return deliveryCharges;
}

public PrimeAcc(int AccNo, String AccNm, float charges,boolean isPrime) {
	super(AccNo, AccNm, charges);
	this.isPrime=isPrime;
}

@Override
public void bookProduct(float charges) {
	// TODO Auto-generated method stub
	
}


public boolean isPrime() {
	return isPrime;
}

public void setPrime(boolean isPrime) {
	this.isPrime = isPrime;
}

@Override
public String toString() {
	return "PrimeAcc [isPrime=" + isPrime + ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm()
			+ ", getCharges()=" + getCharges() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
			+ ", hashCode()=" + hashCode() + "]";
}

}
