package com.baidu.mapapi.utils.bean;

import com.baidu.mapapi.model.LatLng;

public class OpenNaviOptionBean {
    /**
     * 导航起点， 经纬度坐标
     */
    public LatLng startCoord;

    /**
     * 导航起点名称
     */
    public String startName;

    /**
     * 导航终点， 经纬度坐标
     */
    public LatLng endCoord;

    /**
     * 导航终点名称
     */
    public String endName;

    /**
     * 调起导航类型
     */
    public int naviType;

    /**
     * 调起百度地图客户端失败后，打开网页版百度地图
     */
    public boolean isSupportWeb;

    /**
     * 起点poiid 在已知起点POI的uid情况下，请尽量填写uid，将提升路线规划的准确性
     */
    public String startUid;

    /**
     * 终点poiid 在已知起点POI的uid情况下，请尽量填写uid，将提升路线规划的准确性
     */
    public String endUid;
}
