package com.example.aoife.groupshop;

class Money {
    int dollars;
    int cents;
    boolean remainder;

    final int CENTS_TO_DOLLAR = 100;

    public Money(){
        dollars = 0;
        cents = 0;
        remainder = false;
    }// End Constructor

    public Money( int dollarsIn, int centsIn )
    {
        dollars = dollarsIn;
        cents = centsIn;
        remainder = false;
    } //End Constructor (dollars,cents)

    public Money add(Money in){
        return new Money( this.dollars + in.dollars , this.cents + in.cents );
    } //End add

    public Money subtract(Money in){
        int dollarsOut = this.dollars - in.dollars;
        int centsOut = this.cents - in.cents;
        if( centsOut < 0 )
        {
            dollarsOut --;
            centsOut += CENTS_TO_DOLLAR;
        }
        return new Money( dollarsOut, centsOut );
    } //End subtract

    public String toString(){
        return new String( "$" + dollars + "." + cents);
    } //End toString
} //End Money
