package Machine;

public class Machine {
	// 클래스 설계시 데이터 타입 결정 X
	// 사용자가 결정
	private DrinkVO[] allMenu;
	private int money;
	private int[] coins;

	public Machine(DrinkVO[] allMenu) {
		this.allMenu = allMenu;
	}

	public void showMenu() {
		for (int i = 0; i < allMenu.length; i++) {
			System.out.println((i + 1) + ". " + allMenu[i].getName() + " / " + allMenu[i].getStock() + " 개 "
					+ allMenu[i].getPrice() + "원");
		}
	}

	public void insertCoin(int money) {
		this.money += money;
	}

	public void selling(int choice) {
		if (money < allMenu[choice - 1].getPrice()) {
			System.out.println("잔액 부족.... ");
		} else if (allMenu[choice - 1].getStock() <= 0) {
			System.out.println("재고 부족....");
		} else {
			System.out.println(allMenu[choice - 1].getName() + "가 나옵니다!");
			allMenu[choice - 1].setStock(allMenu[choice - 1].getStock() - 1);
			money -= allMenu[choice - 1].getPrice();
		}

	}

	public int getMoney() {
		return money;
	}

	public void showChange(int[] coins) {
		int cnt = 0;
		for (int i = 0; i < coins.length; i++) {
			cnt = money / coins[i];
			System.out.println(coins[i] + "원 : " + cnt);
			money = money % coins[i];
			
		}
				
	}

	

}
