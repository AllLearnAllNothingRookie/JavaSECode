package homework.homework07;

import java.util.Objects;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/1 22:22
 */
public class Doctor {
    private String  name;
    private int age;
    private  char gender;
    private String job;
    private double sal;

    public Doctor() {
    }

    public Doctor(String name, int age, char gender, String job, double sal) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.job = job;
        this.sal = sal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Doctor doctor = (Doctor) o;
        return age == doctor.age && gender == doctor.gender && Double.compare(doctor.sal, sal) == 0 && Objects.equals(name, doctor.name) && Objects.equals(job, doctor.job);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, gender, job, sal);
    }
    /*@Override
    public boolean equals(Object obj) {
        if (obj == this){
            return true;
        }
        if(obj == null){
             return false;
        }
        if (obj instanceof Doctor){
            return this.name.equals(((Doctor) obj).getName())
                    && this.age == ((Doctor) obj).getAge()
                    && this.gender == ((Doctor) obj).getGender()
                    && this.job.equals(((Doctor) obj).getJob())
                    && this.sal== ((Doctor) obj).sal;
        }
        return false;
    }*/
}
