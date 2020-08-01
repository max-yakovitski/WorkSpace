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
		System.out.println("Номиналы купюр: " + banknote20 + " рублей  - " + banknoteQty20 + " купюр" );
		System.out.println("Номиналы купюр: " + banknote50 + " рублей - " + banknoteQty50 + " купюр");
		System.out.println("Номиналы купюр: " + banknote100 + " рублей - " + banknoteQty100 + " купюр");
		System.out.println("Максимальная сумма для снятия : " +  amount);
		System.out.println();
	}
	
	public void addMoneytoATM(int quantity, int banknote) {
		if (banknote == this.banknote20) {
			this.banknoteQty20 += quantity;
			total+=quantity;
			amount += quantity * banknote;
			System.out.println("В банкомат было внесено: " + quantity + " купюр(ы) номиналом - " +  banknote +" рублей");
		}
		else if (banknote == this.banknote50) {
			this.banknoteQty50 += quantity;
			total+=quantity;
			amount += quantity * banknote;
			System.out.println("В банкомат было внесено: " + quantity + " купюр(ы) номиналом - " +  banknote +" рублей");
		}
		else if (banknote == this.banknote100) {
			this.banknoteQty100 += quantity;
			total+=quantity;
			amount += quantity * banknote;
			System.out.println("В банкомат было внесено: " + quantity + " купюр(ы) номиналом - " +  banknote +" рублей");
		}
		else {
			System.out.println("Внимание! Эти банкноты не могут быть загружены в банкомат.");
		}
		System.out.println();
	}
	
	public void getMoneyfromATM(int money, boolean check) {
		if (check == true) {
			
			if (money <= amount) {
				if (money % 20 == 0) {
					int check100 = money / 100;
					if (check100 < 1) {
						int check20 = money / 20;
						if (check20 <= banknoteQty20) {
							banknoteQty20 -= check20;
							amount -= money;
							total -= check20;
							System.out.println("К выдаче : " + money + " рублей, " + check20 + " х " + banknote20 + " рублей");
						}
						else {
							System.out.println("В банкомате недостаточно купюр!");
						}
					}
					else {
						if (check100 <= banknoteQty100) {
							banknoteQty100 -= check100;
							total -= check100;
							int check20 = money % 100 / 20;
							if (check20 > 0 && check20 <= banknoteQty20) {
								System.out.println("К выдаче : " + money + " рублей, " + check100 + " х " + banknote100 + " рублей " + check20 + " х " + banknote20 + " рублей");
								banknoteQty20 -= check20;
								total -= check20;
								amount -= money;
							}
							else {
								System.out.println("К выдаче : " + money + " рублей, " + check100 + " х " + banknote100 + " рублей ");
								amount -= money;
							}
						}
						else {
							total -= banknoteQty100;
							int check50 = (money - banknoteQty100 * banknote100) / 50;
							
							if (check50 <= banknoteQty50) {
								banknoteQty50 -= check50;
								total -= check50;
								int check20 = money % 100 / 20;
								if (check20 > 0 && check20 <= banknoteQty20) {
									System.out.println("К выдаче : " + money + " рублей, " + banknoteQty100 + " х " + banknote100 + " рублей " + check50 + " x " + banknote50 + " рублей " + check20 + " х " + banknote20 + " рублей");
									banknoteQty20 -= check20;
									total -= check20;
									amount -= money;
									banknoteQty100 = 0;
								}
								else {
									System.out.println("К выдаче : " + money + " рублей, " + banknoteQty100 + " х " + banknote100 + " рублей " + check50 + " x " + banknote50 + " рублей");
									amount -= money;
									banknoteQty100 = 0;
								}
							}
							else {
								total -= banknoteQty50;
								int check20 = money % 100 / 20;
								if (check20 > 0 && check20 <= banknoteQty20) {
									System.out.println("К выдаче : " + money + " рублей, " + banknoteQty100 + " х " + banknote100 + " рублей " + banknoteQty50 + " x " + banknote50 + " рублей " + check20 + " х " + banknote20 + " рублей");
									banknoteQty20 -= check20;
									total -= check20;
									amount -= money;
									banknoteQty100 = 0;
								}
								else {
									check20 = (money - (banknoteQty100 * banknote100 + banknoteQty50 * banknote50)) / 20;
									System.out.println("К выдаче : " + money + " рублей, " + banknoteQty100 + " х " + banknote100 + " рублей " + check50 + " x " + banknote50 + " рублей " + check20 + " х " + banknote20 + " рублей");
									amount -= money;
									banknoteQty100 = 0;
									banknoteQty50 = 0;
									banknoteQty20 -= check20;
								}
							}
						}
						
					}
				}
				else {
					int moneyDuplicate = money;
					int check20 = 0;
					while (money % 50 != 0) {
						money -= 20;
						check20++;
					}
					int check50 = money / 50 ;
					if (check20 <= banknoteQty20 && check50 <= banknoteQty50 ) {
						if (moneyDuplicate % 50 == 0) {
							System.out.println("К выдаче : " + moneyDuplicate + " рублей, " + check50 + " x " + banknote50 + " рублей ");	
							banknoteQty50 -= check50;
							banknoteQty20 -= check20;
							total -= check50;
							total -= check20;
							amount -= moneyDuplicate;
						}
						else {
							System.out.println("К выдаче : " + moneyDuplicate + " рублей, " + check50 + " x " + banknote50 + " рублей "  + check20 + " x " + banknote20 + " рублей");
							banknoteQty50 -= check50;
							banknoteQty20 -= check20;
							total -= check50;
							total -= check20;
							amount -= moneyDuplicate;
						}
					}
				}
			}
			else {
				System.out.println("Данная сумма недоступна!" + "Максимальная сумма для снятия : " + amount);
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
		atm24.addMoneytoATM(1, 100);
		atm24.getInfoATM();
		atm24.getMoneyfromATM(170, true);
		atm24.getInfoATM();
		atm24.getMoneyfromATM(540, true); 
		atm24.getInfoATM();
		atm24.getMoneyfromATM(1200, true); 
		atm24.getInfoATM();
		atm24.addMoneytoATM(3, 50);
		atm24.getInfoATM();


	}

}
