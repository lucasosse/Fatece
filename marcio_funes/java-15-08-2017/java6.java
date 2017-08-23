class java6{
    
    public static void main(String[] args){
        
        String star = "";
        for(int i=0;i<26;i++){
            System.out.println(star+="*");
            if(i%5==0) star="";
        }
    }
}