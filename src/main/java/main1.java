//This code prints prime numbers between 100 and 200
public class main1 {

    public void prime_between_100_200(){
        int flag = 0;
        for (int i=100; i < 200; i++){
            for (int j=2; j < i; j++){
                if (i%j == 0){
                    System.out.println(i + "is not prime number");
                    flag = 1;
                    break;
                }
                flag = 0;

            }
            if (flag == 0){
                System.out.println(i + "is prime number");
            }
        }
    }

    public static void main(String args[]){

        main1 main = new main1();
        main.prime_between_100_200();


    }
}
