class java1{
    public static void main(String[] args){
        
        String myName = "";
        
        
        for(int i=0;i<100;i++){
            myName+="Lucas \t";
            if(i%10 == 0 && i!=0) myName+="\n";
        }
        
        System.out.println(myName);
        
    }
}