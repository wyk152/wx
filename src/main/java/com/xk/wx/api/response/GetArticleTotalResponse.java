package com.xk.wx.api.response;

import java.util.List;

import com.xk.wx.api.entity.ArticleTotal;

/**
 * @author peiyu
 */
public class GetArticleTotalResponse extends BaseResponse {

    private List<ArticleTotal> list;

    public List<ArticleTotal> getList() {
        return list;
    }

    public void setList(List<ArticleTotal> list) {
        this.list = list;
    }
}
