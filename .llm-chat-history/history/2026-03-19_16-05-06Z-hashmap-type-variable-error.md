<!-- 由 LLM Chat History 扩展生成 -->
<!-- Cursor 会话 98e0451d-8b1f-4aa9-bf7c-9203a086c892（2026-03-19 16:05:06Z） -->

# HashMap type variable error

**创建时间**: 2026-03-19 16:05:06Z  
**消息数量**: 54 条 (用户: 2, 助手: 52)  
**会话ID**: `98e0451d-8b1f-4aa9-bf7c-9203a086c892`

---

## 💬 用户 #1

_2026-03-19 16:07:17Z_

根据代码帮我解决图中问题

---

## 🤖 助手 #2 (Agent)

_2026-03-19 16:08:37Z_

<details>
<summary><strong>💭 思考过程</strong></summary>

> **Running Glob for analysis**
>
> I'm planning to run Glob for the EmployeeController.java file and possibly for PathUtils.upload as well, along with the specific controller method. It seems like a good way to gather necessary information for processing. I just want to ensure I capture all relevant details while keeping an eye on any nuances. It’s a straightforward approach, but I want to be thorough in analyzing those components!

</details>

---

## 🤖 助手 #3 (Agent)

_2026-03-19 16:08:40Z_

我先读取你截图里报错对应的 `EmployeeController.java`（以及可能用到的 `PathUtils` / 返回类型相关代码），定位具体的泛型/类型推断错误，然后给出最小改动的修复方案。接下来我会在项目里搜到对应的 `uploadImg` 方法并逐行核对。

---

## 🤖 助手 #4 (Agent)

_2026-03-19 16:08:41Z_

**🔧 工具调用** (1 个)

<details>
<summary>🔍 **glob_file_search** — Glob 搜索 "" • 0 个文件</summary>

_状态：completed_

**参数**

```json
{
  "targetDirectory": "c:\\Users\\a2173\\Documents\\WeChat Files\\wxid_5q2ox9w8g7ci22\\FileStorage\\File\\2025-09\\20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-backend\\src\\main\\java",
  "globPattern": "**/*Employee*Controller*.java"
}
```

**结果**

<details>
<summary><em>展开查看结果 / View Result</em></summary>

```json
{
  "directories": [
    {
      "absPath": "c:\\Users\\a2173\\Documents\\WeChat Files\\wxid_5q2ox9w8g7ci22\\FileStorage\\File\\2025-09\\20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-backend\\src\\main\\java",
      "files": [
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-backend\\src\\main\\java\\com\\shanzhu\\market\\controller\\EmployeeController.java"
        }
      ],
      "totalFiles": 1
    }
  ]
}
```

</details>
</details>

---

## 🤖 助手 #5 (Agent)

_2026-03-19 16:08:41Z_

**🔧 工具调用** (1 个)

<details>
<summary>🔍 **glob_file_search** — Glob 搜索 "" • 0 个文件</summary>

_状态：completed_

**参数**

```json
{
  "targetDirectory": "c:\\Users\\a2173\\Documents\\WeChat Files\\wxid_5q2ox9w8g7ci22\\FileStorage\\File\\2025-09\\20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-backend\\src\\main\\java",
  "globPattern": "**/*PathUtils*.java"
}
```

**结果**

<details>
<summary><em>展开查看结果 / View Result</em></summary>

```json
{
  "directories": [
    {
      "absPath": "c:\\Users\\a2173\\Documents\\WeChat Files\\wxid_5q2ox9w8g7ci22\\FileStorage\\File\\2025-09\\20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-backend\\src\\main\\java",
      "files": [
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-backend\\src\\main\\java\\com\\shanzhu\\market\\common\\util\\PathUtils.java"
        }
      ],
      "totalFiles": 1
    }
  ]
}
```

</details>
</details>

---

## 🤖 助手 #6 (Agent)

_2026-03-19 16:08:41Z_

**🔧 工具调用** (1 个)

<details>
<summary>🔧 **ripgrep_raw_search**</summary>

_状态：completed_

**参数**

```json
{
  "pattern": "uploadImg\\s*\\(",
  "path": "c:\\Users\\a2173\\Documents\\WeChat Files\\wxid_5q2ox9w8g7ci22\\FileStorage\\File\\2025-09\\20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-backend\\src\\main\\java",
  "outputMode": "content",
  "caseInsensitive": false,
  "multiline": false,
  "toolCallId": "call_JKu26HKAaLbkNI362cy8AcW9\nfc_082cded37166bffd0169bc1f8dfcc081909172cb98bd3d02c0",
  "offset": 0
}
```

**结果**

```json
{}
```
</details>

---

## 🤖 助手 #7 (Agent)

_2026-03-19 16:08:46Z_

我已经定位到截图中同样的 `uploadImg` 方法在 `EmployeeController.java`（以及 `GoodsController.java` 里也有一份同名逻辑）。接下来我会把这两个文件和 `PathUtils.java` 的相关实现读出来，找出触发“泛型/类型推断需要 2 个参数”的具体语句并修正。

---

## 🤖 助手 #8 (Agent)

_2026-03-19 16:08:47Z_

**🔧 工具调用** (1 个)

<details>
<summary>🔧 **read_file_v2**</summary>

_状态：completed_

**参数**

```json
{
  "path": "c:\\Users\\a2173\\Documents\\WeChat Files\\wxid_5q2ox9w8g7ci22\\FileStorage\\File\\2025-09\\20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-backend\\src\\main\\java\\com\\shanzhu\\market\\controller\\EmployeeController.java"
}
```

**结果**

<details>
<summary><em>展开查看结果 / View Result</em></summary>

```json
{
  "contents": "package com.shanzhu.market.controller;\n\nimport com.baomidou.mybatisplus.extension.plugins.pagination.Page;\nimport com.shanzhu.market.common.sercurity.annotation.HasPermisson;\nimport com.shanzhu.market.common.sercurity.annotation.NoRequireLogin;\nimport com.shanzhu.market.common.util.PathUtils;\nimport com.shanzhu.market.common.web.response.JsonResult;\nimport com.shanzhu.market.entity.domain.Employee;\nimport com.shanzhu.market.entity.query.QueryEmp;\nimport com.shanzhu.market.entity.vo.DetailEmpVo;\nimport com.shanzhu.market.entity.vo.EditEmpVo;\nimport com.shanzhu.market.service.IEmployeeService;\nimport org.springframework.validation.annotation.Validated;\nimport org.springframework.web.bind.annotation.*;\nimport org.springframework.web.multipart.MultipartFile;\n\nimport javax.annotation.Resource;\nimport javax.servlet.http.HttpServletRequest;\nimport java.util.HashMap;\nimport java.util.Map;\n\n@RestController\n@Validated\n@RequestMapping(\"/personnel_management/employee\")\npublic class EmployeeController {\n\n    @Resource\n    private IEmployeeService employeeService;\n\n    @HasPermisson(\"personnel_management:employee:list\")\n    @PostMapping(\"/list\")\n    public JsonResult pageByQo(QueryEmp qo) {\n        Page<Employee> page = employeeService.pageByQo(qo);\n        return JsonResult.success(page);\n    }\n\n    @HasPermisson(\"personnel_management:employee:list\")\n    @GetMapping(\"/detail\")\n    public JsonResult detail(Long uid) {\n        DetailEmpVo vo = employeeService.detail(uid);\n        return JsonResult.success(vo);\n    }\n\n    /**\n     * 上传图片到阿里云oss\n     * 返回网络图片地址,uploaded:1:成功 0:失败\n     */\n    @NoRequireLogin\n    @PostMapping(\"/uploadImg\")\n    public Map<String, Object> uploadImg(@RequestParam(\"file\") MultipartFile upload) {\n        HashMap map;\n        map = new HashMap<Object>();\n        if (upload != null && upload.getSize() > 0) {\n            String path;\n            try {\n                path = PathUtils.upload(upload);\n                map.put(\"uploaded\", 1);  //成功\n                map.put(\"url\", path);  //成功\n            } catch (Exception e) {\n                e.printStackTrace();\n                map.put(\"uploaded\", 0);  //失败\n                Map<String, Object> errorMap = new HashMap<>();\n                errorMap.put(\"message\", e.getMessage());\n                map.put(\"error\", errorMap);\n            }\n        } else {\n            map.put(\"uploaded\", 0);  //失败\n            Map<String, Object> errorMap = new HashMap<>();\n            errorMap.put(\"message\", \"上传失败，图片文件异常\");\n            map.put(\"error\", errorMap);\n        }\n        return map;\n    }\n\n    /*保存*/\n    @HasPermisson(\"personnel_management:employee:save\")\n    @PostMapping(\"/save\")\n    public JsonResult saveEmp(Employee employee, HttpServletRequest request) {\n        employeeService.saveEmp(employee, (String) request.getHeader(\"token\"));\n        return JsonResult.success();\n    }\n\n    /*修改按钮*/\n    @HasPermisson(\"personnel_management:employee:update\")\n    @GetMapping(\"/editbtn\")\n    public JsonResult editbtn(Long uid) {\n        EditEmpVo vo = employeeService.editbtn(uid);\n        return JsonResult.success(vo);\n    }\n\n    /*修改员工业务*/\n    @HasPermisson(\"personnel_management:employee:update\")\n    @PostMapping(\"/update\")\n    public JsonResult updateEmp(Employee employee, HttpServletRequest request) {\n        employeeService.updateEmp(employee, (String) request.getHeader(\"token\"));\n        return JsonResult.success();\n    }\n\n    /*离职业务*/\n    @HasPermisson(\"personnel_management:employee:update\")\n    @PostMapping(\"/deactivate\")\n    public JsonResult deactivate(Long id) {\n        employeeService.deactivate(id);\n        return JsonResult.success();\n    }\n\n    /*更改密码*/\n    @HasPermisson(\"personnel_management:employee:resetPwd\")\n    @PostMapping(\"/resetPwd\")\n    public JsonResult resetPwd(Long eid, String code) {\n        employeeService.resetPwd(eid, code);\n        return JsonResult.success();\n    }\n}\n",
  "totalLinesInFile": 115
}
```

</details>
</details>

---

## 🤖 助手 #9 (Agent)

_2026-03-19 16:08:47Z_

**🔧 工具调用** (1 个)

<details>
<summary>🔧 **read_file_v2**</summary>

_状态：completed_

**参数**

```json
{
  "path": "c:\\Users\\a2173\\Documents\\WeChat Files\\wxid_5q2ox9w8g7ci22\\FileStorage\\File\\2025-09\\20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-backend\\src\\main\\java\\com\\shanzhu\\market\\controller\\GoodsController.java"
}
```

**结果**

<details>
<summary><em>展开查看结果 / View Result</em></summary>

```json
{
  "contents": "package com.shanzhu.market.controller;\n\nimport com.baomidou.mybatisplus.extension.plugins.pagination.Page;\nimport com.shanzhu.market.common.sercurity.annotation.NoRequireLogin;\nimport com.shanzhu.market.common.util.PathUtils;\nimport com.shanzhu.market.common.web.response.JsonResult;\nimport com.shanzhu.market.entity.domain.DetailStoreGoods;\nimport com.shanzhu.market.entity.domain.Goods;\nimport com.shanzhu.market.entity.query.QueryGoods;\nimport com.shanzhu.market.entity.vo.GoodsListVo;\nimport com.shanzhu.market.service.IGoodsService;\nimport org.springframework.validation.annotation.Validated;\nimport org.springframework.web.bind.annotation.*;\nimport org.springframework.web.multipart.MultipartFile;\n\nimport javax.annotation.Resource;\nimport javax.servlet.http.HttpServletRequest;\nimport javax.validation.constraints.NotNull;\nimport java.util.HashMap;\nimport java.util.List;\nimport java.util.Map;\n\n@RestController\n@Validated\n@RequestMapping(\"/goods_management/goods\")\npublic class GoodsController {\n\n    @Resource\n    private IGoodsService goodsService;\n\n    /*查询信息*/\n    @PostMapping(\"/queryPageByQo\")\n    public JsonResult queryPageByQo(QueryGoods qo) {\n        Page<GoodsListVo> page = goodsService.queryPageByQo(qo);\n        return JsonResult.success(page);\n    }\n    /**\n     * 上传图片到阿里云oss\n     * 返回网络图片地址,uploaded:1:成功 0:失败\n     */\n    @NoRequireLogin\n    @PostMapping(\"/uploadImg\")\n    public Map<String, Object> uploadImg(@RequestParam(\"file\") MultipartFile upload) {\n        Map<String, Object> map = new HashMap<>();\n        if (upload != null && upload.getSize() > 0) {\n            String path = \"\";\n            try {\n                path = PathUtils.upload(upload);\n                map.put(\"uploaded\", 1);  //成功\n                map.put(\"url\", path);  //成功\n            } catch (Exception e) {\n                e.printStackTrace();\n                map.put(\"uploaded\", 0);  //失败\n                Map<String, Object> errorMap = new HashMap<>();\n                errorMap.put(\"message\", e.getMessage());\n                map.put(\"error\", errorMap);\n            }\n        } else {\n            map.put(\"uploaded\", 0);  //失败\n            Map<String, Object> errorMap = new HashMap<>();\n            errorMap.put(\"message\", \"上传失败，图片文件异常\");\n            map.put(\"error\", errorMap);\n        }\n        return map;\n    }\n    /*保存*/\n    @PostMapping(\"/save\")\n    public JsonResult saveGoods(Goods goods, HttpServletRequest request){\n        goodsService.saveGoods(goods,(String) request.getHeader(\"token\"));\n        return JsonResult.success();\n    }\n\n    /*上/下架*/\n    @PostMapping(\"/upOrdown\")\n    public JsonResult upOrdown(@NotNull(message = \"商品编号不能为空\") Long gid, String state,HttpServletRequest request){\n        goodsService.upOrdown(gid,state,(String) request.getHeader(\"token\"));\n        return JsonResult.success();\n    }\n    @GetMapping(\"/queryGoodsById\")\n    public JsonResult queryGoodsById(@NotNull(message = \"商品编号不能为空\") Long id){\n        return JsonResult.success(goodsService.getById(id));\n    }\n\n    @PostMapping(\"/update\")\n    public JsonResult update(Goods goods, HttpServletRequest request){\n        goodsService.updateGoods(goods,(String)request.getHeader(\"token\"));\n        return JsonResult.success();\n    }\n\n    @GetMapping(\"/selected_goodsAll\")\n    public JsonResult selected_goodsAll(){\n        List<Map<String,Object>> list=goodsService.selected_goodsAll();\n        return JsonResult.success(list);\n    }\n\n    @GetMapping(\"/selected_storeAll\")\n    public JsonResult selected_storeAll(){\n        List<Map<String,Object>> list=goodsService.selected_storeAll();\n        return JsonResult.success(list);\n    }\n\n    /*退还商品入库*/\n    @PostMapping(\"/returnGoods\")\n    public JsonResult returnGoods(DetailStoreGoods detailStoreGoods, HttpServletRequest request){\n        goodsService.returnGoods(detailStoreGoods,(String) request.getHeader(\"token\"));\n        return JsonResult.success();\n    }\n\n}\n",
  "totalLinesInFile": 110
}
```

</details>
</details>

---

## 🤖 助手 #10 (Agent)

_2026-03-19 16:08:47Z_

**🔧 工具调用** (1 个)

<details>
<summary>🔧 **read_file_v2**</summary>

_状态：completed_

**参数**

```json
{
  "path": "c:\\Users\\a2173\\Documents\\WeChat Files\\wxid_5q2ox9w8g7ci22\\FileStorage\\File\\2025-09\\20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-backend\\src\\main\\java\\com\\shanzhu\\market\\common\\util\\PathUtils.java"
}
```

**结果**

<details>
<summary><em>展开查看结果 / View Result</em></summary>

```json
{
  "contents": "package com.shanzhu.market.common.util;\n\nimport org.springframework.web.multipart.MultipartFile;\n\nimport java.io.File;\nimport java.io.FileOutputStream;\nimport java.io.UnsupportedEncodingException;\nimport java.net.URLDecoder;\n\npublic class PathUtils {\n    public static String getClassLoadRootPath() {\n        String path = \"\";\n        try {\n            String prePath = URLDecoder.decode(PathUtils.class.getClassLoader().getResource(\"\").getPath(),\"utf-8\").replace(\"/target/classes\", \"\");\n            String osName = System.getProperty(\"os.name\");\n            if (osName.toLowerCase().startsWith(\"mac\")) {\n                // 苹果\n                path = prePath.substring(0, prePath.length() - 1);\n            } else if (osName.toLowerCase().startsWith(\"windows\")) {\n                // windows\n                path = prePath.substring(1, prePath.length() - 1);\n            } else if(osName.toLowerCase().startsWith(\"linux\") || osName.toLowerCase().startsWith(\"unix\")) {\n                // unix or linux\n                path = prePath.substring(0, prePath.length() - 1);\n            } else {\n                path = prePath.substring(1, prePath.length() - 1);\n            }\n        } catch (UnsupportedEncodingException e) {\n            e.printStackTrace();\n        }\n        return path;\n    }\n\n    public static String upload(MultipartFile multipartFile) {\n        String res = null;  // 返回网络路径\n        try {\n            String staticDir = PathUtils.getClassLoadRootPath() + \"/src/main/resources/static/files/\";\n            // 如果结果目录不存在，则创建目录\n            File resDirFile = new File(staticDir);\n            if(!resDirFile.exists()) {\n                boolean flag = resDirFile.mkdirs();\n                if(!flag) throw new RuntimeException(\"创建结果目录失败\");\n            }\n            // 获取MultipartFile的字节数组\n            byte[] fileBytes = multipartFile.getBytes();\n\n            // 创建文件对象\n\n            // 加个时间戳防止重名\n            String newFileName = System.currentTimeMillis() + \"_\" + multipartFile.getOriginalFilename();\n            res = \"/files/\" + newFileName;\n            // 写文件\n            File file = new File(staticDir + newFileName);\n\n            // 将字节数组写入文件\n            FileOutputStream fos = new FileOutputStream(file);\n            fos.write(fileBytes);\n            fos.close();\n\n        } catch (Exception e) {\n            e.printStackTrace();\n        }\n        return res;\n    }\n\n}\n",
  "totalLinesInFile": 67
}
```

</details>
</details>

---

## 🤖 助手 #11 (Agent)

_2026-03-19 16:08:51Z_

<details>
<summary><strong>💭 思考过程</strong></summary>

> **Patching EmployeeController**
>
> I need to apply a patch to the EmployeeController, focusing on updating lines 50-52. The plan is to change the code from initializing a HashMap without type parameters to using a typed declaration: `Map<String, Object> map = new HashMap<>();` After making this modification, I’ll ensure the method returns the map properly. Then I'll run ReadLints to check for any compilation errors in that file or other parts. Once that's done, I'll proceed with applying the patch.

</details>

---

## 🤖 助手 #12 (Agent)

_2026-03-19 16:09:05Z_

我已经把报错位置对应到了 `EmployeeController.uploadImg`：你这里写了 `new HashMap<Object>()`，但 `HashMap` 需要两个泛型参数（`<K, V>`），所以会提示“需要 2 个类型参数/泛型目标”。接下来我会把它改成和 `GoodsController` 一样的 `Map<String, Object> map = new HashMap<>();`。

---

## 🤖 助手 #13 (Agent)

_2026-03-19 16:09:06Z_

**🔧 工具调用** (1 个)

<details>
<summary>🔧 **edit_file_v2**</summary>

_状态：completed_

**参数**

```json
"{\"relativeWorkspacePath\":\"c:/Users/a2173/Documents/WeChat Files/wxid_5q2ox9w8g7ci22/FileStorage/File/2025-09/20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发/20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发/superMarket-backend/src/main/java/com/shanzhu/market/controller/EmployeeController.java\",\"streamingContent\":\"@@\\n     @NoRequireLogin\\n     @PostMapping(\\\"/uploadImg\\\")\\n     public Map<String, Object> uploadImg(@RequestParam(\\\"file\\\") MultipartFile upload) {\\n-        HashMap map;\\n-        map = new HashMap<Object>();\\n+        Map<String, Object> map = new HashMap<>();\\n         if (upload != null && upload.getSize() > 0) {\\n             String path;\\n             try {\\n                 path = PathUtils.upload(upload);\\n                 map.put(\\\"uploaded\\\", 1);  //成功\\n*** End Patch\",\"noCodeblock\":true,\"cloudAgentEdit\":false}"
```

**结果**

```json
{
  "beforeContentId": "composer.content.679aee8301bae636d09ecfd07be5d0caeb475437c3a624ee9c6d79cec03b143b",
  "afterContentId": "composer.content.abd9232d004051b727807f2337847304dd9020196cae6e86eb06a1435379ae79"
}
```
</details>

---

## 🤖 助手 #14 (Agent)

_2026-03-19 16:09:18Z_

已完成代码修复：`EmployeeController.uploadImg` 里把错误的 `new HashMap<Object>()` 改成了 `Map<String, Object> map = new HashMap<>();`。接下来我会运行一下该文件的静态检查/IDE lints，确保没有新的泛型或类型相关报错。

---

## 🤖 助手 #15 (Agent)

_2026-03-19 16:09:25Z_

**🔧 工具调用** (1 个)

<details>
<summary>🔧 **read_lints**</summary>

_状态：error_

**结果**

```json
{}
```
</details>

---

## 🤖 助手 #16 (Agent)

_2026-03-19 16:09:31Z_

lints 获取超时了，我会再用同一个文件的绝对路径重新拉取一次诊断信息；如果仍超时，我就改为读一下这个文件周边是否还有明显类型问题（通常就这一处泛型写错）。

---

## 🤖 助手 #17 (Agent)

_2026-03-19 16:09:31Z_

**🔧 工具调用** (1 个)

<details>
<summary>🔧 **read_lints**</summary>

_状态：completed_

**参数**

```json
{
  "paths": [
    "c:/Users/a2173/Documents/WeChat Files/wxid_5q2ox9w8g7ci22/FileStorage/File/2025-09/20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发/20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发/superMarket-backend/src/main/java/com/shanzhu/market/controller/EmployeeController.java"
  ]
}
```

**结果**

```json
{
  "linterErrorsByFile": [
    {
      "relativeWorkspacePath": "c:/Users/a2173/Documents/WeChat Files/wxid_5q2ox9w8g7ci22/FileStorage/File/2025-09/20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发/20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发/superMarket-backend/src/main/java/com/shanzhu/market/controller/EmployeeController.java"
    }
  ]
}
```
</details>

---

## 🤖 助手 #18 (Agent)

_2026-03-19 16:09:35Z_

**🔧 工具调用** (1 个)

<details>
<summary>🔧 **ripgrep_raw_search**</summary>

_状态：completed_

**参数**

```json
{
  "pattern": "new\\s+HashMap<\\s*Object\\s*>\\s*\\(",
  "path": "c:\\Users\\a2173\\Documents\\WeChat Files\\wxid_5q2ox9w8g7ci22\\FileStorage\\File\\2025-09\\20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-backend\\src\\main\\java",
  "caseInsensitive": false,
  "multiline": false,
  "toolCallId": "call_0R0SFmHqUF2lndZLtnnlDQT4\nfc_082cded37166bffd0169bc1fc307b88190b2eab95b4e969188",
  "offset": 0
}
```

**结果**

```json
{}
```
</details>

---

## 🤖 助手 #19 (Agent)

_2026-03-19 16:09:41Z_

我已经确认这处具体泛型错误已经修复且 `EmployeeController` 没有 lints 报错；接着我再快速全局搜一下项目里是否还有类似的 `HashMap<Object>` / 原始类型写法，避免同类问题隐藏在别的控制器里。

---

## 🤖 助手 #20 (Agent)

_2026-03-19 16:09:42Z_

**🔧 工具调用** (1 个)

<details>
<summary>🔧 **ripgrep_raw_search**</summary>

_状态：completed_

**参数**

```json
{
  "pattern": "\\bHashMap\\s+map\\b|new\\s+HashMap<\\s*>\\s*\\(\\s*\\)",
  "path": "c:\\Users\\a2173\\Documents\\WeChat Files\\wxid_5q2ox9w8g7ci22\\FileStorage\\File\\2025-09\\20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-backend\\src\\main\\java",
  "caseInsensitive": false,
  "multiline": false,
  "toolCallId": "call_XcNadtd1vevkH2X9La6ZFklY\nfc_082cded37166bffd0169bc1fc6460c8190b2ef93810bf49cb2",
  "offset": 0
}
```

**结果**

```json
{}
```
</details>

---

## 🤖 助手 #21 (Agent)

_2026-03-19 16:09:47Z_

<details>
<summary><strong>💭 思考过程</strong></summary>

> **Fixing generics usage**
>
> I need to respond with a solution to fix the generics. Right now, using `new HashMap<Object>()` is incorrect because `HashMap<K,V>` expects two type arguments. It should be `new HashMap<>()` or `new HashMap<String,Object>()`. In the method signature, I should also use `Map<String,Object>`. 
>
> To illustrate the changes, I’ll show that in `EmployeeController.uploadImg`, we can change to `Map<String,Object> map = new HashMap<>();`. I might consider including a code excerpt in markdown with some line numbers, possibly citing 48:73 to provide clarity.
> **Preparing code excerpt**
>
> I want to include a small code excerpt, not too huge. I’ll produce a code snippet with the necessary modifications, citing the relevant line numbers for clarity. The lines I've changed are 51-52, and I'll cite the range from 48-72 using the format ```48:72:path``` for referencing.
>
> To ensure accuracy, I’ll confirm the current file lines. Instead of doing a full read, I’ll safely check the specific part around lines 44-75 in the `EmployeeController` to confirm the line numbers.

</details>

---

## 🤖 助手 #22 (Agent)

_2026-03-19 16:09:55Z_

我再把 `EmployeeController` 里 `uploadImg` 这一段代码读一小截，确保行号/内容与我刚才的改动一致，然后把关键修复点用代码片段贴给你对照。

---

## 🤖 助手 #23 (Agent)

_2026-03-19 16:09:55Z_

**🔧 工具调用** (1 个)

<details>
<summary>🔧 **read_file_v2**</summary>

_状态：completed_

**参数**

```json
{
  "path": "c:\\Users\\a2173\\Documents\\WeChat Files\\wxid_5q2ox9w8g7ci22\\FileStorage\\File\\2025-09\\20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-backend\\src\\main\\java\\com\\shanzhu\\market\\controller\\EmployeeController.java",
  "offset": 40,
  "limit": 40
}
```

**结果**

<details>
<summary><em>展开查看结果 / View Result</em></summary>

```json
{
  "contents": "        DetailEmpVo vo = employeeService.detail(uid);\n        return JsonResult.success(vo);\n    }\n\n    /**\n     * 上传图片到阿里云oss\n     * 返回网络图片地址,uploaded:1:成功 0:失败\n     */\n    @NoRequireLogin\n    @PostMapping(\"/uploadImg\")\n    public Map<String, Object> uploadImg(@RequestParam(\"file\") MultipartFile upload) {\n        Map<String, Object> map = new HashMap<>();\n        if (upload != null && upload.getSize() > 0) {\n            String path;\n            try {\n                path = PathUtils.upload(upload);\n                map.put(\"uploaded\", 1);  //成功\n                map.put(\"url\", path);  //成功\n            } catch (Exception e) {\n                e.printStackTrace();\n                map.put(\"uploaded\", 0);  //失败\n                Map<String, Object> errorMap = new HashMap<>();\n                errorMap.put(\"message\", e.getMessage());\n                map.put(\"error\", errorMap);\n            }\n        } else {\n            map.put(\"uploaded\", 0);  //失败\n            Map<String, Object> errorMap = new HashMap<>();\n            errorMap.put(\"message\", \"上传失败，图片文件异常\");\n            map.put(\"error\", errorMap);\n        }\n        return map;\n    }\n\n    /*保存*/\n    @HasPermisson(\"personnel_management:employee:save\")\n    @PostMapping(\"/save\")\n    public JsonResult saveEmp(Employee employee, HttpServletRequest request) {\n        employeeService.saveEmp(employee, (String) request.getHeader(\"token\"));\n        return JsonResult.success();",
  "totalLinesInFile": 114
}
```

</details>
</details>

---

## 🤖 助手 #24 (Agent)

_2026-03-19 16:09:57Z_

<details>
<summary><strong>💭 思考过程</strong></summary>

> **Addressing code issues**
>
> I need to provide a code snippet citing lines 48-72. The error happens because the `HashMap<Object>` is missing a second type parameter; `HashMap<K,V>` requires two type arguments. It's important to use either diamond syntax or explicit generics. I’ll make sure my response is clear and concise, presenting the code neatly in a code fence for better readability. Let's keep it straightforward!

</details>

---

## 🤖 助手 #25 (Agent)

_2026-03-19 16:10:00Z_

图中这个报错是因为你在 `EmployeeController.uploadImg` 里写了错误泛型：`new HashMap<Object>()`。`HashMap` 的泛型参数是 `<K, V>`，所以需要 **2 个类型参数**（K 和 V），因此 IDE 提示“需要 2”。

我已经改成了和 `GoodsController` 一样的写法：`Map<String, Object> map = new HashMap<>();`

```48:72:c:/Users/a2173/Documents/WeChat Files/wxid_5q2ox9w8g7ci22/FileStorage/File/2025-09/20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发/20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发/superMarket-backend/src/main/java/com/shanzhu/market/controller/EmployeeController.java
@NoRequireLogin
@PostMapping("/uploadImg")
public Map<String, Object> uploadImg(@RequestParam("file") MultipartFile upload) {
    Map<String, Object> map = new HashMap<>();
    if (upload != null && upload.getSize() > 0) {
        String path;
        try {
            path = PathUtils.upload(upload);
            map.put("uploaded", 1);  //成功
            map.put("url", path);  //成功
        } catch (Exception e) {
            e.printStackTrace();
            map.put("uploaded", 0);  //失败
            Map<String, Object> errorMap = new HashMap<>();
            errorMap.put("message", e.getMessage());
            map.put("error", errorMap);
        }
    } else {
        map.put("uploaded", 0);  //失败
        Map<String, Object> errorMap = new HashMap<>();
        errorMap.put("message", "上传失败，图片文件异常");
        map.put("error", errorMap);
    }
    return map;
}
```

`EmployeeController` 当前也已经没有 lints 报错了。你可以直接重新编译/运行看是否还有其它新报错。

---

## 💬 用户 #26

_2026-03-19 16:18:28Z_

怎么进入网址

---

## 🤖 助手 #27 (Agent)

_2026-03-19 16:18:58Z_

我先确认一下你这个项目前后端分别跑在哪个端口（Vue 前端通常是 5173/8080/8081，Spring Boot 后端通常是 8080/8081）。我会在代码里搜 `server.port` 和前端的启动地址/端口，然后告诉你在浏览器里应该输入哪个网址。

---

## 🤖 助手 #28 (Agent)

_2026-03-19 16:19:01Z_

**🔧 工具调用** (1 个)

<details>
<summary>🔍 **glob_file_search** — Glob 搜索 "" • 0 个文件</summary>

_状态：completed_

**参数**

```json
{
  "targetDirectory": "c:\\Users\\a2173\\Documents\\WeChat Files\\wxid_5q2ox9w8g7ci22\\FileStorage\\File\\2025-09\\20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发",
  "globPattern": "**/package.json"
}
```

**结果**

<details>
<summary><em>展开查看结果 / View Result</em></summary>

```json
{
  "directories": [
    {
      "absPath": "c:\\Users\\a2173\\Documents\\WeChat Files\\wxid_5q2ox9w8g7ci22\\FileStorage\\File\\2025-09\\20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发",
      "files": [
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@jridgewell\\trace-mapping\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@hapi\\topo\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@jridgewell\\sourcemap-codec\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@hapi\\hoek\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@jridgewell\\set-array\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@jridgewell\\source-map\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@jridgewell\\resolve-uri\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@discoveryjs\\json-ext\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@ampproject\\remapping\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@achrinza\\node-ipc\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\at-least-node\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@jridgewell\\gen-mapping\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@babel\\helper-replace-supers\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\asynckit\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@babel\\helper-module-imports\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@babel\\helper-annotate-as-pure\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@babel\\helper-remap-async-to-generator\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\ansi-regex\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\async-validator\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\acorn-walk\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\ansi-html-community\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@babel\\helper-member-expression-to-functions\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@babel\\code-frame\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@babel\\generator\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\ansi-escapes\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@babel\\helper-hoist-variables\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@babel\\helper-optimise-call-expression\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@babel\\types\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\acorn-import-assertions\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\ajv-keywords\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@babel\\helper-create-regexp-features-plugin\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@babel\\helper-function-name\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\acorn\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@babel\\helper-module-transforms\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@babel\\helper-create-class-features-plugin\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@babel\\helper-builder-binary-assignment-operator-visitor\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\async\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\accepts\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\array-union\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\array-flatten\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@xtuc\\long\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\arch\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\anymatch\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@trysound\\sax\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@xtuc\\ieee754\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\ajv-formats\\node_modules\\json-schema-traverse\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@babel\\plugin-proposal-decorators\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\any-promise\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\ansi-styles\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@babel\\plugin-transform-named-capturing-groups-regex\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@soda\\get-current-script\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@babel\\plugin-proposal-class-properties\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\case-sensitive-paths-webpack-plugin\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@webassemblyjs\\wast-printer\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@babel\\plugin-transform-modules-umd\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\caniuse-lite\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@babel\\plugin-bugfix-v8-spread-parameters-in-optional-chaining\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@webassemblyjs\\wasm-parser\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@babel\\plugin-transform-modules-systemjs\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@babel\\plugin-transform-dotall-regex\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@babel\\plugin-transform-modules-commonjs\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@babel\\plugin-transform-exponentiation-operator\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@webassemblyjs\\wasm-opt\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@babel\\plugin-transform-modules-amd\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@webassemblyjs\\wasm-gen\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\caniuse-api\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@soda\\friendly-errors-webpack-plugin\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@babel\\plugin-transform-computed-properties\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@babel\\helper-split-export-declaration\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@babel\\highlight\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\camelcase\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@webassemblyjs\\wasm-edit\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\camel-case\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@babel\\helper-skip-transparent-expression-wrappers\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@soda\\friendly-errors-webpack-plugin\\node_modules\\supports-color\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@babel\\helpers\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@babel\\plugin-transform-class-static-block\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@soda\\friendly-errors-webpack-plugin\\node_modules\\has-flag\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@babel\\helper-simple-access\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@babel\\plugin-transform-spread\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@babel\\plugin-transform-private-property-in-object\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\callsites\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@webassemblyjs\\utf8\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@soda\\friendly-errors-webpack-plugin\\node_modules\\color-name\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@babel\\helper-wrap-function\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\call-bind\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@babel\\traverse\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@babel\\plugin-transform-async-generator-functions\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@babel\\plugin-transform-class-properties\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@soda\\friendly-errors-webpack-plugin\\node_modules\\color-convert\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@webassemblyjs\\leb128\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@babel\\plugin-transform-private-methods\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\bytes\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@babel\\plugin-transform-object-super\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@soda\\friendly-errors-webpack-plugin\\node_modules\\chalk\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\buffer-from\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@webassemblyjs\\ieee754\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\buffer\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@soda\\friendly-errors-webpack-plugin\\node_modules\\ansi-styles\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@babel\\plugin-transform-async-to-generator\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\browserslist\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@babel\\plugin-syntax-unicode-sets-regex\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@babel\\plugin-transform-optional-chaining\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\braces\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@webassemblyjs\\helper-wasm-section\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@babel\\plugin-transform-regenerator\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@sideway\\pinpoint\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@babel\\template\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@babel\\plugin-transform-unicode-sets-regex\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\brace-expansion\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@babel\\plugin-transform-unicode-escapes\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@webassemblyjs\\helper-wasm-bytecode\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@sideway\\formula\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@babel\\plugin-transform-typeof-symbol\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\boolbase\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@babel\\plugin-transform-unicode-regex\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@babel\\preset-modules\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@babel\\runtime\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@sideway\\address\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\bonjour-service\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@webassemblyjs\\helper-numbers\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@babel\\plugin-transform-unicode-property-regex\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@babel\\regjsgen\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@polka\\url\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@webassemblyjs\\helper-buffer\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@node-ipc\\js-queue\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\body-parser\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@webassemblyjs\\ast\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@leichtgewicht\\ip-codec\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@nodelib\\fs.walk\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@webassemblyjs\\helper-api-error\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@nodelib\\fs.stat\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@nodelib\\fs.scandir\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@webassemblyjs\\floating-point-hex-parser\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@vue\\babel-helper-vue-jsx-merge-props\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@types\\ws\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\body-parser\\node_modules\\qs\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@vue\\web-component-wrapper\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@vue\\babel-sugar-v-model\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@vue\\babel-preset-jsx\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@types\\sockjs\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@types\\serve-static\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@vue\\babel-sugar-v-model\\node_modules\\html-tags\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@vue\\babel-plugin-jsx\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@types\\serve-index\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\body-parser\\node_modules\\ms\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@types\\send\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@vue\\cli-overlay\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@vue\\babel-sugar-v-model\\node_modules\\camelcase\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\ajv\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@vue\\babel-helper-vue-transform-on\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@types\\retry\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@vue\\babel-sugar-v-on\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@vue\\babel-preset-app\\node_modules\\yallist\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@vue\\component-compiler-utils\\node_modules\\yallist\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\body-parser\\node_modules\\debug\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\balanced-match\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@vue\\babel-sugar-inject-h\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@types\\range-parser\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@vue\\component-compiler-utils\\node_modules\\postcss\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\body-parser\\node_modules\\bytes\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@types\\qs\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@vue\\babel-plugin-transform-vue-jsx\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@vue\\babel-sugar-v-on\\node_modules\\camelcase\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@vue\\babel-sugar-functional-vue\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@types\\parse-json\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@vue\\cli-service\\node_modules\\@vue\\vue-loader-v15\\node_modules\\hash-sum\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@vue\\babel-preset-app\\node_modules\\semver\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\babel-runtime\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@types\\normalize-package-data\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@vue\\component-compiler-utils\\node_modules\\picocolors\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@vue\\babel-plugin-transform-vue-jsx\\node_modules\\html-tags\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\bluebird\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@vue\\babel-sugar-composition-api-render-instance\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\address\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@vue\\cli-plugin-vuex\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\babel-runtime\\node_modules\\regenerator-runtime\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\babel-plugin-dynamic-import-node\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@vue\\component-compiler-utils\\node_modules\\lru-cache\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@vue\\babel-preset-app\\node_modules\\lru-cache\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@vue\\babel-sugar-composition-api-inject-h\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@vue\\component-compiler-utils\\node_modules\\hash-sum\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\babel-loader\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\babel-loader\\node_modules\\loader-utils\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\binary-extensions\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\big.js\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\babel-runtime\\node_modules\\core-js\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\batch\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@vue\\compiler-sfc\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\base64-js\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\core-util-is\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\babel-helper-vue-jsx-merge-props\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@types\\node\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@vue\\cli-shared-utils\\node_modules\\ansi-styles\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\core-js-compat\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@vue\\cli-shared-utils\\node_modules\\yallist\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@vue\\cli-shared-utils\\node_modules\\has-flag\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@vue\\cli-shared-utils\\node_modules\\color-convert\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@vue\\cli-shared-utils\\node_modules\\supports-color\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\autoprefixer\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@types\\minimist\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@vue\\cli-shared-utils\\node_modules\\color-name\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@vue\\cli-shared-utils\\node_modules\\lru-cache\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@types\\mime\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@vue\\cli-shared-utils\\node_modules\\chalk\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@types\\json-schema\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@vue\\cli-shared-utils\\node_modules\\semver\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@types\\http-proxy\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@types\\http-errors\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@types\\html-minifier-terser\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\core-js\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\colorette\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@types\\express-serve-static-core\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@types\\express\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\cli-spinners\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\colord\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@types\\estree\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\color-name\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@types\\eslint-scope\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\color-convert\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\clone-deep\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\cli-highlight\\node_modules\\supports-color\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@types\\eslint\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@types\\connect-history-api-fallback\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\cli-highlight\\node_modules\\has-flag\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\clone-deep\\node_modules\\is-plain-object\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\clone\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@types\\connect\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\cli-highlight\\node_modules\\color-name\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@types\\bonjour\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\cli-highlight\\node_modules\\color-convert\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@types\\body-parser\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\clean-css\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\cli-highlight\\node_modules\\chalk\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\domelementtype\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\depd\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\debug\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\cli-highlight\\node_modules\\ansi-styles\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\css-what\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\de-indent\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\csstype\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\delayed-stream\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\dom-serializer\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\csso\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\css-loader\\node_modules\\yallist\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\express\\node_modules\\qs\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\cli-cursor\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\define-properties\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\css-tree\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\copy-webpack-plugin\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\connect-history-api-fallback\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\define-lazy-prop\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\css-loader\\node_modules\\semver\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\express\\node_modules\\ms\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\copy-webpack-plugin\\node_modules\\schema-utils\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\dns-packet\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\concat-map\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\define-data-property\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\css-declaration-sorter\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\cssnano-utils\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\express\\node_modules\\debug\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\defaults\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\dns-equal\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\css-loader\\node_modules\\lru-cache\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\cross-spawn\\node_modules\\semver\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\express\\node_modules\\array-flatten\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\dir-glob\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\default-gateway\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\compression\\node_modules\\safe-buffer\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\detect-node\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\compression\\node_modules\\ms\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\destroy\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\cssesc\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\enhanced-resolve\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\compression\\node_modules\\debug\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\default-gateway\\node_modules\\which\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\compressible\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\events\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\css-select\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\default-gateway\\node_modules\\get-stream\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\chrome-trace-event\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\deepmerge\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\default-gateway\\node_modules\\shebang-regex\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\commondir\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\default-gateway\\node_modules\\execa\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\default-gateway\\node_modules\\cross-spawn\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\encodeurl\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\eventemitter3\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\cookie-signature\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\default-gateway\\node_modules\\shebang-command\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\default-gateway\\node_modules\\npm-run-path\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\chokidar\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\cookie\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\default-gateway\\node_modules\\is-stream\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\emojis-list\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\event-pubsub\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\default-gateway\\node_modules\\path-key\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\dot-case\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\etag\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\convert-source-map\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\duplexer\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\commander\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\emoji-regex\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\dotenv-expand\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\domhandler\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\domutils\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\esutils\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\chokidar\\node_modules\\glob-parent\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\electron-to-chromium\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\content-type\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\combined-stream\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\ee-first\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\content-disposition\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\estraverse\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\easy-stack\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\eslint-scope\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\dotenv\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\escalade\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\chalk\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\consolidate\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\esrecurse\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\error-stack-parser\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\escape-string-regexp\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\escape-html\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\esrecurse\\node_modules\\estraverse\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\es-module-lexer\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\error-ex\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\entities\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\handle-thing\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\css-minimizer-webpack-plugin\\node_modules\\json-schema-traverse\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\css-minimizer-webpack-plugin\\node_modules\\ajv-keywords\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\fs-extra\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\finalhandler\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\gzip-size\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\gensync\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\figures\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\graceful-fs\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\fastq\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\fs.realpath\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\finalhandler\\node_modules\\ms\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\fs-monkey\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\gopd\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\function-bind\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\get-intrinsic\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\get-caller-file\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\globby\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\finalhandler\\node_modules\\debug\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\fast-json-stable-stringify\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\globals\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\glob-to-regexp\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\is-binary-path\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\fill-range\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\is-arrayish\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\glob-parent\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\http-deceiver\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\html-tags\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\form-data\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\fresh\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\ipaddr.js\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\fraction.js\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\htmlparser2\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\inherits\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\fast-glob\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\follow-redirects\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\forwarded\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\html-minifier-terser\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\highlight.js\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\find-up\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\html-entities\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\import-fresh\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\find-cache-dir\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\hash-sum\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\has-proto\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\he\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\immutable\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\human-signals\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\has-property-descriptors\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\ignore\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\has-symbols\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\ieee754\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\hosted-git-info\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\has-flag\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\http-proxy-middleware\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\http-parser-js\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\http-errors\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\icss-utils\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\hpack.js\\node_modules\\string_decoder\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\hpack.js\\node_modules\\safe-buffer\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\iconv-lite\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\http-proxy\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\has\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\launch-editor\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\isobject\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\is-number\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\is-interactive\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\isexe\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\fast-glob\\node_modules\\glob-parent\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\klona\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\is-glob\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\isarray\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\is-extglob\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\micromatch\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\fast-deep-equal\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\is-fullwidth-code-point\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\methods\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\is-core-module\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\jsesc\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\is-docker\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\is-wsl\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\merge2\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\is-plain-object\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\is-unicode-supported\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\is-stream\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\merge-stream\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\kind-of\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\js-tokens\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\merge-source-map\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\joi\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\javascript-stringify\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\is-plain-obj\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\merge-descriptors\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\jsonfile\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\js-message\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\memfs\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\json5\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\jest-worker\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\media-typer\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\mdn-data\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\json-schema-traverse\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\jest-worker\\node_modules\\supports-color\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\json-parse-even-better-errors\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\jest-worker\\node_modules\\has-flag\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\json-parse-better-errors\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\make-dir\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\lodash.flatten\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\lodash.debounce\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\lodash.escape\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\lower-case\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\loader-utils\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\launch-editor-middleware\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\lodash.defaultsdeep\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\lilconfig\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\loader-runner\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\lodash.pullall\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\log-update\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\lines-and-columns\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\lodash\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\lodash.memoize\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\loader-utils\\node_modules\\json5\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\locate-path\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\lodash.kebabcase\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\lodash.mapvalues\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\lodash.invokemap\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\log-update\\node_modules\\cli-cursor\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\log-update\\node_modules\\onetime\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\log-update\\node_modules\\is-fullwidth-code-point\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\log-update\\node_modules\\wrap-ansi\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\log-update\\node_modules\\string-width\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\log-update\\node_modules\\ansi-regex\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\log-update\\node_modules\\restore-cursor\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\log-update\\node_modules\\mimic-fn\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\log-update\\node_modules\\strip-ansi\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\portfinder\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\object-inspect\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\log-symbols\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\nanoid\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\path-key\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\parent-module\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\path-is-absolute\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\param-case\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\object-assign\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\path-exists\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\portfinder\\node_modules\\debug\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\log-symbols\\node_modules\\supports-color\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\nth-check\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\pascal-case\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\mz\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\p-try\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\log-symbols\\node_modules\\has-flag\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\pkg-dir\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\multicast-dns\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\log-symbols\\node_modules\\color-name\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\picomatch\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\p-retry\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\postcss-reduce-transforms\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\npm-run-path\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\ms\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\log-symbols\\node_modules\\color-convert\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\p-locate\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\parseurl\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\mrmime\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\picocolors\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\normalize-wheel\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\p-limit\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\parse5-htmlparser2-tree-adapter\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\module-alias\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\log-symbols\\node_modules\\chalk\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\path-type\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\p-finally\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\normalize-url\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\postcss-reduce-initial\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\lodash.uniqby\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\mkdirp\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\normalize-range\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\log-symbols\\node_modules\\ansi-styles\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\path-to-regexp\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\parse5-htmlparser2-tree-adapter\\node_modules\\parse5\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\lodash.uniq\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\mime-types\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\normalize-path\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\minimatch\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\path-parse\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\minipass\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\mime-db\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\ora\\node_modules\\supports-color\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\minimalistic-assert\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\mimic-fn\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\mime\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\ora\\node_modules\\has-flag\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\postcss-modules-extract-imports\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\minipass\\node_modules\\yallist\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\minimist\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\ora\\node_modules\\color-name\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\postcss-ordered-values\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\normalize-package-data\\node_modules\\semver\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\ora\\node_modules\\color-convert\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\nice-try\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\no-case\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\postcss-normalize-whitespace\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\ora\\node_modules\\chalk\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\neo-async\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\ora\\node_modules\\ansi-styles\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\negotiator\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\node-releases\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\mini-css-extract-plugin\\node_modules\\ajv-keywords\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\node-forge\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\postcss-minify-params\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\postcss-normalize-url\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\opener\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\on-headers\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\onetime\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\postcss-minify-gradients\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\on-finished\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\postcss-normalize-unicode\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\open\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\object.assign\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\parse-json\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\obuf\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\object-keys\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\parse5\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\postcss-normalize-timing-functions\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\postcss-minify-font-values\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\postcss-discard-empty\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\postcss-colormin\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\postcss-discard-duplicates\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\postcss-normalize-string\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\mini-css-extract-plugin\\node_modules\\json-schema-traverse\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\postcss-discard-comments\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\postcss\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\postcss-loader\\node_modules\\yallist\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\postcss-convert-values\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\postcss-discard-overridden\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\postcss-loader\\node_modules\\semver\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\postcss-normalize-repeat-style\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\postcss-loader\\node_modules\\lru-cache\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\requires-port\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\postcss-normalize-display-values\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\proxy-addr\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\range-parser\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\postcss-normalize-charset\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\require-from-string\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\postcss-normalize-positions\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\randombytes\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\postcss-modules-values\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\require-directory\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\prettier\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\process-nextick-args\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\postcss-value-parser\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\queue-microtask\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\proxy-addr\\node_modules\\ipaddr.js\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\progress-webpack-plugin\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\proxy-from-env\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\pseudomap\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\postcss-svgo\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\punycode\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\regenerator-runtime\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\relateurl\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\regenerate\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\raw-body\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\readdirp\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\regexpu-core\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\regenerator-transform\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\read-pkg-up\\node_modules\\type-fest\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\regenerate-unicode-properties\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\raw-body\\node_modules\\bytes\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\regjsparser\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\source-map-js\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\toidentifier\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\strip-final-newline\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\ssri\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\unpipe\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\shebang-regex\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\to-regex-range\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\strip-eof\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\semver\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\source-map\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\regjsparser\\node_modules\\jsesc\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\to-fast-properties\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\universalify\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\shebang-command\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\strip-ansi\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\string_decoder\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\shallow-clone\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\unicode-property-aliases-ecmascript\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\thunky\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\selfsigned\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\stackframe\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\string-width\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\unicode-match-property-value-ecmascript\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\setprototypeof\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\statuses\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\throttle-debounce\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\select-hose\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\serve-static\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\slash\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\stable\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\tapable\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\unicode-match-property-ecmascript\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\schema-utils\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\sirv\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\serve-index\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\unicode-canonical-property-names-ecmascript\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\supports-preserve-symlinks-flag\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\signal-exit\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\type-is\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\svgo\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\supports-color\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\serve-index\\node_modules\\statuses\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\side-channel\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\serve-index\\node_modules\\setprototypeof\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\type-fest\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\reusify\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\spdx-license-ids\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\serve-index\\node_modules\\ms\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\svgo\\node_modules\\commander\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\tslib\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\shell-quote\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\spdx-expression-parse\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\retry\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\serve-index\\node_modules\\inherits\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\spdx-exceptions\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\serve-index\\node_modules\\http-errors\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\source-map-support\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\tr46\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\spdx-correct\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\serve-index\\node_modules\\depd\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\thenify\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\svg-tags\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\thread-loader\\node_modules\\loader-utils\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\thenify-all\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\restore-cursor\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\safer-buffer\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\resolve-from\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\totalist\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\safe-buffer\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\terser\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\run-parallel\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\send\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\serve-index\\node_modules\\debug\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\terser\\node_modules\\commander\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\terser-webpack-plugin\\node_modules\\schema-utils\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\serialize-javascript\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\update-browserslist-db\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\send\\node_modules\\ms\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\uri-js\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\send\\node_modules\\debug\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\send\\node_modules\\debug\\node_modules\\ms\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\resolve\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\resize-observer-polyfill\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@babel\\helper-define-polyfill-provider\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@babel\\compat-data\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@babel\\helper-plugin-utils\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@babel\\core\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@babel\\helper-environment-visitor\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@babel\\plugin-syntax-optional-chaining\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@babel\\helper-compilation-targets\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@babel\\plugin-transform-numeric-separator\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\ajv-formats\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@babel\\plugin-syntax-async-generators\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@babel\\plugin-syntax-import-meta\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@babel\\plugin-syntax-optional-catch-binding\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@babel\\plugin-transform-nullish-coalescing-operator\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@babel\\plugin-syntax-dynamic-import\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@babel\\plugin-proposal-private-property-in-object\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@babel\\plugin-syntax-object-rest-spread\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@babel\\plugin-syntax-import-attributes\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@babel\\plugin-syntax-decorators\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@babel\\plugin-transform-new-target\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@babel\\plugin-syntax-numeric-separator\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@babel\\plugin-syntax-import-assertions\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@babel\\plugin-syntax-class-static-block\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@babel\\plugin-syntax-export-namespace-from\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@babel\\plugin-syntax-nullish-coalescing-operator\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\ajv-formats\\node_modules\\ajv\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@babel\\plugin-syntax-class-properties\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@babel\\helper-validator-option\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@babel\\plugin-syntax-logical-assignment-operators\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@babel\\plugin-syntax-json-strings\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@babel\\plugin-syntax-jsx\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@babel\\plugin-bugfix-safari-id-destructuring-collision-in-function-expression\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@babel\\plugin-transform-function-name\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@babel\\helper-validator-identifier\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@babel\\plugin-transform-destructuring\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@babel\\helper-string-parser\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@babel\\parser\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@babel\\plugin-transform-for-of\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@babel\\plugin-transform-dynamic-import\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@babel\\plugin-transform-duplicate-keys\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@babel\\plugin-transform-export-namespace-from\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@babel\\plugin-transform-member-expression-literals\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@babel\\plugin-transform-literals\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@babel\\plugin-transform-classes\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@babel\\plugin-transform-logical-assignment-operators\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@babel\\plugin-transform-sticky-regex\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@babel\\plugin-transform-json-strings\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\yargs-parser\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@babel\\plugin-transform-optional-catch-binding\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@babel\\plugin-transform-shorthand-properties\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\yargs\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@babel\\plugin-transform-block-scoped-functions\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@babel\\plugin-transform-arrow-functions\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@babel\\plugin-transform-block-scoping\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@babel\\plugin-transform-parameters\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@babel\\plugin-transform-object-rest-spread\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@babel\\plugin-transform-runtime\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@babel\\plugin-transform-reserved-words\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@babel\\plugin-transform-property-literals\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@babel\\plugin-syntax-top-level-await\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@babel\\plugin-transform-template-literals\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\yaml\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@babel\\plugin-syntax-private-property-in-object\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@babel\\preset-env\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\yallist\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\y18n\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\ws\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\wrappy\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\wrap-ansi\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@vue\\cli-plugin-babel\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@vue\\cli-service\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@vue\\component-compiler-utils\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@vue\\babel-preset-app\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\wrap-ansi\\node_modules\\color-name\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\wrap-ansi\\node_modules\\color-convert\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@vue\\cli-service\\node_modules\\@vue\\vue-loader-v15\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\wrap-ansi\\node_modules\\ansi-styles\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\wildcard\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\which\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\axios\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\whatwg-url\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@vue\\cli-plugin-router\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\bl\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\whatwg-fetch\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\websocket-extensions\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@vue\\cli-shared-utils\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\websocket-driver\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\babel-plugin-polyfill-corejs2\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\babel-plugin-polyfill-regenerator\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\babel-plugin-polyfill-corejs3\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\webpack-virtual-modules\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\webpack-sources\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\webpack-merge\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\cli-highlight\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\webpack-dev-server\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\cliui\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\clipboardy\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\webpack-dev-server\\node_modules\\ws\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\express\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\css-loader\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\webpack-dev-server\\node_modules\\schema-utils\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\dom-converter\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\cross-spawn\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\cssnano-preset-default\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\webpack-dev-server\\node_modules\\json-schema-traverse\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\compression\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\execa\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\cssnano\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\webpack-dev-server\\node_modules\\ajv-keywords\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\cosmiconfig\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\end-of-stream\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\css-minimizer-webpack-plugin\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\webpack-dev-server\\node_modules\\ajv\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\css-minimizer-webpack-plugin\\node_modules\\schema-utils\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\element-ui\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\glob\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\css-minimizer-webpack-plugin\\node_modules\\ajv\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\get-stream\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\faye-websocket\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\inflight\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\html-webpack-plugin\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\hpack.js\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\hpack.js\\node_modules\\readable-stream\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\is-file-esm\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\js-cookie\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\jquery\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\lru-cache\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\postcss-selector-parser\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\webpack-dev-middleware\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\ora\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\mini-css-extract-plugin\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\normalize-package-data\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\webpack-dev-middleware\\node_modules\\schema-utils\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\mini-css-extract-plugin\\node_modules\\ajv\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\mini-css-extract-plugin\\node_modules\\schema-utils\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\node-fetch\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\postcss-minify-selectors\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\once\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\webpack-dev-middleware\\node_modules\\json-schema-traverse\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\postcss-loader\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\postcss-calc\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\postcss-merge-rules\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\postcss-merge-longhand\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\postcss-modules-scope\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\webpack-dev-middleware\\node_modules\\ajv-keywords\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\postcss-modules-local-by-default\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\renderkid\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\postcss-unique-selectors\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\pump\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\pretty-error\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\qs\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\webpack-dev-middleware\\node_modules\\ajv\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\readable-stream\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\read-pkg\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\read-pkg-up\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\vue-loader\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\webpack-bundle-analyzer\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\spdy-transport\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\vue-loader\\node_modules\\supports-color\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\webpack-bundle-analyzer\\node_modules\\escape-string-regexp\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\vue-loader\\node_modules\\has-flag\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\sockjs\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\vue-loader\\node_modules\\color-name\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\vue-loader\\node_modules\\color-convert\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\webpack-bundle-analyzer\\node_modules\\commander\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\thread-loader\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\vue-loader\\node_modules\\chalk\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\thread-loader\\node_modules\\schema-utils\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\vue-loader\\node_modules\\ansi-styles\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\spdy\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\rimraf\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\vue-hot-reload-api\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\sass-loader\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\stylehacks\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\sass\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\terser-webpack-plugin\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\vary\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\utila\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\uuid\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\validate-npm-package-license\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\webpack\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\util-deprecate\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\webpack\\node_modules\\schema-utils\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\utils-merge\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\vue\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\vue-template-compiler\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\vue-template-es2015-compiler\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\wbuf\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\watchpack\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\vuex\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\webidl-conversions\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\vue-style-loader\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\wcwidth\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\vue-router\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\vue-style-loader\\node_modules\\hash-sum\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\webpack-chain\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\yargs\\helpers\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\yaml\\browser\\dist\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\domelementtype\\lib\\esm\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\dom-serializer\\lib\\esm\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\is-file-esm\\test\\fixtures\\type-bad-mjs\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\is-file-esm\\test\\fixtures\\type-bad-js\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\is-file-esm\\test\\fixtures\\type-commonjs-mjs\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\is-file-esm\\test\\fixtures\\type-undefined-mjs\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\is-file-esm\\test\\fixtures\\type-bad-cjs\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\is-file-esm\\test\\fixtures\\type-commonjs-js\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\is-file-esm\\test\\fixtures\\type-undefined-js\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\is-file-esm\\test\\fixtures\\type-module-js\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\is-file-esm\\test\\fixtures\\type-commonjs-cjs\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\is-file-esm\\test\\fixtures\\type-undefined-cjs\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\is-file-esm\\test\\fixtures\\type-module-cjs\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\is-file-esm\\test\\fixtures\\type-module-mjs\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\nanoid\\url-alphabet\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\nanoid\\non-secure\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\nanoid\\async\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\nth-check\\lib\\esm\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\node-forge\\flash\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\tslib\\modules\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\terser\\dist\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\terser\\bin\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\vue\\packages\\compiler-sfc\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\vue\\compiler-sfc\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\resolve\\test\\resolver\\browser_field\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\resolve\\test\\resolver\\baz\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\resolve\\test\\resolver\\symlinked\\package\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\resolve\\test\\resolver\\multirepo\\packages\\package-b\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\resolve\\test\\resolver\\multirepo\\packages\\package-a\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\resolve\\test\\resolver\\multirepo\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\resolve\\test\\resolver\\nested_symlinks\\mylib\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\resolve\\test\\resolver\\false_main\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\resolve\\test\\resolver\\malformed_package_json\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\resolve\\test\\resolver\\incorrect_main\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\resolve\\test\\resolver\\dot_slash_main\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\resolve\\test\\resolver\\dot_main\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\resolve\\test\\resolver\\invalid_main\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\resolve\\test\\module_dir\\zmodules\\bbb\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@babel\\helpers\\scripts\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@babel\\preset-env\\data\\package.json"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\node_modules\\@babel\\runtime\\helpers\\esm\\package.json"
        }
      ],
      "totalFiles": 918
    }
  ]
}
```

</details>
</details>

---

## 🤖 助手 #29 (Agent)

_2026-03-19 16:19:01Z_

**🔧 工具调用** (1 个)

<details>
<summary>🔍 **glob_file_search** — Glob 搜索 "" • 0 个文件</summary>

_状态：completed_

**参数**

```json
{
  "targetDirectory": "c:\\Users\\a2173\\Documents\\WeChat Files\\wxid_5q2ox9w8g7ci22\\FileStorage\\File\\2025-09\\20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-backend",
  "globPattern": "**/application*.yml"
}
```

**结果**

```json
{
  "directories": [
    {
      "absPath": "c:\\Users\\a2173\\Documents\\WeChat Files\\wxid_5q2ox9w8g7ci22\\FileStorage\\File\\2025-09\\20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-backend"
    }
  ]
}
```
</details>

---

## 🤖 助手 #30 (Agent)

_2026-03-19 16:19:01Z_

**🔧 工具调用** (1 个)

<details>
<summary>🔍 **glob_file_search** — Glob 搜索 "" • 0 个文件</summary>

_状态：completed_

**参数**

```json
{
  "targetDirectory": "c:\\Users\\a2173\\Documents\\WeChat Files\\wxid_5q2ox9w8g7ci22\\FileStorage\\File\\2025-09\\20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-backend",
  "globPattern": "**/application*.properties"
}
```

**结果**

```json
{
  "directories": [
    {
      "absPath": "c:\\Users\\a2173\\Documents\\WeChat Files\\wxid_5q2ox9w8g7ci22\\FileStorage\\File\\2025-09\\20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-backend"
    }
  ]
}
```
</details>

---

## 🤖 助手 #31 (Agent)

_2026-03-19 16:19:01Z_

**🔧 工具调用** (1 个)

<details>
<summary>🔧 **ripgrep_raw_search**</summary>

_状态：completed_

**参数**

```json
{
  "pattern": "server\\.port",
  "path": "c:\\Users\\a2173\\Documents\\WeChat Files\\wxid_5q2ox9w8g7ci22\\FileStorage\\File\\2025-09\\20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-backend\\src\\main\\resources",
  "outputMode": "content",
  "caseInsensitive": false,
  "headLimit": 20,
  "multiline": false,
  "toolCallId": "call_u7PGO8iSiySPEKIBBnINWxhI\nfc_0b4c5e510bb8a37b0169bc21f91be481949463ec9b74854bda",
  "offset": 0
}
```

**结果**

```json
{}
```
</details>

---

## 🤖 助手 #32 (Agent)

_2026-03-19 16:19:09Z_

<details>
<summary><strong>💭 思考过程</strong></summary>

> **Investigating server settings**
>
> I’m looking into where to specify the server port, possibly in `application.yml` or `application.properties`. It feels like a simple search might help me pinpoint the right line in the superMarket-backend code. I’ll run a search command for `server\.port` to quickly locate where it's defined. That should streamline the process of making any needed adjustments! Let's make sure everything is set up correctly.

</details>

---

## 🤖 助手 #33 (Agent)

_2026-03-19 16:19:14Z_

刚才我在全量目录里搜 `package.json` 结果太多（主要是 `node_modules`），而 `server.port` 在后端配置里也没命中。接下来我会把搜索范围缩小到 `superMarket-backend` 和 `superMarket-frontend` 的根目录配置文件里，直接找出后端/前端各自启动端口，然后告诉你浏览器该输入哪个网址。

---

## 🤖 助手 #34 (Agent)

_2026-03-19 16:19:14Z_

**🔧 工具调用** (1 个)

<details>
<summary>🔍 **glob_file_search** — Glob 搜索 "" • 0 个文件</summary>

_状态：completed_

**参数**

```json
{
  "targetDirectory": "c:\\Users\\a2173\\Documents\\WeChat Files\\wxid_5q2ox9w8g7ci22\\FileStorage\\File\\2025-09\\20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-backend",
  "globPattern": "superMarket-backend/src/main/resources/application*.{yml,yaml,properties}"
}
```

**结果**

<details>
<summary><em>展开查看结果 / View Result</em></summary>

```json
{
  "directories": [
    {
      "absPath": "c:\\Users\\a2173\\Documents\\WeChat Files\\wxid_5q2ox9w8g7ci22\\FileStorage\\File\\2025-09\\20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-backend",
      "files": [
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-backend\\src\\main\\resources\\application.yaml"
        }
      ],
      "totalFiles": 1
    }
  ]
}
```

</details>
</details>

---

## 🤖 助手 #35 (Agent)

_2026-03-19 16:19:14Z_

**🔧 工具调用** (1 个)

<details>
<summary>🔍 **glob_file_search** — Glob 搜索 "" • 0 个文件</summary>

_状态：completed_

**参数**

```json
{
  "targetDirectory": "c:\\Users\\a2173\\Documents\\WeChat Files\\wxid_5q2ox9w8g7ci22\\FileStorage\\File\\2025-09\\20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发",
  "globPattern": "superMarket-frontend/{package.json,vite.config.* ,vue.config.*}"
}
```

**结果**

<details>
<summary><em>展开查看结果 / View Result</em></summary>

```json
{
  "directories": [
    {
      "absPath": "c:\\Users\\a2173\\Documents\\WeChat Files\\wxid_5q2ox9w8g7ci22\\FileStorage\\File\\2025-09\\20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发",
      "files": [
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\vue.config.js"
        },
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\package.json"
        }
      ],
      "totalFiles": 2
    }
  ]
}
```

</details>
</details>

---

## 🤖 助手 #36 (Agent)

_2026-03-19 16:19:14Z_

**🔧 工具调用** (1 个)

<details>
<summary>🔧 **ripgrep_raw_search**</summary>

_状态：completed_

**参数**

```json
{
  "pattern": "server\\.port|server\\s*:\\s*",
  "path": "c:\\Users\\a2173\\Documents\\WeChat Files\\wxid_5q2ox9w8g7ci22\\FileStorage\\File\\2025-09\\20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-backend\\src\\main\\resources",
  "outputMode": "content",
  "caseInsensitive": false,
  "headLimit": 20,
  "multiline": false,
  "toolCallId": "call_rac4x0Hvk5mlFHehwf5diq2a\nfc_0b4c5e510bb8a37b0169bc2204c9648194b0ad86efcda363d0",
  "offset": 0
}
```

**结果**

```json
{}
```
</details>

---

## 🤖 助手 #37 (Agent)

_2026-03-19 16:19:14Z_

**🔧 工具调用** (1 个)

<details>
<summary>🔧 **ripgrep_raw_search**</summary>

_状态：completed_

**参数**

```json
{
  "pattern": "(5173|8080|8081|3000|devServer|port)",
  "path": "c:\\Users\\a2173\\Documents\\WeChat Files\\wxid_5q2ox9w8g7ci22\\FileStorage\\File\\2025-09\\20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend",
  "outputMode": "content",
  "caseInsensitive": false,
  "headLimit": 20,
  "multiline": false,
  "toolCallId": "call_8MfjasHEVa7VEPEEUxHqw9xj\nfc_0b4c5e510bb8a37b0169bc2204c9748194975b5c856237cfaa",
  "offset": 0
}
```

**结果**

```json
{}
```
</details>

---

## 🤖 助手 #38 (Agent)

_2026-03-19 16:19:35Z_

<details>
<summary><strong>💭 思考过程</strong></summary>

> **Reading configuration files**
>
> I need to be careful here; including the node_modules cache feels too broad. I already have vue.config.js and package.json, so those two are definitely on my list. Also, I should check the backend application's application.yaml. To streamline things, I'll use ReadFile for the paths I need. It seems like a good plan to utilize multi-parallel reads to handle this efficiently. I'll just make sure I’m gathering the right information!

</details>

---

## 🤖 助手 #39 (Agent)

_2026-03-19 16:19:37Z_

我已经找到后端的配置文件 `superMarket-backend/src/main/resources/application.yaml`，以及前端的启动配置 `superMarket-frontend/vue.config.js` 和 `package.json`。接下来我会把这三个文件读出来，直接提取 `server.port`（后端）和 `devServer`/`port`（前端），然后告诉你要在浏览器输入的具体网址。

---

## 🤖 助手 #40 (Agent)

_2026-03-19 16:19:38Z_

**🔧 工具调用** (1 个)

<details>
<summary>🔧 **read_file_v2**</summary>

_状态：completed_

**参数**

```json
{
  "path": "c:\\Users\\a2173\\Documents\\WeChat Files\\wxid_5q2ox9w8g7ci22\\FileStorage\\File\\2025-09\\20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-backend\\src\\main\\resources\\application.yaml"
}
```

**结果**

<details>
<summary><em>展开查看结果 / View Result</em></summary>

```json
{
  "contents": "server:\n  port: 9291\nspring:\n  application:\n    name: market-server\n  datasource:\n    druid:\n      driver-class-name: com.mysql.cj.jdbc.Driver\n      url: jdbc:mysql://localhost:3306/db_market?serverTimezone=UTC&useUnicode=true&characterEncoding=utf-8&useSSL=true\n      username: root\n      password: 123456\n  redis:\n    host: localhost\n    port: 6379\n    password:\n  mvc:\n    async:\n      request-timeout: 20000\nmybatis-plus:\n  mapper-locations: classpath:mapper/*Mapper.xml\nlogging:\n  level:\n    cn.dingli.market.mapper: debug\n\n",
  "totalLinesInFile": 25
}
```

</details>
</details>

---

## 🤖 助手 #41 (Agent)

_2026-03-19 16:19:38Z_

**🔧 工具调用** (1 个)

<details>
<summary>🔧 **read_file_v2**</summary>

_状态：completed_

**参数**

```json
{
  "path": "c:\\Users\\a2173\\Documents\\WeChat Files\\wxid_5q2ox9w8g7ci22\\FileStorage\\File\\2025-09\\20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\vue.config.js"
}
```

**结果**

```json
{
  "contents": "\nconst { defineConfig } = require('@vue/cli-service')\nmodule.exports = defineConfig({\n  transpileDependencies: true\n})\n\nmodule.exports={\n  devServer:{\n    host:\"localhost\",\n    port: 9292\n  },\n}\n\n",
  "totalLinesInFile": 14
}
```
</details>

---

## 🤖 助手 #42 (Agent)

_2026-03-19 16:19:38Z_

**🔧 工具调用** (1 个)

<details>
<summary>🔧 **read_file_v2**</summary>

_状态：completed_

**参数**

```json
{
  "path": "c:\\Users\\a2173\\Documents\\WeChat Files\\wxid_5q2ox9w8g7ci22\\FileStorage\\File\\2025-09\\20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\package.json"
}
```

**结果**

<details>
<summary><em>展开查看结果 / View Result</em></summary>

```json
{
  "contents": "{\n  \"name\": \"supermarket-manager\",\n  \"version\": \"0.1.0\",\n  \"private\": true,\n  \"scripts\": {\n    \"dev\": \"vue-cli-service serve\",\n    \"serve\": \"vue-cli-service serve\",\n    \"build\": \"vue-cli-service build\"\n  },\n  \"dependencies\": {\n    \"axios\": \"^1.3.4\",\n    \"core-js\": \"^3.8.3\",\n    \"jquery\": \"^3.6.4\",\n    \"js-cookie\": \"^3.0.1\",\n    \"qs\": \"^6.11.1\",\n    \"vue\": \"^2.6.14\",\n    \"vue-router\": \"^3.5.1\",\n    \"vuex\": \"^3.6.2\"\n  },\n  \"devDependencies\": {\n    \"@vue/cli-plugin-babel\": \"~5.0.0\",\n    \"@vue/cli-plugin-router\": \"~5.0.0\",\n    \"@vue/cli-plugin-vuex\": \"~5.0.0\",\n    \"@vue/cli-service\": \"~5.0.0\",\n    \"element-ui\": \"^2.15.13\",\n    \"sass\": \"^1.32.7\",\n    \"sass-loader\": \"^12.0.0\",\n    \"vue-template-compiler\": \"^2.6.14\",\n    \"webpack\": \"^5.76.2\"\n  },\n  \"browserslist\": [\n    \"> 1%\",\n    \"last 2 versions\",\n    \"not dead\"\n  ],\n  \"description\": \"## Project setup ``` npm install ```\",\n  \"main\": \"babel.config.js\",\n  \"author\": \"\",\n  \"license\": \"ISC\"\n}\n",
  "totalLinesInFile": 41
}
```

</details>
</details>

---

## 🤖 助手 #43 (Agent)

_2026-03-19 16:19:42Z_

<details>
<summary><strong>💭 思考过程</strong></summary>

> **Reviewing access steps**
>
> I’m looking at the server setup with backend on port 9291 and frontend on port 9292. After running both, the user needs to access `http://localhost:9292/` in their browser. The routes possibly require a specific path, and since it’s a Vue2 project using vue-router, I assume there’s a login page. The user’s question “怎么进入网址” translates to "how to access," so I’ll provide clear steps. I'll check the router mode in the configuration.

</details>

---

## 🤖 助手 #44 (Agent)

_2026-03-19 16:19:44Z_

端口已经明确了：后端 `application.yaml` 是 `9291`，前端 `vue.config.js` 是 `9292`。接下来我再确认一下前端路由是 `hash` 还是 `history` 模式，避免你打开 `http://localhost:9292/` 后看不到登录页；我会读取 `superMarket-frontend/src/router` 的配置。

---

## 🤖 助手 #45 (Agent)

_2026-03-19 16:19:44Z_

**🔧 工具调用** (1 个)

<details>
<summary>🔍 **glob_file_search** — Glob 搜索 "" • 0 个文件</summary>

_状态：completed_

**参数**

```json
{
  "targetDirectory": "c:\\Users\\a2173\\Documents\\WeChat Files\\wxid_5q2ox9w8g7ci22\\FileStorage\\File\\2025-09\\20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发",
  "globPattern": "superMarket-frontend/src/router/**/*.{js,ts}"
}
```

**结果**

<details>
<summary><em>展开查看结果 / View Result</em></summary>

```json
{
  "directories": [
    {
      "absPath": "c:\\Users\\a2173\\Documents\\WeChat Files\\wxid_5q2ox9w8g7ci22\\FileStorage\\File\\2025-09\\20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发",
      "files": [
        {
          "relPath": "../20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\src\\router\\index.js"
        }
      ],
      "totalFiles": 1
    }
  ]
}
```

</details>
</details>

---

## 🤖 助手 #46 (Agent)

_2026-03-19 16:19:49Z_

**🔧 工具调用** (1 个)

<details>
<summary>🔧 **read_file_v2**</summary>

_状态：completed_

**参数**

```json
{
  "path": "c:\\Users\\a2173\\Documents\\WeChat Files\\wxid_5q2ox9w8g7ci22\\FileStorage\\File\\2025-09\\20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\src\\router\\index.js"
}
```

**结果**

<details>
<summary><em>展开查看结果 / View Result</em></summary>

```json
{
  "contents": "import Vue from 'vue'\nimport VueRouter from 'vue-router'\n\nVue.use(VueRouter)\nconst routes = [\n    {\n        path: '/',\n        name: 'login',\n        component: () => import('../views/Login.vue'),\n    },\n    {\n        path: '/index',\n        name: 'index',\n        redirect:'/home',\n        component: () => import('../views/index.vue'),\n        children: [\n            {\n                path: '/home',\n                name: '/home',\n                component: () => import('../views/Home.vue')\n            },\n            {\n                path: '/personal/edit_pwd',\n                name: '/personal/edit_pwd',\n                component: () => import('../views/personal/Edit_pwd.vue')\n            },\n\n            {\n                path: '/personal/information',\n                name: '/personal/information',\n                component: () => import('../views/personal/Information.vue')\n            },\n            {\n                path: '/system/role/list',\n                name: '/system/role/list',\n                component: () => import('../views/system/role/List.vue')\n            },\n            {\n                path: '/system/menu/list',\n                name: '/system/menu/list',\n                component: () => import('../views/system/menu/List.vue')\n            },\n\n            {\n                path: '/inventory_management/store/list',\n                name: '/inventory_management/store/list',\n                component: () => import('../views/inventory_management/store/List.vue')\n            },\n\n            {\n                path: '/inventory_management/detail_store_goods_in/list',\n                name: '/inventory_management/detail_store_goods_in/list',\n                component: () => import('../views/inventory_management/detail_store_goods_in/List.vue')\n            },\n            {\n                path: '/inventory_management/detail_store_goods_out/list',\n                name: '/inventory_management/detail_store_goods_out/list',\n                component: () => import('../views/inventory_management/detail_store_goods_out/List.vue')\n            },\n\n            {\n                path: '/inventory_management/supplier/list',\n                name: '/inventory_management/supplier/list',\n                component: () => import('../views/inventory_management/supplier/List.vue')\n            },\n            {\n                path: '/inventory_management/detail_store_goods_in/notice/list',\n                name: '/inventory_management/detail_store_goods_in/notice/list',\n                component: () => import('../views/inventory_management/detail_store_goods_in/notice/List.vue')\n            },\n            {\n                path: '/inventory_management/detail_store_goods_out/notice/list',\n                name: '/inventory_management/detail_store_goods_out/notice/list',\n                component: () => import('../views/inventory_management/detail_store_goods_out/notice/List.vue')\n            },\n\n            {\n                path: '/inventory_management/store/storage_situation',\n                name: '/inventory_management/store/storage_situation',\n                component: () => import('../views/inventory_management/store/StorageSituation.vue')\n            },\n            {\n                path: '/goods_management/goods_category/list',\n                name: '/goods_management/goods_category/list',\n                component: () => import('../views/goods_management/goods_category/List.vue')\n            },\n            {\n                path: '/goods_management/goods/list',\n                name: '/goods_management/goods/list',\n                component: () => import('../views/goods_management/goods/List.vue')\n            },\n            {\n                path: '/goods_management/goods_store/list',\n                name: '/goods_management/goods_store/list',\n                component: () => import('../views/goods_management/goods_store/List.vue')\n            },\n\n            {\n                path: '/goods_management/statistic_sale/list',\n                name: '/goods_management/statistic_sale/list',\n                component: () => import('../views/goods_management/statistic_sale/List.vue')\n            },\n            {\n                path: '/goods_management/point_products/list',\n                name: '/goods_management/point_products/list',\n                component: () => import('../views/goods_management/point_products/List.vue')\n            },\n            {\n                path: '/personnel_management/dept/list',\n                name: '/personnel_management/dept/list',\n                component: () => import('../views/personnel_management/dept/List.vue')\n            },\n            {\n                path: '/personnel_management/employee/list',\n                name: '/personnel_management/employee/list',\n                component: () => import('../views/personnel_management/employee/List.vue')\n            },\n            {\n                path: '/member_management/member/list',\n                name: '/member_management/member/list',\n                component: () => import('../views/member_management/member/List.vue')\n            },\n\n            {\n                path: '/sale_management/sale_cmd/list',\n                name: '/sale_management/sale_cmd/list',\n                component: () => import('../views/sale_management/sale_cmd/List.vue')\n            },\n\n            {\n                path: '/sale_management/sale_records/list',\n                name: '/sale_management/sale_records/list',\n                component: () => import('../views/sale_management/sale_records/List.vue')\n            },\n\n            {\n                path: '/sale_management/exchange_point_products_records/list',\n                name: '/sale_management/exchange_point_products_records/list',\n                component: () => import('../views/sale_management/exchange_point_products_records/List.vue')\n            },\n\n        ]\n    },\n]\n\nconst router = new VueRouter({\n    mode: \"history\",\n    routes\n})\n\nexport default router\n",
  "totalLinesInFile": 152
}
```

</details>
</details>

---

## 🤖 助手 #47 (Agent)

_2026-03-19 16:19:54Z_

<details>
<summary><strong>💭 思考过程</strong></summary>

> **Checking router settings**
>
> I'm exploring the router mode, which is set to "history" instead of hash. In a development server, I might need to correct the route if there isn't a proper fallback. For vue-cli in history mode, the dev server usually handles fallback. I'll log in at `/`, specifically `http://localhost:9292/`. 
>
> It’s crucial to figure out if the backend has a login endpoint on port 9291 for the UI to function properly, and CORS might be an issue. I'll check `vue.config.js` for the proxy settings next.

</details>

---

## 🤖 助手 #48 (Agent)

_2026-03-19 16:19:56Z_

**🔧 工具调用** (1 个)

<details>
<summary>🔧 **ripgrep_raw_search**</summary>

_状态：completed_

**参数**

```json
{
  "pattern": "9291|baseURL|/login|axios\\.|ajax",
  "path": "c:\\Users\\a2173\\Documents\\WeChat Files\\wxid_5q2ox9w8g7ci22\\FileStorage\\File\\2025-09\\20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\src",
  "outputMode": "content",
  "caseInsensitive": false,
  "headLimit": 50,
  "multiline": false,
  "toolCallId": "call_0gpFORpoKDRCNmbdtuz8B7Ip\nfc_0b4c5e510bb8a37b0169bc2230e1c88194881785b47b385c76",
  "offset": 0
}
```

**结果**

```json
{}
```
</details>

---

## 🤖 助手 #49 (Agent)

_2026-03-19 16:20:01Z_

<details>
<summary><strong>💭 思考过程</strong></summary>

> **Exploring front-end setup**
>
> I'm considering the front-end setup. If there's only a build step with `npm run build`, I think we need to serve that statically and run the backend separately. There might be a mismatch if the browser can't access it. I should check the port and firewall settings. It seems we should use `127.0.0.1` in code, while for the front-end we use localhost:9292 and the backend API at 127.0.0.1:9291. I'll also explore the code files to confirm the paths.

</details>

---

## 🤖 助手 #50 (Agent)

_2026-03-19 16:20:05Z_

我已经确认前端启动端口是 `9292`，并且路由里 `path: '/'` 对应 `Login.vue`。接下来我再检查一下前端请求后端时是否用到了 `127.0.0.1:9291`，这样你如果遇到“页面能进但接口报错”，就能对照端口快速排查。

---

## 🤖 助手 #51 (Agent)

_2026-03-19 16:20:06Z_

**🔧 工具调用** (1 个)

<details>
<summary>🔧 **read_file_v2**</summary>

_状态：completed_

**参数**

```json
{
  "path": "c:\\Users\\a2173\\Documents\\WeChat Files\\wxid_5q2ox9w8g7ci22\\FileStorage\\File\\2025-09\\20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\src\\assets\\js\\common.js",
  "offset": 1,
  "limit": 120
}
```

**结果**

<details>
<summary><em>展开查看结果 / View Result</em></summary>

```json
{
  "contents": "\nimport { getToken } from \"@/assets/js/auth\";\nimport axios from \"axios\";\nimport { Message } from \"element-ui\";\nimport Cookies from \"js-cookie\";\nimport qs from 'qs';\n\n// const prefix_url = \"http://localhost:9291\"\nconst prefix_url = \"http://127.0.0.1:9291\"\n\n/*刷新Cooke的存活时间*/\nfunction refreshCookies() {\n    var token=getToken()\n    if (token){\n        //刷新cookie\n        axios({\n            url:prefix_url+\"/checkedToken\",\n            method:\"GET\",\n            params:{token:token}\n        }).then(res=>{\n            res=res.data\n\n            if (res.code==200){\n                Cookies.set(\"token\", res.data.token, {expires: 1/48})\n                Cookies.set(\"employee\", JSON.stringify(res.data.employee), {expires: 1/48})\n            }\n\n        }).catch(()=>{\n            popup(\"系统正忙\",\"error\")\n        })\n    }\n    return token;\n\n}\n\n/*post请求*/\nexport function ajaxPost(url, param) {\n    return axios({\n        url: prefix_url + url,\n        method: \"POST\",\n        headers:{\n            'token': refreshCookies() //设置token 其中K名要和后端协调好\n        },\n        data: qs.stringify(param)\n    }).catch(() => {\n        popup(\"系统正忙，请稍后访问....\", \"error\")\n\n    })\n}\n/*json请求*/\nexport function ajaxJson(url, param) {\n    return axios({\n        url: prefix_url + url,\n        method: \"POST\",\n        headers:{\n            'Content-Type':'application/json',\n            'token': refreshCookies() //设置token 其中K名要和后端协调好\n        },\n        data: param\n    }).catch(() => {\n        popup(\"系统正忙，请稍后访问....\", \"error\")\n\n    })\n}\n\n/*GET请求*/\nexport function ajaxGet(url, param) {\n    return axios({\n        url: prefix_url + url,\n        method: \"GET\",\n        headers: {\n            'token': refreshCookies() //设置token 其中K名要和后端协调好\n        },\n        params:param\n    }).catch(() => {\n        popup(\"系统正忙，请稍后访问....\", \"error\")\n\n    })\n}\n/*给用户弹出相应的提示*/\nexport function popup(msg, type) {\n    switch (type) {\n        case \"warning\":\n            Message.warning(msg);\n            break;\n        case \"error\":\n            Message.error(msg);\n            break;\n        case \"info\":\n            Message.info(msg);\n            break;\n        default:\n            Message.success(msg);\n    }\n\n}\n",
  "totalLinesInFile": 97
}
```

</details>
</details>

---

## 🤖 助手 #52 (Agent)

_2026-03-19 16:20:06Z_

**🔧 工具调用** (1 个)

<details>
<summary>🔧 **read_file_v2**</summary>

_状态：completed_

**参数**

```json
{
  "path": "c:\\Users\\a2173\\Documents\\WeChat Files\\wxid_5q2ox9w8g7ci22\\FileStorage\\File\\2025-09\\20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\20230210516_张智盛_20230210515_何卫来_20230210520_卓恒_基于SpringBoot和vue框架的超市管理系统开发\\superMarket-frontend\\src\\store\\index.js",
  "offset": 1,
  "limit": 80
}
```

**结果**

```json
{
  "contents": "import Vue from 'vue'\nimport Vuex from 'vuex'\n\nVue.use(Vuex)\n\nexport default new Vuex.Store({\n  state: {\n    BaseApi: \"http://localhost:9291\"\n  },\n  getters: {\n  },\n  mutations: {\n  },\n  actions: {\n  },\n  modules: {\n  }\n})\n",
  "totalLinesInFile": 19
}
```
</details>

---

## 🤖 助手 #53 (Agent)

_2026-03-19 16:20:11Z_

<details>
<summary><strong>💭 思考过程</strong></summary>

> **Instructing through end points**
>
> I'm discussing how to access the backend at 127.0.0.1:9291 and the frontend at 127.0.0.1:9292. The user asked how to enter a URL. I suggest they run both and open the address in a browser, specifically `http://localhost:9292/`. If the user wants to access the backend, I should mention they can use the API instead of the UI. I’ll also note that port issues may prevent access. I’ll respond in Chinese with clear steps and URLs for their convenience.
> **Running the backend application**
>
> I'm considering how to run the backend application using IntelliJ. I might suggest clicking the run option for the main class, BackendApplication, or using the command `mvn -q -DskipTests package` for a more minimal approach. It seems like the goal is to provide straightforward instructions without overwhelming details. So, I’ll keep it simple and concise for easier understanding, ensuring the user can get their application up and running smoothly.

</details>

---

## 🤖 助手 #54 (Agent)

_2026-03-19 16:20:18Z_

前端网站地址在 **9292**，后端接口在 **9291**。你要“进入网址”通常是进前端页面。

1. 启动后端（`superMarket-backend`，端口 `9291`）
2. 启动前端（`superMarket-frontend`，端口 `9292`，`npm run dev` / `npm run serve`）
3. 用浏览器打开下面这个网址进入系统登录页：
- `http://localhost:9292/`
（路由里 `path: '/'` 对应 `Login.vue`）

补充：如果你打开 `http://localhost:9291`，那是后端接口服务，不是前端页面（可能只有接口/返回404，不会看到网站界面）。

---
