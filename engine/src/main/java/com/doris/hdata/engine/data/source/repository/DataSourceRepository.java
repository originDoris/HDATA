package com.doris.hdata.engine.data.source.repository;

import com.doris.hdata.common.repository.AbstractCommonRepository;
import com.doris.hdata.engine.data.source.model.Source;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Map;

/**
 * @author: origindoris
 * @Title: DataSourceRepository
 * @Description: 数据源存储库
 * @date: 2022/10/18 10:08
 */
public interface DataSourceRepository extends AbstractCommonRepository<Source, Long> {


    @Query(value = "select * from flow_instance;", nativeQuery = true)
    Map<String, Object> query(String sql);

}
