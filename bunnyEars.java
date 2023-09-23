class bunnyEars{
    static int ears(int x){
        if (x==0) {return 0;}

        //2 recursssive cases

        int count =0;
        // for even we have 3 ears per bunny.
        if (x%2 == 0){count = 3+ears(x-1);}

        //for odd we have 2 ears per bunny.
        if (x%2 != 0){count = 2+ears(x-1);}

        return count;
    }
    public static void main(String[] args) {
        System.out.println(ears(0));
        System.out.println(ears(1));
        System.out.println(ears(3));
    }
}