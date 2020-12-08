package Java8Practice.FlatMap;

public class Nickname {
    String frndNickName;
    String homeNickName;

    public Nickname(String frndNickName, String homeNickName) {
        this.frndNickName = frndNickName;
        this.homeNickName = homeNickName;
    }

    @Override
    public String toString() {
        return "Nickname{" +
                "frndNickName='" + frndNickName + '\'' +
                ", homeNickName='" + homeNickName + '\'' +
                '}';
    }
}
