package com.rab3tech.dao.entity;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer_transactions_tbl")
public class CustomerTransaction {
	
	private int txid;
	
	private String fromAccount;
	private String toAccount;
	private double amount;
	private String txType;
    private String details;
    private Timestamp dot;
    private String transactionSchedule;
    private String txtStatus;
    private String bankName;
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getTxid() {
		return txid;
	}
	public void setTxid(int txid) {
		this.txid = txid;
	}
	public String getFromAccount() {
		return fromAccount;
	}
	public void setFromAccount(String fromAccount) {
		this.fromAccount = fromAccount;
	}
	public String getToAccount() {
		return toAccount;
	}
	public void setToAccount(String toAccount) {
		this.toAccount = toAccount;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getTxType() {
		return txType;
	}
	public void setTxType(String txType) {
		this.txType = txType;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public Timestamp getDot() {
		return dot;
	}
	public void setDot(Timestamp dot) {
		this.dot = dot;
	}
	public String getTransactionSchedule() {
		return transactionSchedule;
	}
	public void setTransactionSchedule(String transactionSchedule) {
		this.transactionSchedule = transactionSchedule;
	}
	public String getTxtStatus() {
		return txtStatus;
	}
	public void setTxtStatus(String txtStatus) {
		this.txtStatus = txtStatus;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	@Override
	public String toString() {
		return "CustomerTransaction [txid=" + txid + ", fromAccount=" + fromAccount + ", toAccount=" + toAccount
				+ ", amount=" + amount + ", txType=" + txType + ", details=" + details + ", dot=" + dot
				+ ", transactionSchedule=" + transactionSchedule + ", txtStatus=" + txtStatus + ", bankName=" + bankName
				+ "]";
	}
    
    
}
