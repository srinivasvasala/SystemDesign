package design_patterns.Builder;

import lombok.Getter;

@Getter
public class Student {
    private String firstName;
    private String lastname;
    private String email;
    //step-1 hide the constructor
    private Student() {}


    //Step-2 Create nested inner class
    static class Builder {
        private String firstName;
        private String lastname;
        private String email;
        //step-4 expose setter and Getter to inner Class
        //Fluent interface
        public Builder withName(String firstName,String lastname){
            this.firstName=firstName;
            this.lastname=lastname;
            return this;
        }
        public String getFirstName() {
            return firstName;
        }
        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        public String getLastname(){
            return lastname;
        }
        public Builder setLastname(String lastname){
            this.lastname=lastname;
            return this;
        }
        public String getEmail(){
            return email;
        }
        public Builder setEmail(String email){
            this.email=email;
            return this;
        }

        //Step-5 Add build hook
        public Student build(){
            Student student = new Student();
            student.firstName = firstName;
            student.lastname = lastname;
            student.email = email;
            return student;
        }

    }
}
