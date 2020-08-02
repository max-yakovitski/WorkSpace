package by.java.Yakovitski.HomeWork.lesson3;

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

	
	public void addMoneytoATM(int money) {
		if (money % 100 == 0) {
			banknoteQty100 += money / 100;
			System.out.println("В банкомат добавлено " + money / 100 + " купюра(ы) - номиналом  100 рублей");
		}
		else if (money % 50 == 0) {
			banknoteQty50 += money / 50;
			System.out.println("В банкомат добавлено " + money / 50 + " купюра(ы) - номиналом  50 рублей");
		}
		else if (money % 20 == 0) {
			banknoteQty20 += money / 20;
			System.out.println("В банкомат добавлено " + money / 20 + " купюра(ы) - номиналом  20 рублей");
		}
		else {
			System.out.println("Данная сумма не может быть добавлена в банкомат - обратитесь в службу поддержки");
		}
	}
	
	public void getMoneyfromATM(int money) {
		if (money % 100 == 0 && banknoteQty100 >= money / 100) {
			banknoteQty100 -= money / 100;
			System.out.println("Банкомат выдал " + money / 100 + " купюра(ы) - номиналом  100 рублей");
		}
		else if (money % 50 == 0 && banknoteQty50 >= money / 50) {
			banknoteQty50 -= money / 50;
			System.out.println("Банкомат выдал " + money / 50 + " купюра(ы) - номиналом  50 рублей");
		}
		else if (money % 20 == 0 && banknoteQty20 >= money / 20) {
			banknoteQty20 -= money / 20;
			System.out.println("Банкомат выдал " + money / 100 + " купюра(ы) - номиналом  20 рублей");
		}
		else {
			System.out.println("Данная сумма не может быть выдана - обратитесь в службу поддержки");
		}
	}
	
	public static void main(String[] args) {
		ATM atm24 = new ATM();
		atm24.addMoneytoATM(550);
		atm24.addMoneytoATM(600);
		atm24.addMoneytoATM(340);
		atm24.addMoneytoATM(110);
		System.out.println();
		atm24.getMoneyfromATM(600);
		atm24.getMoneyfromATM(350);
		atm24.getMoneyfromATM(220);
		atm24.getMoneyfromATM(330);
	}

}
