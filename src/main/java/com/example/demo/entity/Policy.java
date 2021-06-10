package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Policy {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pid;
	private String fnm;
	private String lnm;
	private String dob;
	private int age;
	private String email;
	private String mobno;
	private String gender;
	private String tpolicy;
	private String tobaco;
	private float income;
	private float coveramt;
	private int coverage;
	
	public Policy() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Policy(String fnm, String lnm, String dob, int age, String email, String mobno, String gender,
			String tpolicy, String tobaco, float income, float coveramt, int coverage) {
		super();
		this.fnm = fnm;
		this.lnm = lnm;
		this.dob = dob;
		this.age = age;
		this.email = email;
		this.mobno = mobno;
		this.gender = gender;
		this.tpolicy = tpolicy;
		this.tobaco = tobaco;
		this.income = income;
		this.coveramt = coveramt;
		this.coverage = coverage;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getFnm() {
		return fnm;
	}

	public void setFnm(String fnm) {
		this.fnm = fnm;
	}

	public String getLnm() {
		return lnm;
	}

	public void setLnm(String lnm) {
		this.lnm = lnm;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobno() {
		return mobno;
	}

	public void setMobno(String mobno) {
		this.mobno = mobno;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getTpolicy() {
		return tpolicy;
	}

	public void setTpolicy(String tpolicy) {
		this.tpolicy = tpolicy;
	}

	public String getTobaco() {
		return tobaco;
	}

	public void setTobaco(String tobaco) {
		this.tobaco = tobaco;
	}

	public float getIncome() {
		return income;
	}

	public void setIncome(float income) {
		this.income = income;
	}

	public float getCoveramt() {
		return coveramt;
	}

	public void setCoveramt(float coveramt) {
		this.coveramt = coveramt;
	}

	public int getCoverage() {
		return coverage;
	}

	public void setCoverage(int coverage) {
		this.coverage = coverage;
	}

	@Override
	public String toString() {
		return "Policy [pid=" + pid + ", fnm=" + fnm + ", lnm=" + lnm + ", dob=" + dob + ", age=" + age + ", email="
				+ email + ", mobno=" + mobno + ", gender=" + gender + ", tpolicy=" + tpolicy + ", tobaco=" + tobaco
				+ ", income=" + income + ", coveramt=" + coveramt + ", coverage=" + coverage + "]";
	}

	
	
	
	
	

}
