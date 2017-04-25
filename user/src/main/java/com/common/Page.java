package com.common;

import java.util.List;

public class Page<T> {

    public static final int DEFAULT_PAGE_SIZE = 2;

    protected int pageNo = 2; // ��ǰҳ, Ĭ��Ϊ��1ҳ
    protected int pageSize = DEFAULT_PAGE_SIZE; // ÿҳ��¼��
    protected long totalRecord = -1; // �ܼ�¼��, Ĭ��Ϊ-1, ��ʾ��Ҫ��ѯ
    protected int totalPage = -1; // ��ҳ��, Ĭ��Ϊ-1, ��ʾ��Ҫ����

    protected List<T> results; // ��ǰҳ��¼List��ʽ


    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
        computeTotalPage();
    }

    public long getTotalRecord() {
        return totalRecord;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalRecord(long totalRecord) {
        this.totalRecord = totalRecord;
        computeTotalPage();
    }

    protected void computeTotalPage() {
        if (getPageSize() > 0 && getTotalRecord() > -1) {
            this.totalPage = (int) (getTotalRecord() % getPageSize() == 0 ? getTotalRecord() / getPageSize() : getTotalRecord() / getPageSize() + 1);
        }
    }

    public List<T> getResults() {
        return results;
    }

    public void setResults(List<T> results) {
        this.results = results;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder().append("Page [pageNo=").append(pageNo).append(", pageSize=").append(pageSize)
                .append(", totalRecord=").append(totalRecord < 0 ? "null" : totalRecord).append(", totalPage=")
                .append(totalPage < 0 ? "null" : totalPage).append(", results=").append(results == null ? "null" : results).append("]");
        return builder.toString();
    }

}