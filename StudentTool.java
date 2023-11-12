import java.util.*;
class Student{
    String id,name;
    double att,gra;
    Student(String id,String name,double att,double gra){
        this.id=id;
        this.name=name;
        this.att=att;
        this.gra=gra;
    }
}
public class StudentTool {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter No.of students:");
        int n=sc.nextInt();
        System.out.println("Enter student details accordingly");
        System.out.println("ID, Name,Attendance, Grade");
        Student s[]=new Student[n];
        for(int i=0;i<n;++i){
            System.out.print("Enter details of Student."+(i+1)+": ");
            s[i]=new Student(sc.next(), sc.next(), sc.nextDouble(), sc.nextDouble());
        }
        while(true){
            System.out.print("If you want to change any details press ID of the student else 'n': ");
            String ID=sc.next();
            if(ID.equals("n"))
            break;
            for(Student j:s){
                if(j.id.equals(ID)){
                    System.out.print("If you want to change name press 'y' else 'n': ");
                    if(sc.next().equals("y")){
                        System.out.print("Enter name:");
                        j.name=sc.next();
                    }
                    System.out.print("If you want to change attendance press 'y' else 'n': ");
                    if(sc.next().equals("y")){
                        System.out.print("Enter change in attendance:");
                        j.att=sc.nextInt()+j.att;
                    }
                    System.out.print("If you want to change grade press 'y' else 'n' ");
                    if(sc.next().equals("y")){
                        System.out.print("Enter increase(+)/decrease(-) in grade:");
                        j.gra=sc.nextInt()+j.gra;
                    }
                }
            }
        }
        for(Student i:s)
        System.out.println("ID="+i.id+" name="+i.name+" attendance="+i.att+" grade="+i.gra);
    sc.close();
    }
}
