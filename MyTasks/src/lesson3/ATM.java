package lesson3;

public class ATM {

	private int banknoteQty20 = 15;
	private int banknote20 = 20;
	private int banknoteQty50 = 10;
	private int banknote50 = 50;
	private int banknoteQty100 = 5;
	private int banknote100 = 100;
	private int total = banknoteQty20 + banknoteQty50 + banknoteQty100;
	
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
		System.out.println();
	}
	
	public void addMoneytoATM(int quantity, int banknote) {
		if (banknote == this.banknote20) {
			this.banknoteQty20 += quantity;
			total+=quantity;
			System.out.println("В банкомат было внесено: " + quantity + " банкнот(а) с номиналом - " +  banknote +" рублей");
		}
		else if (banknote == this.banknote50) {
			this.banknoteQty50 += quantity;
			total+=quantity;
			System.out.println("В банкомат было внесено: " + quantity + " банкнот(а) с номиналом - " +  banknote +" рублей");
		}
		else if (banknote == this.banknote100) {
			this.banknoteQty100 += quantity;
			total+=quantity;
			System.out.println("В банкомат было внесено: " + quantity + " банкнот(а) с номиналом - " +  banknote +" рублей");
		}
		else {
			System.out.println("Внимание! Эти банкноты не могут быть загружены в банкомат.");
		}
		System.out.println();
	}
	
	public void getMoneyfromATM(int quantity, int banknote, boolean check) {
		if (check == true && quantity <= banknoteQty20 && quantity <= banknoteQty50 && quantity <= banknoteQty100) {
			if (banknote == this.banknote20) {
				this.banknoteQty20 -= quantity;
				total-=quantity;
				System.out.println("В банкомате сняли: " + quantity + " банкнот с номиналом - " +  banknote +" рублей");
			}
			if (banknote == this.banknote50) {
				this.banknoteQty50 -= quantity;
				total-=quantity;
				System.out.println("В банкомате сняли: " + quantity + " банкнот с номиналом - " +  banknote +" рублей");
			}
			if (banknote == this.banknote100) {
				this.banknoteQty100 -= quantity;
				total-=quantity;
				System.out.println("В банкомате сняли: " + quantity + " банкнот с номиналом - " +  banknote +" рублей");
			}
		}
		else {
			System.out.println("Сбой в работе банкомата, cнятие " + quantity + " купюр номиналом " + banknote + " не удалось! Недостаточно нужных купюр!");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		ATM atm24 = new ATM();
		atm24.getInfoATM();
		atm24.addMoneytoATM(1, 100);
		atm24.getMoneyfromATM(5, 50, true);
		atm24.getInfoATM();
		atm24.getMoneyfromATM(6, 50, true); 
		atm24.getInfoATM();
		atm24.addMoneytoATM(3, 50);
		atm24.getInfoATM();


	}

}
