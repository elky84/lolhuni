package com.lol.tracer.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.TableGenerator;

import com.lol.tracer.model.lol.Summoner;

@Entity(name = "users")
public class User {
	
	@Id
	@TableGenerator(name = "GEN_USER_NO", allocationSize = 1)
	@GeneratedValue(generator = "GEN_USER_NO", strategy = GenerationType.TABLE)
	private int userNo;
	
	@Column
	private String name;
	
	@Column
	private String tel;
	
	@Column
	private Date regDate;
	
	@OneToOne
	@JoinColumn(name = "SUMMONER_ID")
	private Summoner summoner;

	public int getUserNo() {
		return userNo;
	}

	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public Summoner getSummoner() {
		return summoner;
	}

	public void setSummoner(Summoner summoner) {
		this.summoner = summoner;
	}

	@Override
	public String toString() {
		return "User [userNo=" + userNo + ", name=" + name + ", tel=" + tel + ", regDate=" + regDate + ", summoner="
				+ summoner + "]";
	}
	
	
}
