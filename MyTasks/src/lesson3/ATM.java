package lesson3;

public class ATM {

	private int banknoteQuantity;
	private int banknote1;
	private int banknote2;
	private int banknote3;
	boolean check = true;
	
	public ATM(int banknoteQuantity, int banknote1, int banknote2, int banknote3) {
		this.banknoteQuantity = banknoteQuantity;
		this.banknote1 = banknote1;
		this.banknote2 = banknote2;
		this.banknote3 = banknote3;
	}

	public void getInfoATM() {
		System.out.println("Купюр в банкомате: " + banknoteQuantity);
		System.out.println("Наимналы купюр: " + banknote1 + ", " + banknote2 + ", " + banknote3);
		System.out.println();
	}
	
	public void addMoneytoATM(int banknoteQuantity, int banknote) {
		if (banknote == this.banknote1 || banknote == this.banknote2 || banknote == this.banknote3) {
			this.banknoteQuantity += banknoteQuantity;
			System.out.println("В банкомате стало " + this.banknoteQuantity + " купюр, было внесено " + banknoteQuantity + " купюр c номиналом " + banknote);
		}
		else {
			System.out.println("Внимание! Эти банкноты не могут быть загружены в банкомат.");
		}
	}
	
	public void getMoneyfromATM(int banknoteQuantity, int banknote, boolean check) {
		if (check == true) {
			if (banknote == this.banknote1 || banknote == this.banknote2 || banknote == this.banknote3) {
				this.banknoteQuantity -= banknoteQuantity;
				System.out.println("В банкомате стало " + this.banknoteQuantity + " купюр, было снято " + banknoteQuantity + " купюр c номиналом " + banknote);
			}
			else {
				System.out.println("Внимание! Таких банкнот нет в банкомате");
			}
			
		}
		else {
			System.out.println("Сбой в работе банкомата, cнятие " + banknoteQuantity + " купюр номиналом " + banknote + " не удалось");
		}
		
	}
	
	public static void main(String[] args) {
		ATM atm24 = new ATM(100, 20, 50, 100);
		atm24.getInfoATM();
		atm24.addMoneytoATM(100, 20);
		atm24.getMoneyfromATM(5, 50, true); 


	}

}
