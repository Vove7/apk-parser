package net.dongliu.apk.parser.bean;

/**
 * Created by Administrator.
 * Date: 2018/11/24
 */
public class ActivityInfo {
    private String lable;
    private String name;
    private boolean isMainActivity;

    @Override
    public String toString() {
        return "{" +
                "lable='" + lable + '\'' +
                ", name='" + name + '\'' +
                ", isMainActivity=" + isMainActivity +
                '}';
    }

    public ActivityInfo(String lable, String name) {
        this.lable = lable;
        this.name = name;
    }

    public String getLable() {
        return lable;
    }

    public void setLable(String lable) {
        this.lable = lable;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMainActivity() {
        return isMainActivity;
    }

    public void setMainActivity(boolean mainActivity) {
        isMainActivity = mainActivity;
    }
}
