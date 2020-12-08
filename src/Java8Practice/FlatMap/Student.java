package Java8Practice.FlatMap;

import java.util.List;

public class Student {
    String name;
    int roll;
    List<Nickname> nicknameList;

    public Student(String name, int roll, List<Nickname> nicknameList) {
        this.name = name;
        this.roll = roll;
        this.nicknameList = nicknameList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public List<Nickname> getNicknameList() {
        return nicknameList;
    }

    public void setNicknameList(List<Nickname> nicknameList) {
        this.nicknameList = nicknameList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", roll=" + roll +
                ", nicknameList=" + nicknameList +
                '}';
    }
}
