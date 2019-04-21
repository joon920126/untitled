public class Staff extends Person {

    private String dept;
    private int count=0;

    public void setDept(String dept){
        this.dept=dept;
    }

    public String getDept(){
        return this.dept;
    }

    public void setCount(int count){
        this.count=count;
    }
    public int getCount(){
        return this.count;
    }

    @Override
    public String showInfo(){
        return super.showInfo()+"사번: "+this.getNo()+"\n부서: "+this.dept;
    }

}
