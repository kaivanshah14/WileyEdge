import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class DateClass {
	private int dd,mm,yy;

	public int getDd() {
		return dd;
	}

	public void setDd(int dd) {
		this.dd = dd;
	}

	public int getMm() {
		return mm;
	}

	public void setMm(int mm) {
		this.mm = mm;
	}

	public int getYy() {
		return yy;
	}

	public void setYy(int yy) {
		this.yy = yy;
	}

	public DateClass(int dd, int mm, int yy) {
		super();
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
		displayDate(dd, mm, yy);
		checkDate(dd, mm, yy);
	}
	
	public void displayDate(int dd, int mm, int yy) {
		System.out.println("Entered date is: " + dd + "/" + mm + "/" + yy);
	}
	
	public boolean isleap(int y) {
		if(y%4==0 && y%100!=0 && y%400==0) return true;
		return false;
	}
	
	public void checkDate(int dd, int mm, int yy) {
		boolean flag = true;
		if(dd<1 || dd>31) flag = false;
		if(mm<1 || mm>12) flag = false;
		if(yy<1) flag = false;
		
		if(mm==2) {
			if(isleap(yy)) {
				if(dd>29) flag = false;
			}
			else {
				if(dd>28) flag = false;
			}
		}
		
		if(mm == 4 || mm == 6 || mm == 9 || mm == 11) {
			if(dd>30) flag = false;
		}
		
		if(flag==false) System.out.println("Entered date is invalid");
		else {
			LocalDate t = LocalDate.of(yy, mm, dd);
			System.out.println("Entered date is valid");
			System.out.println("Date in words in " + t.getDayOfMonth() + " " + t.getMonth() + " " + t.getYear());
		}
		System.out.println("----------------");
	}
	
	public static void main(String args[]) {
		DateClass d1 = new DateClass(14, 11, 2000);
		DateClass d2 = new DateClass(33, 1, 2000);
		DateClass d3 = new DateClass(29, 2, 2005);
		DateClass d4 = new DateClass(29, 2, 2000);
		DateClass d5 = new DateClass(31, 12, 2022);
	}
}
