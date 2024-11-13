package com.example;

public class OuterBean {
    private InnerBean innerBean;

    public void setInnerBean(InnerBean innerBean) {
        this.innerBean = innerBean;
    }

    public InnerBean getInnerBean() {
        return innerBean;
    }
}
