package classes;

public class Contact {
    private String name;
    private String phone;
    private String work;
    private String home;
    private String city;

    public Contact() {
    }

    public void printData() {
        String optionalInfo = "";

        if (!this.getWork().replaceAll(" ", "").equals("")) {
            optionalInfo += ", work=" + this.getWork();
        }
        if (!this.getHome().replaceAll(" ", "").equals("")) {
            optionalInfo += ", phone=" + this.getHome();
        }
        if (!this.getCity().replaceAll(" ", "").equals("")) {
            optionalInfo += ", city=" + this.getCity();
        }

        System.out.print("<" + this.getName() + "> ");
        System.out.print("(");
        System.out.print("mobile=" + this.getPhone());
        System.out.print(optionalInfo);
        System.out.println(")");
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getWork() {
        return work;
    }

    public String getHome() {
        return home;
    }

    public String getCity() {
        return city;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
