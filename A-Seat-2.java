class A-Seat-2{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int div = a/b;
        if(div>=2){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    }
}