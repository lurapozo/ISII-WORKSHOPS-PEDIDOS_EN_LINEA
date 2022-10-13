package ec.edu.espol.workshops;

public class CarInsurance {
	protected int age;
	protected char gender;
	protected boolean married;
	
	protected int basePremium = 500;
	
	private int premiumCalculator(boolean validLicense) {
		if(validLicense == false) {
			return -1;
		}
		if(this.age > 80) {
			return -1;
		}
		if (this.gender== 'F' || this.married == true) {
			this.basePremium=this.basePremium-200;
		}
		if(this.gender=='M' && this.married==false && this.age < 25) {
			this.basePremium=this.basePremium+1500;
		}
		if(45 <this.age < 65) {
			this.basePremium=this.basePremium-100;
		}
		return this.basePremium;
	}
	public void setAge(int newAge) {
		this.age = newAge;
	}
	public void setGender(char newGender) {
		this.gender = newGender;
	}
	public void setMarried(boolean newMarried) {
		this.married = newMarried;
	}
	public void setBasePremium(int newBase) {
		this.basePremium = newBase;
	}
	
	public int getAge() {
		return age;
	}
	public char getGender() {
		return gender;
	}
	public boolean getMarried{
		return married;
	}
	public int getBasePremium{
		return basePremium;
	}
	public int getPremiumCalculator(boolean tarjeta) {
		return this.calcularPremium(tarjeta);
	}
	
}
