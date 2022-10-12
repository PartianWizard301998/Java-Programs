class BiggestOfThree {
    public static void main(String[] args) {
    //Biggest of 3 nos
    /* If all the three nos are same in values the C will be the Biggest value*/
    int a=30;
    int b=120;
    int c=90;
    if (a > b && a > c){
        System.out.println("A is Biggest");
    }else if (b > a && b > c){
        System.out.print("B is Biggest");
    }else{
        System.out.print("C is Biggest");
    }
    
    }
}