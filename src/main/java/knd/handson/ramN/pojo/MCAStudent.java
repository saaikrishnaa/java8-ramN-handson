package knd.handson.ramN.pojo;

public class MCAStudent {

  private String studentName;
  private String teacherName;
  private int level;
  private String className;

  public MCAStudent(String studentName, String teacherName, int level, String className) {
    super();
    this.studentName = studentName;
    this.teacherName = teacherName;
    this.level = level;
    this.className = className;
  }

  public MCAStudent() {
  }

  public String getStudentName() {
    return studentName;
  }

  public String getTeacherName() {
    return teacherName;
  }

  public int getLevel() {
    return level;
  }

  public String getClassName() {
    return className;
  }

  @Override
  public String toString() {
    return "MCAStudent{" +
        "studentName='" + studentName + '\'' +
        ", teacherName='" + teacherName + '\'' +
        ", level=" + level +
        ", className='" + className + '\'' +
        '}';
  }
}
