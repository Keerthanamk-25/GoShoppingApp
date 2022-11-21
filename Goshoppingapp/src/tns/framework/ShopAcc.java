

package tns.framework;


public abstract class ShopAcc {
	private int AccNo;
	private String AccNm;
	private float charges;
		
	public int getAccNo() {
		return AccNo;
	}
	
	public String getAccNm() {
		return AccNm;
	}
	public void setAccNm(String accNm) {
		this.AccNm = accNm;
	}
	public float getCharges() {
		return charges;
	}
	
	public abstract void bookProduct(float charges);
	
	public ShopAcc(int accNo, String accNm, float charges) {
		this.AccNo = accNo;
		this.AccNm = accNm;
		this.charges = charges;
	}

	@Override
	public String toString() {
		return "ShopAcc [accNo=" + AccNo + ", accNm=" + AccNm + ", charges=" + charges + ", getAccNo()=" + getAccNo()
				+ ", getAccNm()=" + getAccNm() + ", getCharges()=" + getCharges() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
