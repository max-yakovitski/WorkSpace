package by.java.yakovitski.homework.lesson3;

public class ATM {
	private int banknoteQty20;
	private int banknoteQty50;
	private int banknoteQty100;
	
	public ATM() {
		
	}
	
	public ATM(int banknoteQty20, int banknoteQty50, int banknoteQty100) {
		this.banknoteQty20 = banknoteQty20;
		this.banknoteQty50 = banknoteQty50;
		this.banknoteQty100 = banknoteQty100;
	}

	public void printSystemInfo() {
		System.out.println("В банокмате купюр номиналом 100 рублей : " + banknoteQty100 + ", номиналом 50 рублей : " + banknoteQty50 + ", номиналом 20 рублей : " + banknoteQty20);
	}
	
	public int balance () {
		return banknoteQty100 * 100 + banknoteQty50 * 50 + banknoteQty20 * 20;
	}
	
	
	public void addMoneyToATM(int twenty, int fifty, int hundred) {
		banknoteQty20 += twenty;
		banknoteQty50 += fifty;
		banknoteQty100 += hundred;
	}
	
	public void getMoneyfromATM(int money) {
		if (money <= balance()) {
			

		if (money % 100 == 0 && banknoteQty100 >= money / 100) {
			banknoteQty100 -= money / 100;
			System.out.println("Банкомат выдал " + money / 100 + " купюра(ы) - номиналом  100 рублей");
		}
		
		else if (money % 50 == 0) {
			if (banknoteQty100 >= money / 100 && banknoteQty50 >= money % 100 / 50) {
				banknoteQty100 -= money / 100;
				banknoteQty50 -= money % 100 / 50;
				System.out.println("Банкомат выдал " + money / 100 + " x 100 рублей " + money % 100 / 50 + " x 50 рублей ");
			}
			
			else if (banknoteQty100 < money / 100  && banknoteQty50 >= ((money -  banknoteQty100 * 100) / 50)) {
				System.out.println("Банкомат выдал " + banknoteQty100 + " x 100 рублей " + ((money -  banknoteQty100 * 100) / 50) + " x 50 рублей ");
				banknoteQty100 -= 0;
				banknoteQty50 -= (money -  banknoteQty100 * 100) / 50;
			}
			
				
			else if (banknoteQty50 >= money / 50) {
				banknoteQty50 -= money / 50;
				System.out.println("Банкомат выдал " + money / 50 + " купюра(ы) - номиналом  50 рублей");
				
			}
			else {
				System.out.println("Данная сумма не доступна - обратитесь в службу поддержки");
			}
			
		}
		
		else if (money % 20 == 0) {
			if (money / 20 > 5 && banknoteQty100 >= money / 100) {
				banknoteQty100 -= money / 100;
				banknoteQty20 -= money % 100 / 20;
				System.out.println("Банкомат выдал " + money / 100 + " x 100 рублей " + money % 100 / 20 + " x 20 рублей ");
			}
			
			else if (money / 20 > 5 && banknoteQty50 >= (money / 100) * 2) {
				banknoteQty50 -= (money / 100) * 2;
				banknoteQty20 -= money % 100 / 20;
				System.out.println("Банкомат выдал " + (money / 100) * 2 + " x 50 рублей " + money % 100 / 20 + " x 20 рублей ");
			}
			
			else  {
				banknoteQty20 -= money / 20;
				System.out.println("Банкомат выдал " + money / 20 + " купюра(ы) - номиналом  20 рублей");
			}
				
		}
		else {
			System.out.println("Данная сумма не доступна - обратитесь в службу поддержки");
			}
		}
		else {
			System.out.println("Ошибка! Максимальная сумма к выдачи - " + balance() + " рублей");
		}
	}
	
	public static void main(String[] args) {
		
		ATM atm24 = new ATM();
		atm24.addMoneyToATM(0, 0, 11);
		atm24.addMoneyToATM(2, 4, 15);
		atm24.addMoneyToATM(6, 1, 8);
		atm24.addMoneyToATM(1, 2, 3);
		atm24.printSystemInfo();
		System.out.println();

		atm24.getMoneyfromATM(1050);
		atm24.printSystemInfo();
		System.out.println();
		
		atm24.getMoneyfromATM(350);
		atm24.printSystemInfo();
		System.out.println();
		
		atm24.getMoneyfromATM(220);
		atm24.printSystemInfo();
		System.out.println();

		atm24.getMoneyfromATM(10000);
		atm24.printSystemInfo();
	}
}
