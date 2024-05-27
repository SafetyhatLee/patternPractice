public class User {
    String nickname; // 개인 정보
    Module myHome;
    int key;
    boolean isAdmin;

    public User(String nickname, Module m, boolean isAdmin) {
        this.nickname = nickname;
        myHome = m; key = m.hashCode();
        this.isAdmin = isAdmin;
    }
}
