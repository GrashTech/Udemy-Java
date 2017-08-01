package com.GrashCode;

/**
 * Created by Eric on 20/02/2017.
 */
public class VipCustomer {


    private String vipName;
    private double creditlimit;
    private String email;

    public VipCustomer()
    {
        this("Deafult Name" , 50000 , "Deafult@email.com");
    }

    public VipCustomer(String vipName , double creditlimit)
    {
       this(vipName , creditlimit , "Unkown");
    }

    public VipCustomer(String vipName, double creditlimit , String email) {
        this.vipName =vipName;
        this.email = email;
        this.creditlimit = creditlimit;
    }

    public String getVipName() {
        return vipName;
    }

    public double getCreditlimit() {
        return creditlimit;
    }

    public String getEmail() {
        return email;
    }









}
