package ilp;
import java.util.*;
public class Solution56
{
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Course arr[]=new Course[4];
        for(int i=0;i<arr.length;i++){
            String a=sc.nextLine();
            String b=sc.nextLine();
            int c=sc.nextInt();
            sc.nextLine();
            boolean d=sc.nextBoolean();
            String e= sc.nextLine();
            arr[i]=new Course(a,b,c,d,e);
        }
        String str=sc.nextLine();
        String result=find(arr, str);

        if(result==null){
            System.out.println("No match found");
        }
        else{
            System.out.println(result);
        }
    }
    public static String find(Course arr[],String str){
        String cat="";
        for(int i=0;i<arr.length;i++){
            if(arr[i].nm.equalsIgnoreCase(str)){
                if(arr[i].attend<1500 && arr[i].attend>=1000){
                    cat+="Diamond";
                    return cat;
                }
                if(arr[i].attend<1000 && arr[i].attend>=500){
                    cat+="Golden";
                    return cat;
                }
                if(arr[i].attend<500 ){
                    cat+="Silver";
                    return cat;
                }
            }
        }
        return null;
    }
}
class Course{
    
    String nm;
    String ins;
    int attend;
    boolean present;
    String city ;
    public Course(String nm,String ins,int attend,boolean present,String city){
        this.nm=nm;
        this.ins=ins;
        this.attend=attend;
        this.present=present;
        this.city=city;

    }

}


