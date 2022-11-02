package com.doris.odata.engine.chart.model.chart.config;

import lombok.Data;

/**
 * @author: origindoris
 * @Title: Plots
 * @Description:
 * @date: 2022/11/2 19:40
 */
@Data
public class Plots extends BaseChartConfig{
    /**
     * 画布的 padding 值，代表图表在上右下左的间距，可以为单个数字 16，或者数组 [16, 8, 16, 8] 代表四个方向，或者开启 auto，由底层自动计算间距。
     */
    private String padding;

    /**
     * 图形在 x 方向对应的数据字段名，一般是横向的坐标轴对应的字段。比如：要看不同班级的人数情况，那么班级字段就是对应的 xField。
     */
    private String xField;

    /**
     * 图形在 y 方向对应的数据字段名，一般是纵向的坐标轴对应的字段。比如：要看不同班级的人数情况，那么人数字段就是对应的 yField。
     */
    private String yField;

    /**
     * 图表是否自适应容器宽高。当 autoFit 设置为 true 时，width 和 height 的设置将失效。
     */
    private String autoFit;

    /**
     * 设置图表宽度。
     */
    private String width;

    /**
     * 设置图表高度。
     */
    private String height;
}
