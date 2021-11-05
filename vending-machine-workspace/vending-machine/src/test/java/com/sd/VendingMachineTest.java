package com.sd;

public class VendingMachineTest {

	public static void main(String[] args) {
		
		VendingMachine vm = VendingMachineFactory.createVendingMachine();
		
		long pepsiPrice = vm.selectItemAndGetPrice(Item.PEPSI);
		System.out.println(" COKE Price : "+ pepsiPrice);
		
		vm.insertCoin(Coin.QUARTER);
		//vm.insertCoin(Coin.DIME);
		vm.insertCoin(Coin.QUARTER);
		
		try {
			System.out.println(vm.collectItemAndChange());
		}catch(Exception ex) {
			System.out.println(ex.getLocalizedMessage());
		}
		
	}
}
