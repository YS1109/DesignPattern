package com.ysoztf.prototype;

public class OriginEntity implements Cloneable{
    private int a;
    private String b;
    private Double c;
    private Integer d;
    private OriginEntityItem e;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public Double getC() {
        return c;
    }

    public void setC(Double c) {
        this.c = c;
    }

    public Integer getD() {
        return d;
    }

    public void setD(Integer d) {
        this.d = d;
    }

    public OriginEntityItem getE() {
        return e;
    }

    public void setE(OriginEntityItem e) {
        this.e = e;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        OriginEntity originEntity = (OriginEntity) super.clone();
        originEntity.setE((OriginEntityItem) e.clone());
        return originEntity;
    }
}
