package com.zc.model;

public class ParamCrowdfunding {
    private  int      currentPage;

    private  int      pageSize;

    private  String   name;

    public ParamCrowdfunding(int currentPage, int pageSize, String name) {
        this.currentPage = currentPage;
        this.pageSize = pageSize;
        this.name = name;
    }

    public ParamCrowdfunding() {
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
