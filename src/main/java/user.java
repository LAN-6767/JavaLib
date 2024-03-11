import com.uts.IField2HttpRequestParam;
public class user implements IField2HttpRequestParam {
    private String name;
    private String age;
    private String sex;
    private String addr;
    private String lad;
    public user(String name, String age, String sex, String addr, String lad) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.addr = addr;
        this.lad = lad;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }


}
