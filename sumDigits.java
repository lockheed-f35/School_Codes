

public class sumDigits{
    int redlake(int x){
        int sum = 0;

        if (x == 0){return 0;}
        
        sum = sum + x%10;
        
        return sum+redlake(x/10);
        

    }



}