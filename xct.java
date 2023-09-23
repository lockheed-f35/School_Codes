public class xct {
     int countX(String str) {
  
        String Nstr = str.substring(0,1);
        String str1 = str.substring(1,str.length());
         if(Nstr == ""){return 0;}
         
       
       
       
       if (Nstr == "x"){return 1+countX(str1);}
       
       else return 0+countX(str1);
       
       
       
       
       }
       
}
