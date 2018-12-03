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

    public Money divide( int in ){
        Money out = new Money();
        int carry;
        out.dollars = this.dollars / in;
        carry = this.dollars % in;
        out.cents = (this.cents + CENTS_TO_DOLLAR * carry ) / in;
        if ( (this.cents + CENTS_TO_DOLLAR * carry ) % in != 0 ) {
            out.remainder = true;
        }
        return out;
    } //End divide
} //End Money
