package com.manifestcorp.onsrestservice.models;

import org.springframework.data.redis.core.RedisHash;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
@RedisHash("OnsRestModel")
public class OnsRestModel implements Serializable {

    String id;
    String distroCenter;

    public OnsRestModel(){}

    public OnsRestModel(String id, String distroCenter) {
        this.id = id;
        this.distroCenter = distroCenter;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDistroCenter() {
        return distroCenter;
    }

    public void setDistroCenter(String distroCenter) {
        this.distroCenter = distroCenter;
    }
}
