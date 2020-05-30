package com.example.model;

public class ProductDetails {


    private Header header;
    private Body body;

    public Header getHeader() {
        return header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "ProductDetails{" +
                "header=" + header +
                ", body=" + body +
                '}';
    }
}
