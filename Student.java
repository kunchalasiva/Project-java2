class Student {
 private int sno;
 private String sname;
 private String course;
 private double  fee;

Student(int sno,String sname,String course,double fee) {
  this.sno=sno;
  this.sname=sname;
  this.course=course;
  this.fee=fee;
}

public  void  display() {
  System.out.println("Sno "+ sno + "sname " + sname + "course "+ course + "fee " +fee);
}
siva nageswararao
