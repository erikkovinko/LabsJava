package laba2;

import java.util.Objects;
import java.util.Scanner;


public class Dog extends Pet{
	private static final long serialVersionUID = 1L;
	private String breed;
	private int kidsBit;
	private Dog(Builder builder){
		super(builder);
		this.breed=builder.breed;
		this.kidsBit=builder.kidsBit;
	}
	static class Builder extends Pet.Builder{
		public Builder(String name, int age, boolean vacStatus, String gender,String breed,int kidsBit) {
			super(name, age, vacStatus, gender);
			this.breed=breed;
			this.kidsBit=kidsBit;
		}
		private String breed;
		private int kidsBit;
		public Builder breed(String breed) {
			this.breed=breed;
			return this;
		}
		public Builder kidsBit(int kidsBit) {
			this.kidsBit=kidsBit;
			return this;
		}
		public Dog build() {
			Dog newPet=new Dog(this);
			validate(newPet);
			return newPet;
		}
		private void validate(Dog dog) {
			if(dog.breed.length()>10) {
				throw new IllegalArgumentException("\nwe are not sure if name of breed "
						+ "can contain more than 10 letters\n");
			}
			if(dog.kidsBit<0) {
				throw new IllegalArgumentException("\nnumber of mice hunt by cat can't be less than zero!\n");
		}
			super.validate(dog);
		}
	}
	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public int getKidsBit() {
		return kidsBit;
	}

	public void setKidsBit(int miceHunt) {
		this.kidsBit = miceHunt;
	}
	public static Dog input() {
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
		System.out.print("Enter name of cat: ");  
		String name= sc.nextLine();  
		System.out.print("Enter age of "+name+": ");  
		int age= sc.nextInt();  
		System.out.print("Is it vaccinated? (true or false): ");  
		boolean vac= sc.nextBoolean();  
		System.out.print("what gender is it: "); 
		String gen= sc.nextLine();  
		System.out.print("what breed is it: ");  
		String breed= sc.nextLine();  
		System.out.print("How many kids did it bit?(from zero to ...): ");
		int kid= sc.nextInt();  
		Dog newDog= new Dog.Builder(name, age, vac, gen, breed, kid).build();
		return newDog;
	}
	@Override
	public void animalSound() {
		System.out.print("\n!!!BARK BARk WOOOOF!!!\n");
	}
	@Override
	public String toString() {
		String hunterLvl="";
		if(kidsBit==0 && kidsBit<=10 ) {hunterLvl="small amount of kids";}
		if(kidsBit>11 && kidsBit<30 ) {hunterLvl="mid amount of kids";}
		if(kidsBit>30) {hunterLvl="nice, this dog is a serial killer";}
		String info="This dog's name is '"+this.getName()+"', its age is "+this.getAge()+
				" years.\n"+this.getName()+" bit "+ this.getKidsBit()+" kids, counclusion: "+hunterLvl+
				".\nGender: "+this.getGender()+"\nVaccination status: "+this.isVacStatus();
		return info;
		}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(breed, kidsBit);
		return result;
	}
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		super.print();
		System.out.print(". This dog's breed is: "+this.getBreed() + ". "+ this.getName() 
		+" bit "+this.getKidsBit()+" children.");
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		return Objects.equals(breed, other.breed) && kidsBit == other.kidsBit;
	}

}

