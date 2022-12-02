package laba2;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class serializator {
	public boolean serialization(Pet kitty) {
		
		boolean flag=false;
		int choice =-1;
		@SuppressWarnings("resource")
		Scanner myObj = new Scanner(System.in);
		System.out.print("Choose format for serialization: \njson: 0\nxml: 1\ntxt: 2\n");
		choice = myObj.nextInt();
		File file = null;
		switch(choice){
		case 0: file=new File("C:\\Users\\padj\\Desktop\\java files\\cat.json");
		case 1: file=new File("C:\\Users\\padj\\Desktop\\java files\\cat.xml");
		case 2: file=new File("C:\\Users\\padj\\Desktop\\java files\\cat.txt");
		}
		ObjectOutputStream oos=null;
		
		try {
			FileOutputStream fos = new FileOutputStream(file);
			if(fos!=null) {
				oos=new ObjectOutputStream(fos);
				oos.writeObject(kitty);
				flag=true;
			}
			
		} catch (FileNotFoundException e ) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(oos!=null) {
				try {
					oos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		return flag;
	}
		public Pet deserialization () throws InvalidObjectException {
			int choice =-1;
			@SuppressWarnings("resource")
			Scanner myObj = new Scanner(System.in);
			System.out.print("Choose format for deserialization: \njson: 0\nxml: 1\ntxt: 2\n");
			choice = myObj.nextInt();
			File file = null;
			switch(choice){
			case 0: file=new File("C:\\Users\\padj\\Desktop\\java files\\cat.json");
			case 1: file=new File("C:\\Users\\padj\\\\Desktop\\\\java files\\\\cat.xml");
			case 2: file=new File("C:\\Users\\padj\\Desktop\\java files\\cat.txt");
			}
			Pet kitty=null;
			ObjectInputStream ois=null;
			
			try {
				FileInputStream fis = new FileInputStream(file);
				if(fis!=null) {
					ois=new ObjectInputStream(fis);
					kitty=(Pet)ois.readObject();
					return kitty;
				}
				
			} catch (FileNotFoundException e ) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}finally {
				if(ois!=null) {
					try {
						ois.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
			
			throw new InvalidObjectException("Object fail");
		}

}
