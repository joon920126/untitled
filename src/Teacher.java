public class Teacher extends Person {

    private String subject;
    private int count=0;

    public void setSubject(String subject){
        this.subject=subject;
    }

    public String getSubject(){
        return this.subject;
    }

    public void setCount(int count){
        this.count=count;
    }
    public int getCount(){
        return this.count;
    }

    @Override
    public String showInfo(){
        return super.showInfo()+"교번: "+this.getNo()+"\n강의: "+this.subject;
    }

}
