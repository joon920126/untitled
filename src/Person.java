public class Person {

    private int no;
    private String name;

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }

    public void setNo(int no){
        this.no=no;
    }
    public int getNo(){
        return this.no;
    }


    public String showInfo(){
        return "이름: "+name+"\n";
    }
}
