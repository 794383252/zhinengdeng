package Model;

/**
 * Created by Administrator on 2016/8/3.
 */
public class Connertor {
    private String Name;
    private String Type;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    @Override
    public String toString() {
        return "Connertor{" +
                "Name='" + Name + '\'' +
                ", Type='" + Type + '\'' +
                '}';
    }
}
