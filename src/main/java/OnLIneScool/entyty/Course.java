package OnLIneScool.entyty;

import java.util.Objects;

public class Course implements Comparable<Course> {
     private String name ;

     public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }

     public Course(String name) {
          this.name = name;
     }

     @Override
     public String toString() {
          return "Course{" +
                  "name='" + name + '\'' +
                  '}';
     }

     @Override
     public int compareTo(Course o) {
          return 0;
     }

     @Override
     public boolean equals(Object o) {
          if (this == o) return true;
          if (o == null || getClass() != o.getClass()) return false;
          Course course = (Course) o;
          return Objects.equals(name, course.name);
     }

     @Override
     public int hashCode() {
          return Objects.hash(name);
     }
}
