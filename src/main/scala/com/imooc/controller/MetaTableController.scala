package com.imooc.controller

import com.imooc.domain.MetaTable
import com.imooc.service.MetaTableService
import com.imooc.utils.ResultVOUtil
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.{ModelAttribute, RequestMapping, RequestMethod, RestController}

@RestController
@RequestMapping(Array("/meta/table"))
class MetaTableController @Autowired()(metaTableService: MetaTableService) {

  @RequestMapping(value = Array("/"), method = Array(RequestMethod.POST))
  def save(@ModelAttribute metaTable: MetaTable) = {
    metaTableService.save(metaTable)
    ResultVOUtil.success() // 这里调用的就是java的代码

  }

  @RequestMapping(value = Array("/"),method = Array(RequestMethod.GET))
  def query() = {
    ResultVOUtil.success(metaTableService.query())

  }
}
