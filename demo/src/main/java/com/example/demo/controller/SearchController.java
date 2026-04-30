package com.example.demo.controller;

import com.example.demo.common.BaseResponse;
import com.example.demo.common.ResultUtils;
import com.example.demo.manager.SearchFacade;
import com.example.demo.model.dto.SearchRequest;
import com.example.demo.model.vo.SearchVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/search")
public class SearchController {

    @Autowired
    private SearchFacade searchFacade;

    /**
     * 聚合搜索接口
     * @param searchRequest 包含 searchText, type 等参数
     */
    @PostMapping("/all")
    public BaseResponse<SearchVO> searchAll(@RequestBody SearchRequest searchRequest) {
        // 核心：必须有 @RequestBody，前端 Payload 里的 java 才能变成 searchRequest 里的属性
        SearchVO searchVO = searchFacade.searchAll(searchRequest);
        return ResultUtils.success(searchVO);
    }
}
//package com.example.demo.controller;
//
//import com.example.demo.common.BaseResponse;
//import com.example.demo.common.ResultUtils;
//import com.example.demo.manager.SearchFacade;
//import com.example.demo.model.dto.SearchRequest;
//import com.example.demo.model.vo.SearchVO;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/search")
//public class SearchController {
//
//    @Autowired
//    private SearchFacade searchFacade;
//
//    @PostMapping("/all")
//    public BaseResponse<SearchVO> searchAll(@RequestBody SearchRequest searchRequest) {
//        // 直接调用门面类，Controller 变得极其干净
//        SearchVO searchVO = searchFacade.searchAll(searchRequest);
//        return ResultUtils.success(searchVO);
//    }
//}