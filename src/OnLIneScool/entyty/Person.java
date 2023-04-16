package OnLIneScool.entyty;

    public class Person {

     private int courseId ;

     private PersonRole Role;

     private String firstname ;

     private String lastname ;

     private String phone ;

     private String email ;







        public Person(int courseId, PersonRole role) {
            this.courseId = courseId;
            Role = role;
        }

        public int getCourseId() {
            return courseId;
        }

        public void setCourseId(int courseId) {
            this.courseId = courseId;
        }

        public PersonRole getRole() {
            return Role;
        }

        public void setRole(PersonRole role) {
            Role = role;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "courseId=" + courseId +
                    ", Role=" + Role +
                    '}';
        }
    }
