public class person extends ass2{
    String first;
    String last;

    person(String first,String last){
        this.first=first;
        this.last=last;

    }
    void showName(){
        System.out.println(this.first+" "+this.last);
    }
}
