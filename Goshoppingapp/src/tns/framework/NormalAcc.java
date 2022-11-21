package tns.framework;

public class NormalAcc extends ShopAcc{
	
	
	private final float  deliveryCharges=50;
	 
	
	public NormalAcc(int AccNo, String AccNm, float charges) {
		super(AccNo, AccNm, charges);
	}

	public float getDeliveryCharges() {
		return deliveryCharges;
		
	}

	@Override
	public void bookProduct(float charges) {
	
	}

}
