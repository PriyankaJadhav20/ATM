package com.example.UserService.NewVolume;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Details {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userDetailsId;
    private Long accountNo;
    private Long phoneNo;
    private int amount;
    private Long cardNo;



    private Details(){
        super();
    }

    public void setUserDetailsId(Long userDetailsId) {
        this.userDetailsId = userDetailsId;
    }



    public Long getUserDetailsId() {
        return userDetailsId;
    }


    public void setAccountNo(Long accountNo) {
        this.accountNo = accountNo;
    }

    public Long getAccountNo() {
        return accountNo;
    }


    public void setPhoneNo(Long phoneNo) {
        this.phoneNo = phoneNo;
    }

    public Long getPhoneNo() {
        return phoneNo;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Long getCardNo() {
        return cardNo;
    }

    public void setCardNo(Long cardNo) {
        this.cardNo = cardNo;
    }
}
