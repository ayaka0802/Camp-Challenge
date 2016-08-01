package jums;

import java.io.Serializable;

public class UserDataBeans implements Serializable{
	private String name;
	private int year;
	private int month;
	private int day;
	private String type;
	private String tell;
	private String comment;
	private boolean check;
	private String typehyouji;

	public boolean isCheck() {
		if(this.getName()!=null && this.getYear()!=0 && this.getMonth()!=0 && this.getDay()!=0
				&& this.getTell()!=null && this.getComment()!=null){
		check = true;
		} 
		return check;
		
	}
	public void setCheck(boolean check) {
		this.check = check;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = Integer.parseInt(year);
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = Integer.parseInt(month);
	}
	public int getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = Integer.parseInt(day);
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;

	}
	public String getTypehyouji() {
		return typehyouji;
	}
	public void setTypehyouji(String typehyouji) {
		if("1".equals(typehyouji)){
			this.typehyouji ="エンジニア";
		}else if("2".equals(typehyouji)){
			this.typehyouji = "営業";
		}else{
			this.typehyouji = "その他";
		}
	}
	public String getTell() {
		return tell;
	}
	public void setTell(String tell) {
		this.tell = tell;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String content) {
		this.comment = content;
	}

	public UserDataBeans(){
		this.name=name;
		this.year=year;
		this.month=month;
		this.day=day;
		this.type=type;
		this.tell=tell;
		this.comment=comment;
		this.check = check;
		this.typehyouji = typehyouji;
		
	}
	
	
}
