

package tns.framework;


public interface ShopFactory {
	public  PrimeAcc getNewPrimeAcc(int AccNo, String AccNm, float charges, boolean isPrime);
	public  NormalAcc getNewNormalAcc(int AccNo, String AccNm,float charges);
}
