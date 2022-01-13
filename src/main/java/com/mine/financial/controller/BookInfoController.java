package com.mine.financial.controller;

import com.mine.financial.mapper.domain.BookInfo;
import com.mine.financial.service.BookInfoService;
import com.mine.financial.utils.PageUtils;
import com.mine.financial.utils.Query;
import com.mine.financial.utils.ResultUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@Slf4j
@RequestMapping("/book")
@CrossOrigin(originPatterns = "*", methods = {RequestMethod.POST})
public class BookInfoController {

    @Autowired
    private BookInfoService bookInfoService;

    /**
     * 查询记账单列表
     */
    @PostMapping("/get/bookList")
    @ResponseBody
    public PageUtils queryBookInfos(@RequestParam Map<String, Object> params){
        Query query = new Query(params);
        return bookInfoService.queryBookInfos(query);
    }

    /**
     * 新增记账单
     */
    @PostMapping("/put/bookInfo")
    @ResponseBody
    public ResultUtils addBookInfo(@RequestBody BookInfo bookInfo){
        try{
            bookInfoService.addBookInfo(bookInfo);
            return ResultUtils.ok("记账提交成功");
        }catch (Exception e){
            log.error("记账失败，{}",e);
            return ResultUtils.error("记账提交失败");
        }
    }
}
