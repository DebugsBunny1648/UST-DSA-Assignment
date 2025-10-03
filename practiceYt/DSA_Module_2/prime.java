package practiceYt.DSA_Module_2;

public class prime {
    void Prime(int n){
        int count=2;
        for(int i=2;i<(n/2);i++){
            if(n%i==0){
                count++;
            }
        }
        if(count>2){
            System.out.println(n+" is Not Prime");
        }
        else{
            System.out.println(n+" is Prime ");
        }
    }
    public static void main(String[] args) {
        prime p1=new prime();
        p1.Prime(17);
        p1.Prime(24);
        p1.Prime(47);
    }
}
