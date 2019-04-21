import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class School {

//    Student student = new Student();
//    Student stuArray[] = new Student[3];
    List<Student> stuArray = new ArrayList<>();


    //Staff staArray[] = new Staff[3];
    List<Staff> staArray = new ArrayList<>();

    List<Teacher> teaArray = new ArrayList<>();
   // Teacher teaArray[] = new Teacher[3];

    Scanner sc = new Scanner(System.in);

    public void introA(String a) {
        System.out.println(a + "을 입력하세요.");
    }

    public void introB(String a) {
        System.out.println(a + "를 입력하세요.");
    }

    public void error() {
        System.out.println("잘못된 입력입니다.");
    }

    public void mainMenu() {
        System.out.println("-----메뉴-----");
        System.out.println("   1. 등록    ");
        System.out.println("   2. 검색    ");
        System.out.println("   3. 출력    ");
        System.out.println("   4. 수정    ");
        System.out.println("   5. 삭제    ");
        System.out.println("   6. 종료    ");
        System.out.println("--------------");
        this.introB("번호");
        int menuNum = sc.nextInt();

        if (menuNum > 5 || menuNum < 1) {
            error();
        } else {
            switch (menuNum) {
                case 1: {
                    input();
                    break;
                }
                case 2: {
                    search();
                    break;
                }
                case 3: {
                    print();
                    break;
                }
                case 4: {
                    update();
                    break;
                }
                case 5: {
                    delete();
                    break;
                }
                case 6: {
                    exit();
                    break;
                }
            }
        }
    }

    public void input() { //3갈래로 나뉘어지는 코드 깔끔하게 정리하는 방법
        System.out.println("유형을 선택하세요. [1.학생 2.교사 3.교직원]");
        int inNum = sc.nextInt();
        if (inNum < 1 || inNum > 3) {
            error();
        } else {
            switch (inNum) {
                case 1: {
                    inputStudent();
                    break;
                }
                case 2: {
                    inputTeacher();
                    break;
                }
                case 3: {
                    inputStaff();
                    break;
                }
            }
        }
    }

        public void inputStudent() {

            Student student = new Student();
            this.introA("이름");
            student.setName(sc.next());

            this.introA("학번");
            student.setNo(sc.nextInt());

            this.introA("학급");
            student.setClassName(sc.next());

            System.out.println(student.showInfo());
            System.out.println("위 정보를 저장하시겠습니까? [1.예 2.아니오]");
            int yn = sc.nextInt();
            if (yn > 2 || yn < 1) {
                error();
            } else {
                if(yn==1) {
                    stuArray.add(student);
//                    stuArray[stuArray.length] = student;
                    System.out.println(stuArray.size() + "명 등록 완료");
                }
            }
        }


        public void inputTeacher () {
            Teacher teacher = new Teacher();

            this.introA("이름");
            teacher.setName(sc.next());

            this.introA("교번");
            teacher.setNo(sc.nextInt());

            this.introA("강의명");
            teacher.setSubject(sc.next());

            System.out.println(teacher.showInfo());
            System.out.println("위 정보를 저장하시겠습니까? [1.예 2.아니오]");
            int yn = sc.nextInt();
            if (yn > 2 || yn < 1) {
                error();
            } else {
                if(yn==1) {
                    teaArray.add(teacher);
                    System.out.println(teaArray.size() + "명 등록 완료");
                }
            }
        }


        public void inputStaff () {
            Staff staff = new Staff();

            this.introA("이름");
            staff.setName(sc.next());

            this.introA("사번");
            staff.setNo(sc.nextInt());

            this.introB("부서");
            staff.setDept(sc.next());

            System.out.println(staff.showInfo());
            System.out.println("위 정보를 저장하시겠습니까? [1.예 2.아니오]");
            int yn = sc.nextInt();
            if (yn > 2 || yn < 1) {
                error();
            } else {
                if(yn==1) {
                    staArray.add(staff);
                    System.out.println(staArray.size() + "명 등록 완료");
                }
            }

        }


        public void search() {

            introA("이름");
            String search = sc.next();


            stuArray.stream()
                        .filter(stu -> {
                            return search.equals(stu.getName());
                        })
                        .forEach(stu -> System.out.println(stu.showInfo()));

            teaArray.stream()
                    .filter(a -> {
                        return search.equals(a.getName());
                    })
                    .forEach(a -> System.out.println(a.showInfo()));

            staArray.stream()
                    .filter(a -> {
                        return search.equals(a.getName());
                    })
                    .forEach(a -> System.out.println(a.showInfo()));





            if(teaArray.contains(search)){
                System.out.println(teaArray.get(teaArray.indexOf(search)).showInfo());
            }
            if(staArray.contains(search)){
                System.out.println(staArray.get(staArray.indexOf(search)).showInfo());
            }
            else{
                System.out.println("검색결과가 없습니다.");
            }

        }

        public void print () {
            introA("유형");
            int printNum = sc.nextInt();
            if (printNum > 3 || printNum < 1) {
                error();
            } else {
                switch (printNum) {
                    case 1: {
                        for (Student a: stuArray) {
                            System.out.println(a.showInfo());
                            System.out.println();
                        }
                        break;
                    }
                    case 2: {
                        for (Teacher a:teaArray) {
                            System.out.println(a.showInfo());
                            System.out.println();
                        }
                        break;
                    }
                    case 3: {
                        for (Staff a: staArray) {
                            System.out.println(a.showInfo());
                            System.out.println();
                        }
                        break;
                    }
                }
            }
        }

        public void update () { //배열에 저장되어있는 내용 수정하는 방법

        }

        public void delete () { //배열에 저장되어있는 내용 삭제하는 방법

        }

        public void exit () {
            System.out.println("시스템을 종료합니다.");
            System.exit(0);
        }

        public static void main (String[] args){
            School school = new School();
            for (; ; ) {
                school.mainMenu();
            }
        }

}
