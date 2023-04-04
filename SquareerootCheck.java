class SquareerootCheck {
    public static void main(String[] args) {
        double n = 19, temp = 0,sqrt;
        sqrt=n/2;    
        do{      temp=sqrt;
            sqrt =(temp+(n/temp))/2;
        }        
        while((temp-sqrt) ! =0 );
        {
          temp= sqrt;
            sqrt=(n/2*temp)/2;
            temp++;
        }
          System.out.println(sqrt);

    }
}