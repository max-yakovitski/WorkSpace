package lesson3;

public class ATM {

	private int banknoteQty20 = 15;
	private int banknote20 = 20;
	private int banknoteQty50 = 10;
	private int banknote50 = 50;
	private int banknoteQty100 = 5;
	private int banknote100 = 100;
	private int total = banknoteQty20 + banknoteQty50 + banknoteQty100;
	private int amount = (banknoteQty20 * banknote20) + (banknoteQty50 * banknote50) + (banknoteQty100 * banknote100);
	
	public ATM() {
		
	}
	
	public ATM(int banknoteQty20, int banknoteQty50, int banknoteQty100) {
		this.banknoteQty20 = banknoteQty20;
		this.banknoteQty50 = banknoteQty50;
		this.banknoteQty100 = banknoteQty100;
	}

	public void getInfoATM() {
		System.out.println("Купюр в банкомате: " + total);
		System.out.println("Номиналы купюр: " + banknote20 + " рублей  - " + banknoteQty20 + " штук" );
		System.out.println("Номиналы купюр: " + banknote50 + " рублей - " + banknoteQty50 + " штук");
		System.out.println("Номиналы купюр: " + banknote100 + " рублей - " + banknoteQty100 + " штук");
		System.out.println("Максимальная сумма для снятия : " +  amount);
		System.out.println();
	}
	
	public void addMoneytoATM(int quantity, int banknote) {
		if (banknote == this.banknote20) {
			this.banknoteQty20 += quantity;
			total+=quantity;
			amount += quantity * banknote;
			System.out.println("В банкомат было внесено: " + quantity + " купюра с номиналом - " +  banknote +" рублей");
		}
		else if (banknote == this.banknote50) {
			this.banknoteQty50 += quantity;
			total+=quantity;
			amount += quantity * banknote;
			System.out.println("В банкомат было внесено: " + quantity + " купюра с номиналом - " +  banknote +" рублей");
		}
		else if (banknote == this.banknote100) {
			this.banknoteQty100 += quantity;
			total+=quantity;
			amount += quantity * banknote;
			System.out.println("В банкомат было внесено: " + quantity + " купюра с номиналом - " +  banknote +" рублей");
		}
		else {
			System.out.println("Внимание! Эти банкноты не могут быть загружены в банкомат.");
		}
		System.out.println();
	}
	
	public void getMoneyfromATM(int money, boolean check) {
		if (check == true) {
			
			if (money <= amount) {
				if (money % 100 == 0) {
					banknoteQty100 -= (money / 100);
					total -= (money / 100);
					amount -= money;
					System.out.println("Выдано " + money / 100 + " купюра(ы) с номиналом 100 рублей");
				}
				else if (money % 50 == 0) {
					banknoteQty50 -= (money / 50);
					total -= (money / 50);
					amount -= money;
					System.out.println("Выдано " + money / 50 + " купюра(ы) с номиналом 50 рублей");
				}
				else if (money % 20 == 0) {
					banknoteQty20 -= (money / 20);
					total -= (money / 20);
					amount -= money;
					System.out.println("Выдано " + money / 20 + " купюра(ы) с номиналом 20 рублей");
				}
				else {
					System.out.println("Пожалуйста выберите сумму кратную 20");
				}
			}
			else {
				System.out.println("Сумма - " + money + " недоступна к снятию!");
			}
			
		}
		
		else {
			System.out.println("Сбой в работе банкомата!");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		ATM atm24 = new ATM();
		atm24.getInfoATM();
//		atm24.addMoneytoATM(1, 100);
		atm24.getMoneyfromATM(50, true);
		atm24.getInfoATM();
		atm24.getMoneyfromATM(150, true); 
		atm24.getInfoATM();
		atm24.getMoneyfromATM(1100, true); 
		atm24.getInfoATM();
//		atm24.addMoneytoATM(3, 50);
//		atm24.getInfoATM();


	}

}
