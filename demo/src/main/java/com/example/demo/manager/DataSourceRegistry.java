package com.example.demo.manager;

import com.example.demo.service.datasource.DataSource;
import com.example.demo.service.datasource.PictureDataSource;
import com.example.demo.service.datasource.PostDataSource;
import com.example.demo.service.datasource.UserDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Component
public class DataSourceRegistry {

    @Autowired
    private PostDataSource postDataSource;

    @Autowired
    private PictureDataSource pictureDataSource;
    @Autowired
    private UserDataSource userDataSource;

    private Map<String, DataSource<?>> typeDataSourceMap;

    @PostConstruct
    public void doInit() {
        typeDataSourceMap = new HashMap<>();
        // 💡 显式注册，清晰且不容易出错
        typeDataSourceMap.put("post", postDataSource);
        typeDataSourceMap.put("picture", pictureDataSource);
        // 如果有用户搜索，继续添加：typeDataSourceMap.put("user", userDataSource);
        typeDataSourceMap.put("user", userDataSource);
    }

    public DataSource<?> getDataSourceByType(String type) {
        if (typeDataSourceMap == null) return null;
        return typeDataSourceMap.get(type);
    }
}
//package com.example.demo.manager;
//
//import com.example.demo.service.datasource.DataSource;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import jakarta.annotation.PostConstruct;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
///**
// * 数据源注册中心 (注册器模式)
// */
//@Component
//public class DataSourceRegistry {
//
//    @Autowired
//    private List<DataSource> dataSourceList; // 💡 Spring 魔法：自动注入所有实现类
//
//    private Map<String, DataSource> typeDataSourceMap;
//
//    /**
//     * 项目启动时执行，把所有数据源按类型存入 Map
//     */
//    @PostConstruct
//    public void doInit() {
//        typeDataSourceMap = new HashMap<>();
//        // 这里我们可以根据类名或者自定义类型来存，为了简单，我们先手动写死对应关系
//        // 后续高级玩法可以在 DataSource 接口里加一个 getType() 方法
//        typeDataSourceMap.put("post", dataSourceList.stream().filter(d -> d.getClass().getSimpleName().contains("Post")).findFirst().orElse(null));
//        typeDataSourceMap.put("picture", dataSourceList.stream().filter(d -> d.getClass().getSimpleName().contains("Picture")).findFirst().orElse(null));
//    }
//
//    /**
//     * 根据类型获取对应的数据源
//     */
//    public DataSource getDataSourceByType(String type) {
//        if (typeDataSourceMap == null) return null;
//        return typeDataSourceMap.get(type);
//    }
//}
