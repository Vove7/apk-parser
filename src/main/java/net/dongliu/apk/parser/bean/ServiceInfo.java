package net.dongliu.apk.parser.bean;

/**
 * Created by Administrator.
 * Date: 2018/11/25
 */
public class ServiceInfo {
    private String name;
    private String permission;

    public ServiceInfo(String name, String permission) {
        this.name = name;
        this.permission = permission;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", permission='" + permission + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }
}
