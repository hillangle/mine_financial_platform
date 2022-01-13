package com.mine.financial.mapper;

import com.mine.financial.mapper.domain.BookInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface BookInfoMapper {
    /**
     * 借贷记账列表查询
     */
    List<BookInfo> queryBookInfos(Map<String, Object> map);

    /**
     * 添加借贷记账
     */
    void addBookInfo(BookInfo bookInfo);
}
