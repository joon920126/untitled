public class Student extends Person {

    private String className;

    public void setClassName(String className){
        this.className=className;
    }

    public String getClassName(){
        return this.className;
    }

    @Override
    public String showInfo(){
        return super.showInfo()+"학번: "+this.getNo()+"\n학급: "+this.className;
    }

}
