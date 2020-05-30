package com.example.model;

public class Header {

    private String version;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "Header{" +
                "version='" + version + '\'' +
                '}';
    }
}
