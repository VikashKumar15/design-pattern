package creational_design_pattern.prototype_design_pattern;

public class Client {

    public static void main(String[] args) {

        NetwrokConnection connection = new NetwrokConnection();
        connection.setIp("192.168.4.4");
        connection.loadVeryImpData();
        System.out.println(connection);
        NetwrokConnection connection1 = connection.clone();
        System.out.println(connection1);

    }
}
