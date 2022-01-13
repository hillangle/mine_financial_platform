package com.mine.financial.service;

import com.mine.financial.mapper.domain.BookInfo;
import com.mine.financial.mapper.BookInfoMapper;
import com.mine.financial.utils.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class BookInfoService {

    @Autowired
    private BookInfoMapper bookInfoMapper;

    /**
     * 借贷记账列表查询
     */
    public PageUtils queryBookInfos(Map<String, Object> map){
        List<BookInfo> bookInfos = bookInfoMapper.queryBookInfos(map);
        PageUtils pageUtils = new PageUtils(bookInfos,bookInfos.size());
        return pageUtils;
    }

    /**
     * 借贷记账列表查询
     */
    public void addBookInfo(BookInfo bookInfo){
        bookInfoMapper.addBookInfo(bookInfo);
    }
}
