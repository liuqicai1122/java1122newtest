package com.offcn.bean;

public class Page {
    private  int currentPage; //当前页
    private  int totalPage;//总页数
    private  int totalNum; //总条数
    public  static  final int PAGESIZE=3;//每页展示人条数

    public Page() {
    }

    public Page(int currentPage, int totalPage, int totalNum) {
        this.currentPage = currentPage;
        this.totalPage = totalPage;
        this.totalNum = totalNum;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(int totalNum) {
        this.totalNum = totalNum;
    }

    public static int getPAGESIZE() {
        return PAGESIZE;
    }
}
