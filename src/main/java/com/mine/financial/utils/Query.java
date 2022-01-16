package com.mine.financial.utils;

import java.util.LinkedHashMap;
import java.util.Map;

public class Query extends LinkedHashMap<String, Object> {
    private static final long serialVersionUID = 1L;
    //
    private int curPage;
    // 每页条数
    private int pageSize;
    // 当前页数
    private int pageIndex;

    public Query(Map<String, Object> params) {
        this.putAll(params);
        // 分页参数
        this.curPage = Integer.parseInt(params.get("curPage").toString());
        this.pageSize = Integer.parseInt(params.get("pageSize").toString());
        this.pageIndex = params.get("curPage") == null ? 1 : Integer.parseInt(params.get("curPage").toString());
        this.put("curPage", curPage);
        this.put("page", (pageIndex-1) * pageSize);
        this.put("limit", pageSize);
    }

    public int getCurPage() {
        return curPage;
    }

    public void setCurPage(int curPage) {
        this.put("curPage", curPage);
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}