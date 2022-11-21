package tns.application;

import tns.framework.NormalAcc;
import tns.framework.PrimeAcc;
import tns.framework.ShopFactory;

public class GSShopFactory implements ShopFactory {
    PrimeAcc acc1;
    NormalAcc acc2;
	@Override
	public PrimeAcc getNewPrimeAcc(int AccNo, String AccNm, float charges, boolean isPrime) {
		acc1=new GSPrimeAcc(AccNo, AccNm, charges, isPrime);
		return acc1;
	}

	@Override
	public NormalAcc getNewNormalAcc(int AccNo, String AccNm, float charges) {
		acc2=new GSNormalAcc(AccNo, AccNm, charges);
		return acc2;
	}

}
