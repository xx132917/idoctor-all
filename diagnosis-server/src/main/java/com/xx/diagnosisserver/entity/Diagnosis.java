package com.xx.diagnosisserver.entity;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * 就诊情况
 */
@Data
@ApiModel
public class Diagnosis {

    //private Long id;
    private Long pid;//病人id
    private Long did;//医生id
    private String time;//就诊时间
    private List<String> detaillist;//就诊详细情况扩展
    private List<Map<String,String>> maps;

}
