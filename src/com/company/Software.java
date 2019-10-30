package com.company;

public class Software extends Product {
    private String programmer;
    private String platform; // linux, mac, or pc
    private String os;

    @Override
    public boolean equals(Object obj) {
        Software software = (Software) obj;
        return super.equals(obj)&&
                programmer.equals(software.getProgrammer()) &&
                platform.equals(software.getPlatform()) &&
                os.equals(software.getOs());
    }

    @Override
    public String toString(){
        return super.toString() +
                "Software written by "+ programmer +"\n" +
                "Platform:           "+ platform + "\n" +
                "OS:                 "+ os +"\n";

    }

    public String getProgrammer() {
        return programmer;
    }

    public void setProgrammer(String programmer) {
        this.programmer = programmer;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }
}
