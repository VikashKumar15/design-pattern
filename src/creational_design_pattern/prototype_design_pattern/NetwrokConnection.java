package creational_design_pattern.prototype_design_pattern;

public class NetwrokConnection implements Cloneable{

    private String ip;
    private String importantData;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getImportantData() {
        return importantData;
    }

    public void setImportantData(String importantData) {
        this.importantData = importantData;
    }

    @Override
    public String
    toString() {
        return "NetwrokConnection{" +
                "ip='" + ip + '\'' +
                ", importantData='" + importantData + '\'' +
                '}';
    }

    public void loadVeryImpData() {
        // this is taking very long time to laod.
        this.importantData = "This is very imp data";
        try {
            Thread.sleep(5000);
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }

    @Override
    public NetwrokConnection clone() {
        try {
            NetwrokConnection clone = (NetwrokConnection) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
