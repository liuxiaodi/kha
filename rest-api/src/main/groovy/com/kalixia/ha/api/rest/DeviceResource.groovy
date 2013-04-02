package com.kalixia.ha.api.rest

import com.kalixia.ha.api.DevicesService
import com.kalixia.ha.model.Device

import javax.inject.Inject
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.PathParam
import javax.ws.rs.Produces

@Path("/devices")
@Produces("application/json")
class DeviceResource {
    @Inject
    private DevicesService service;

    @GET
    @Path("/")
    public List<? extends Device> findAllDevices() {
        def devices = []
        service.findAllDevices().subscribe({ Device device ->
            println device
            devices << device
        })
        return devices
    }

    @GET
    @Path("{id}")
    public Device findDeviceById(@PathParam("id") UUID id) {
        return service.findDeviceById(id).single()
    }

}